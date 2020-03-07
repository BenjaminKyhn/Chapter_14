import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_14_25 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox pane = new HBox(10);

        ClockPane clock1 = new ClockPane(4, 20, 15);
        ClockPane clock2 = new ClockPane(22, 46, 15);

        pane.getChildren().addAll(clock1, clock2);

        Scene scene = new Scene (pane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}
