import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_14_1 extends Application {
    @Override
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));
        pane.setHgap(5);
        pane.setVgap(5);

        Image image1 = new Image("image/flag-of-Afghanistan.png");
        Image image2 = new Image("image/flag-of-Bhutan.png");
        Image image3 = new Image("image/flag-of-Malaysia.png");
        Image image4 = new Image("image/flag-of-Peru.png");
        pane.add(new ImageView(image1),0,0);
        pane.add(new ImageView(image2),0,1);
        pane.add(new ImageView(image3),1,0);
        pane.add(new ImageView(image4),1,1);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
