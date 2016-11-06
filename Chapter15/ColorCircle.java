/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class ColorCircle extends Application {

    @Override
    public void start(Stage primaryStage) {
        //make stackpane with circle
        StackPane sPane = new StackPane();
        Circle circle = new Circle(30);
        sPane.getChildren().add(circle);

        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        //mouse button events
        sPane.setOnMousePressed(e -> circle.setFill(Color.BLACK));
        sPane.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        //make stage etc
        Scene scene = new Scene(sPane, 80, 80);
        primaryStage.setTitle("ColorCircle");
        primaryStage.setScene(scene);
        primaryStage.show();

        //request focus
        sPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
