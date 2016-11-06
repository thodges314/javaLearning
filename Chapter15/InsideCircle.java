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
import javafx.scene.shape.Shape;
import javafx.scene.shape.Circle;

/**
 *
 * @author Java
 */
public class InsideCircle extends Application {

    @Override
    public void start(Stage primaryStage) {
        //define circle shape
        Shape shape = new Circle(100, 60, 50);
        shape.setStroke(Color.BLACK);
        shape.setFill(Color.WHITE);
        String name = "circle";

        //define pane/stage info
        int height = 240;
        int width = 500;

        //make circle pane from shape pane
        Pane shapePane = new ShapePane(height, width, shape, name);

        //put pane on stage etc
        Scene scene = new Scene(shapePane, width, height);
        primaryStage.setTitle("Inside " + name + "?");
        primaryStage.setScene(scene);
        primaryStage.show();

        //shapePane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
