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
import javafx.scene.layout.StackPane;

/**
 *
 * @author Java
 */
public class ButtonInPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create a 'scene' and put a button on the 'stage'
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        pane.getChildren().add(btOK);
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
