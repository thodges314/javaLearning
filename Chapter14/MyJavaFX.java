/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class MyJavaFX extends Application {

    @Override       //Override the start method in the Application class
    public void start(Stage primaryStage) {
        //create a scene and place a button int he scene
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);   //place the scene int he stage
        primaryStage.show();    //display the stage
    }

    public static void main(String[] args) {
        launch(args);

    }
}
