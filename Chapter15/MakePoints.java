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

import javafx.scene.input.MouseButton;

/**
 *
 * @author Java
 */
public class MakePoints extends Application {

    //define Pane
    Pane pane = new Pane();

    public void start(Stage primaryStage) {

        //set mouse events
        pane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                Circle thisCircle = new Circle(e.getX(), e.getY(), 10);
                thisCircle.setStroke(Color.BLACK);
                thisCircle.setFill(Color.WHITE);
                pane.getChildren().add(thisCircle);
            } else if (e.getButton() == MouseButton.SECONDARY) {
                for (int itm = 0; itm < pane.getChildren().size(); itm++) {
                    if (pane.getChildren().get(itm).contains(e.getSceneX(), e.getSceneY())) {
                        pane.getChildren().remove(itm);
                    }
                }
            }
        });

        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("MakePoints");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
