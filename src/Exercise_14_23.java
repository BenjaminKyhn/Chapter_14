import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Exercise_14_23 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter inputs for rectangle1
        System.out.println("Enter the center coordinates for rectangle 1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter the width and height of rectangle 1: ");
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();

        //Prompt the user to enter inputs for rectangle2
        System.out.println("Enter the center coordinates for rectangle 2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Enter the width and height of rectangle 2: ");
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle(x1, y1, width1, height1);
        rectangle1.setStroke(Color.BLACK);
        rectangle1.setFill(Color.WHITE);
        Rectangle rectangle2 = new Rectangle(x2, y2, width2, height2);
        rectangle2.setStroke(Color.BLACK);
        rectangle2.setFill(Color.WHITE);

        String string ="";
        if ((y2 + height2 <= y1 + height1 && x2 + width2 <= x1 + width1 && x2 > x1 && y2 > y1) || (y1 + height1 <= y2 + height2 && x1 + width1 <= x2 + width2 && x1 > x2 && y1 > y2)){
            string = "One rectangle is contained in another";
        }
        else if ((getDistance(x1, x2 + width2) < width1 + width2 && getDistance(y1, y2 + height2) < height1 + height2)){
            string = "The rectangles overlap";
        }
        else {
            string = "The rectangles do not overlap";
        }
        Text text = new Text(10, pane.getHeight()-10, string);

        pane.getChildren().addAll(rectangle1, rectangle2, text);


        primaryStage.show();
    }

    private double getDistance (double p1, double p2){
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}