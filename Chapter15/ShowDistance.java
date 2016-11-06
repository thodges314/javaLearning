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
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import javafx.scene.input.MouseButton;

/**
 *
 * @author Java
 */
public class ShowDistance extends Application {

    Pane pane = new Pane();
    Circle c1 = new Circle(40, 40, 10);
    Circle c2 = new Circle(120, 150, 10);
    Line line = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(),
            c2.getCenterY());
    Text distance = new Text((c1.getCenterX() + c2.getCenterX()) / 2,
            (c1.getCenterY() + c2.getCenterY()) / 2,
            ((int) Math.sqrt(Math.pow(c2.getCenterX() - c1.getCenterX(), 2)
                    + Math.pow(c2.getCenterY() - c1.getCenterY(), 2)) + ""));

    @Override
    public void start(Stage primaryStage) {

        //sort out c1, c2 color
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        c2.setFill(Color.WHITE);

        //put stuff on pane
        pane.getChildren().addAll(line, c1, c2, distance);

        //set mouse events for circles
        c1.setOnMouseDragged(e -> {
            c1.setCenterX(e.getX());
            c1.setCenterY(e.getY());
            line.setStartX(e.getX());
            line.setStartY(e.getY());
            distance.setX((c1.getCenterX() + c2.getCenterX()) / 2);
            distance.setY((c1.getCenterY() + c2.getCenterY()) / 2);
            distance.setText((int) Math.sqrt(Math.pow(c2.getCenterX() - c1.getCenterX(), 2)
                    + Math.pow(c2.getCenterY() - c1.getCenterY(), 2)) + "");
        });
        c2.setOnMouseDragged(e -> {
            c2.setCenterX(e.getX());
            c2.setCenterY(e.getY());
            line.setEndX(e.getX());
            line.setEndY(e.getY());
            distance.setX((c1.getCenterX() + c2.getCenterX()) / 2);
            distance.setY((c1.getCenterY() + c2.getCenterY()) / 2);
            distance.setText((int) Math.sqrt(Math.pow(c2.getCenterX() - c1.getCenterX(), 2)
                    + Math.pow(c2.getCenterY() - c1.getCenterY(), 2)) + "");
        });

        //paint pane
        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("FindDistance");
        primaryStage.setScene(scene);
        primaryStage.show();

        //pane.requestFocus();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
