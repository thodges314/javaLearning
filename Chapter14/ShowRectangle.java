/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Java
 */
public class ShowRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crrate a pane
        Pane pane = new Pane();

        //Create rectangles and add to pane
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10, 27, "r1"));
        pane.getChildren().add(r1);

        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        pane.getChildren().add(new Text(10, 67, "r2"));
        pane.getChildren().add(r2);

        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        pane.getChildren().add(new Text(10, 107, "r3"));
        pane.getChildren().add(r3);

        //Rectangle r[] = new Rectangle[4];
        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100, 50, 100, 30);
            r = new Rectangle(100, 50, 100, 30);
//interesting that we didn't have to define an array of rectanles
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(),
                    Math.random()));
            r.setFill(null);
            pane.getChildren().add(r);
        }

        //Create a scene and place it on stage
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
