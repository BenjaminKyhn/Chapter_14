import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_14_02 extends Application {
    @Override
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.add(new ImageView(new Image(randomImage())), 0, 0);
        pane.add(new ImageView(new Image(randomImage())), 0, 1);
        pane.add(new ImageView(new Image(randomImage())), 0, 2);
        pane.add(new ImageView(new Image(randomImage())), 1, 0);
        pane.add(new ImageView(new Image(randomImage())), 1, 1);
        pane.add(new ImageView(new Image(randomImage())), 1, 2);
        pane.add(new ImageView(new Image(randomImage())), 2, 0);
        pane.add(new ImageView(new Image(randomImage())), 2, 1);
        pane.add(new ImageView(new Image(randomImage())), 2, 2);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String randomImage(){
        int randomNumber = (int)(Math.random()*3);
        switch (randomNumber){
            case 0: return "image/x.png";
            case 1: return "image/o.png";
            case 2: return "image/empty.png";
        }
        return null;
    }
}
