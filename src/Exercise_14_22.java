import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_22 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        Circle circle1 = new Circle(Math.random()*300,Math.random()*300, 15);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(Math.random()*300,Math.random()*300, 15);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        Text text1 = new Text(circle1.getCenterX(), circle1.getCenterY(), "1");
        Text text2 = new Text(circle2.getCenterX(), circle2.getCenterY(), "2");
        pane.getChildren().addAll(line, circle1, circle2, text1, text2);

        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
