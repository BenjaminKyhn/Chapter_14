import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Listing_14_4 extends Application{
    @Override
    public void start(Stage primaryStage){
        //Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        //Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        //Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
