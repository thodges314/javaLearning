/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class MouseClickLocation1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //set text and pane
        Text location = new Text();
        Pane pane = new Pane(location);

        //tell what to do on click
        pane.setOnMouseClicked(e -> {
            location.setText("(" + e.getSceneX() + "," + e.getSceneY() + ")");
            location.setX(e.getSceneX());
            location.setY(e.getSceneY());
        });

        //set stage etc.
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("MouseClickLocation1");
        primaryStage.setScene(scene);
        primaryStage.show();

        //set focus on pane
        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
