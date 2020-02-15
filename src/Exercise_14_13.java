import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Exercise_14_13 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        // Create a pane
        Pane pane = new Pane();

        double[] marketShare = {20, 26, 28, 26};

        String[] company = {"Apple", "HTC", "Samsung", "Others"};

        // Create four text objects
        Text t1 = new Text(110, 80,  company[0] + " -- " + marketShare[0] + "%");
        Text t2 = new Text(80, 15,   company[1] + " -- " + marketShare[1] + "%");
        Text t3 = new Text(5, 100,   company[2] + " -- " + marketShare[2] + "%");
        Text t4 = new Text(100, 180, company[3] + " -- " + marketShare[3] + "%");

        // Create four Arcs
        Arc arc1 = new Arc(100, 100, 80, 80, 0, 360 * (marketShare[0] / 100));
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(100, 100, 80, 80, arc1.getStartAngle() +
                arc1.getLength(), 360 * (marketShare[1] / 100));
        arc2.setFill(Color.BLUE);
        arc2.setType(ArcType.ROUND);

        Arc arc3 = new Arc(100, 100, 80, 80, arc2.getStartAngle() +
                arc2.getLength(), 360 * (marketShare[2] / 100));
        arc3.setFill(Color.GREEN);
        arc3.setType(ArcType.ROUND);

        Arc arc4 = new Arc(100, 100, 80, 80, arc3.getStartAngle() +
                arc3.getLength(), 360 * (marketShare[3] / 100));
        arc4.setFill(Color.ORANGE);
        arc4.setType(ArcType.ROUND);
        pane.getChildren().addAll(arc1, arc2, arc3, arc4, t1, t2, t3, t4);


        // Create a Scene and place it in the Stage;
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_14_13"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}