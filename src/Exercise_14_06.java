import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.w3c.dom.css.Rect;

public class Exercise_14_06 extends Application {
    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(new MyCheckerBoard(),252,252);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyCheckerBoard extends Pane {
    private void paint(){
        getChildren().clear();
        Rectangle border = new Rectangle(0,0,252,252);
        getChildren().add(border);
        border.setStroke(Color.BLACK);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Rectangle square = new Rectangle(j*25+1, i*25+1, 25, 25);
                if ((i+j) % 2 == 0){
                    square.setFill(Color.WHITE);
                }
                else {
                    square.setFill(Color.BLACK);
                }
                getChildren().add(square);
            }
        }
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height){
        super.setHeight(height);
        paint();
    }
}