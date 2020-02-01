import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_04 extends Application {
    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(new MyText(), 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyText extends Pane{
    private void paint(){
        getChildren().clear();
        for (int i = 0; i < 5; i++) {
            Text txt = new Text(60*i,60,"JavaFX");
            txt.setRotate(90);
            txt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
            txt.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            txt.setOpacity(Math.random());
            getChildren().add(txt);
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
