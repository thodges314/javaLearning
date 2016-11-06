/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class GridInWindow extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new GridPane(), 200, 200);
        primaryStage.setTitle("Box in a box");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
