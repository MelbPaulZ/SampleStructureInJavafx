package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;

public abstract class Controller {

    private FuckApplication fuckApplication;
    private Stage stage;
    private Parent view;


    public Controller(){
        fuckApplication = FuckApplication.getInstance();
        stage = fuckApplication.getStage();

        init();
    }

    private void init(){
        setContentView(getLayoutPath());
        onCreate();
    }

    protected void setContentView(String url){
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(url));
        try {
            // cannot setController method, otherwise, you cannot specify controller in fxml
            loader.setControllerFactory(controllerClass -> {
                    if (controllerClass != null && !controllerClass.isInstance(Controller.this)) {
                        throw new IllegalArgumentException("Invalid controller instance, expecting instance of class '" +
                                controllerClass.getName() + "'!");
                    }
                    return Controller.this;
                }
            );
            view = loader.load();
            stage.getScene().setRoot(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void swith(Class<? extends Controller> cls){
        onDestroy();

        Controller controller = null;
        try {
            controller = cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        stage.show();

    }


    protected void onCreate(){

    }

    protected void onDestroy(){

    }

    protected abstract String getLayoutPath();

    public FuckApplication getFuckApplication(){
        return this.fuckApplication;
    }

    public Stage getStage(){
        return this.stage;
    }

    public Parent getView(){
        return this.view;
    }


}
