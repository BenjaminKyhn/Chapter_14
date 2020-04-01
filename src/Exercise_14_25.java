import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_14_25 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClockPane clock1 = new ClockPane(4, 20, 15);
        clock1.setWidth(200);
        clock1.setHeight(200);

        ClockPane clock2 = new ClockPane(22, 46, 15);
        clock2.setWidth(200);
        clock2.setHeight(200);

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(clock1, clock2);

        Scene scene = new Scene (hBox);
        stage.setScene(scene);
        stage.show();
    }
}
