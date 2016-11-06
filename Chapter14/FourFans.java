/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

/**
 *
 * @author Java
 */
public class FourFans extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);
        for (int h = 0; h < 2; h++) {
            for (int v = 0; v < 2; v++) {
                Pane lPane = new Pane();
                Circle circle = new Circle(100, 100, 100);
                circle.setStroke(Color.BLACK);
                circle.setFill(null);
                lPane.getChildren().add(circle);
                for (int b = 0; b < 4; b++) {
                    Arc blade = new Arc(100, 100, 80, 80, 25 + 90 * b, 40);
                    blade.setType(ArcType.ROUND);
                    blade.setFill(Color.BLACK);
                    blade.setStroke(Color.BLACK);
                    lPane.getChildren().add(blade);

                }
                pane.add(lPane, h, v);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Fans");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
