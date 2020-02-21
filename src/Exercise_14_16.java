import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_16 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}

class GridPane extends Pane {
    public GridPane(){
        Line line1 = new Line(0, 200/3, 0, 200/3);
        line1.startYProperty().bind(heightProperty().divide(3));
        line1.endYProperty().bind(heightProperty().divide(3));
        line1.startXProperty().bind(widthProperty());
        line1.setStroke(Color.BLUE);

        Line line2 = new Line();
        line2.startYProperty().bind(line1.startYProperty().multiply(2));
        line2.endYProperty().bind(line1.endYProperty().multiply(2));
        line2.startXProperty().bind(widthProperty());
        line2.setStroke(Color.BLUE);

        Line line3 = new Line(200/3, 0, 200/3, 200);
        line3.startXProperty().bind(widthProperty().divide(3));
        line3.endXProperty().bind(widthProperty().divide(3));
        line3.endYProperty().bind(heightProperty());
        line3.setStroke(Color.RED);

        Line line4 = new Line();
        line4.startXProperty().bind(line3.startXProperty().multiply(2));
        line4.endXProperty().bind(line3.endXProperty().multiply(2));
        line4.endYProperty().bind(heightProperty());
        line4.setStroke(Color.RED);

        getChildren().addAll(line1,line2,line3,line4);
    }
}
