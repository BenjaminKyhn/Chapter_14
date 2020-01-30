import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Listing_14_1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX"); //Set the stage title
        primaryStage.setScene(scene); //Place the scene in the stage
        primaryStage.show(); //Display the stage
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
