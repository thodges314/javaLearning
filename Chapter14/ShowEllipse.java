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
import javafx.scene.shape.Ellipse;

/**
 *
 * @author Java
 */
public class ShowEllipse extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create pane
        Pane pane = new Pane();

        for (int i = 0; i < 16; i++) {
            //create an ellipse and add it to the pane
            Ellipse e1 = new Ellipse(150, 100, 100, 50);
            e1.setStroke(Color.color(Math.random(), Math.random(),
                    Math.random()));
            e1.setFill(null);
            e1.setRotate(i*180/16);
            pane.getChildren().add(e1);

        }
        
        //create a new scene and put it on stage
        Scene scene = new Scene(pane,300,200);
        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
