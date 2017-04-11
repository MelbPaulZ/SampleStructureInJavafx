package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FuckApplication.getInstance().setStage(primaryStage);

        Parent root = new Pane();
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.getScene().setRoot(root);

        primaryStage.show();

        Controller index = Config.lauchConroller.newInstance();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
