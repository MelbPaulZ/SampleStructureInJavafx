package sample;

import javafx.stage.Stage;

/**
 * Created by Paul on 11/4/17.
 */
public class FuckApplication {

    private static FuckApplication fuckApplication;

    private Stage stage;

    private void init(){

    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    public Stage getStage(){
        return this.stage;
    }

    public static FuckApplication getInstance(){
        if(fuckApplication == null){
            fuckApplication = new FuckApplication();
        }

        return fuckApplication;
    }
}
