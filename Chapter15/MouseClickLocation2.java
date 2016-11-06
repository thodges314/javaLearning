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
public class MouseClickLocation2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //set text and pane
        Text location = new Text();
        Pane pane = new Pane(location);

        //tell what to do on press/ release
        pane.setOnMousePressed(e -> {
            location.setText("(" + e.getSceneX() + "," + e.getSceneY() + ")");
            location.setX(e.getSceneX());
            location.setY(e.getSceneY());
        });
        pane.setOnMouseReleased( e-> {
            location.setText("");
        });

        //set stage etc.
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("MouseClickLocation2");
        primaryStage.setScene(scene);
        primaryStage.show();

        //set focus on pane
        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}