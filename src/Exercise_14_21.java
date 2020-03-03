import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_21 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        Circle circle1 = new Circle(Math.random()*300,Math.random()*300, 15);
        Circle circle2 = new Circle(Math.random()*300,Math.random()*300, 15);
        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        double sqrt = Math.abs(Math.sqrt(Math.pow(circle2.getCenterX()-circle1.getCenterX(), 2) + Math.pow(circle2.getCenterY()-circle1.getCenterY(), 2)));
        Text text = new Text((circle1.getCenterX()+circle2.getCenterX())/2, (circle1.getCenterY()+circle2.getCenterY())/2, String.valueOf(sqrt));
        pane.getChildren().addAll(circle1, circle2, line, text);

        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
