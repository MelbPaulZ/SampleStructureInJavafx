package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;

/**
 * Created by Paul on 11/4/17.
 */
public class Page1Controller extends Controller{
    @Override
    protected String getLayoutPath() {
        return "sample.fxml";
    }

    @FXML public void toPage2(){
        swith(Page2Controller.class);
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        getStage().setTitle("page1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
