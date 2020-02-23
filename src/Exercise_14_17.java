import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Exercise_14_17 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        Polyline polyline1 = new Polyline();
        pane.getChildren().add(polyline1);
        polyline1.setStroke(Color.BLACK);
        ObservableList<Double> list = polyline1.getPoints();
        double x1 = 40.0;
        double y1 = 190.0;
        double y2 = 20.0;
        double x3 = 125.0;
        list.addAll(x1, y1, x1, y2, x3, y2, x3, y1 * 0.6);

        Polyline polyline2 = new Polyline();
        pane.getChildren().add(polyline2);
        polyline2.setStroke(Color.BLACK);
        ObservableList<Double> list2 = polyline2.getPoints();
        list2.addAll((x1 + x3) * 0.5, y1 * 0.5, x3, y1 * 0.25, x3 + (x3 - x1) * 0.5, y1 * 0.5);

        Polyline polyline3 = new Polyline();
        pane.getChildren().add(polyline3);
        polyline3.setStroke(Color.BLACK);
        ObservableList<Double> list3 = polyline3.getPoints();
        list3.addAll((x1 + x3) * 0.6, y1 * 0.8, x3, y1 * 0.6, x3 + (x3 - x1) * 0.3, y1 * 0.8);

        Circle circle = new Circle(x3, y1 * 0.25, 15);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        Arc arc = new Arc(x1, y1 + 1, 25, 15, 0, 180);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        pane.getChildren().add(arc);

        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}
