import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Listing_14_7 extends Application {
    @Override
    public void start(Stage primaryStage){
        //Create a scene and place a button in the scene
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue;");
        pane.getChildren().add(btOK);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200, 500);
        primaryStage.setTitle("NodeStyleRotateDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
