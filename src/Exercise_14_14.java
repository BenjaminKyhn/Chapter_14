import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Exercise_14_14 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Create a rectangle
        Rectangle rectangle1 = new Rectangle(10,50, 125, 100);
        rectangle1.setFill(Color.TRANSPARENT);
        rectangle1.setStroke(Color.BLACK);

        // Create another rectangle
        Rectangle rectangle2 = new Rectangle(30,10, 125, 100);
        rectangle2.setFill(Color.TRANSPARENT);
        rectangle2.setStroke(Color.BLACK);

        // Create 4 lines and connect them to the corners of the two rectangles
        Line line1 = new Line(rectangle2.getX(), rectangle2.getY(),
                rectangle1.getX(), rectangle1.getY());
        Line line2 = new Line(rectangle2.getX() + rectangle2.getWidth(), rectangle2.getY(),
                rectangle1.getX()+rectangle1.getWidth(), rectangle1.getY());
        Line line3 = new Line(rectangle2.getX(), rectangle2.getY() + rectangle2.getHeight(),
                rectangle1.getX(), rectangle1.getY() + rectangle1.getHeight());
        Line line4 = new Line(rectangle2.getX() + rectangle2.getWidth(), rectangle2.getY() + rectangle2.getHeight(),
                rectangle1.getX() + rectangle1.getWidth(), rectangle1.getY() + rectangle1.getHeight());

        // Place nodes in pane
        pane.getChildren().addAll(rectangle1, rectangle2, line1, line2, line3, line4);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}