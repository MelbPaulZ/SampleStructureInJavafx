package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;

/**
 * Created by Paul on 11/4/17.
 */
public class Page2Controller extends Controller {
    @Override
    protected String getLayoutPath() {
        return "sample2.fxml";
    }

    @FXML public void toPage1(){

        swith(Page1Controller.class);
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        getStage().setTitle("page2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
