import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_18 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane1 = new Pane();
        pane1.setRotate(180); // Rotate the pane by 180 degrees because the cube function is inversed
        pane1.setPadding(new Insets(72, 0, 0, 75));
        Pane pane2 = new Pane();

        Polyline polyline = new Polyline();
        pane1.getChildren().add(polyline);
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(scaleFactor * x * x);
        }

        // Add pane1 to pane2 so we can continue working normally in pane 2 (without the 180 degree rotation)
        pane2.getChildren().add(pane1);

        Line xAxis = new Line(10, 200, 350, 200);
        Line yAxis = new Line(xAxis.getEndX() / 2, 10, xAxis.getEndX() / 2, 350);

//        Polyline arrow1 = new Polyline();
//        ObservableList<Double> arrow1List = polyline.getPoints();
//        arrow1List.addAll(yAxis.getEndX() - 10, yAxis.getEndY() + 20,
//                yAxis.getEndX(), yAxis.getEndY(), yAxis.getEndX() + 10,
//                yAxis.getEndY() + 20);
//
//        Polyline arrow2 = new Polyline();
//        ObservableList<Double> arrow2List = polyline.getPoints();
//        arrow2List.addAll(xAxis.getEndX() - 20, xAxis.getEndY() - 10,
//                xAxis.getEndX(), xAxis.getEndY(), xAxis.getEndX() - 20,
//                xAxis.getEndY() + 10);

        Text textX = new Text(xAxis.getEndX() - 10, xAxis.getEndY() - 20, "X");
        Text textY = new Text(yAxis.getEndX() + 20, yAxis.getStartY() + 10, "Y");
        pane2.getChildren().addAll(textX, textY);

        // Add the lines to pane2
        pane2.getChildren().addAll(xAxis, yAxis);

        Scene scene = new Scene(pane2, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
