/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import javafx.scene.input.MouseEvent;

/**
 *
 * @author Java
 */
public class InsideCircleFirstAttempt extends Application {

    Circle circle = new Circle(100, 60, 50);
    Text text = new Text();

    @Override
    public void start(Stage primaryStage) {
        //define pane with circle
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        Pane pane = new Pane(circle);
        pane.getChildren().add(text);

        //set mouse events
        pane.setOnMouseMoved((MouseEvent e) -> {
            Double X = e.getX();
            Double Y = e.getY();
            text.setX(X);
            text.setY(Y);
            if (circle.contains(X, Y))  {
                text.setText("Mouse point is in Circle");
            } else {
                text.setText("Mouse point is outside the Circle");
            }
        });
        
        Scene scene = new Scene(pane, 200, 120);
        primaryStage.setTitle("InsideCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
