package pkg11_kitchentimer;


import javafx.application.Application;
import javafx.stage.Stage;


/**
 *
 * @author Borislav Sabev s4726863, Austin Atchley s1016930
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        (new View(primaryStage)).fillStage();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
