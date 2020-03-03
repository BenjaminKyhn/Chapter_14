import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_20 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane pane = new AnchorPane();
        double startX = Math.random() * 200;
        double startY = Math.random() * 200;
        double endX = Math.random() * 200;
        double endY = Math.random() * 200;

        drawArrowLine(startX, startY, endX, endY, pane);

        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
        Line line = new Line(startX, startY, endX, endY);
        pane.getChildren().add(line);
    }
}
