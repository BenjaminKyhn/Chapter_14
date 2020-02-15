import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Exercise_14_08 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        ArrayList<Integer> cards = getCards();

        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                pane.add(new ImageView(new Image("image/card/" + cards.get(count) + ".png")), i, j);
                count++;
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ArrayList<Integer> getCards(){
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 1; i <= 54; i++) {
            c.add(i);
        }
        java.util.Collections.shuffle(c);
        return c;
    }
}
