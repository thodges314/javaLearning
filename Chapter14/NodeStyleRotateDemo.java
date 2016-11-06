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
public class NodeStyleRotateDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        //define a rotation degree 
        int rotate = (int) (Math.random() * 360);

        //create a scene w/ a button
        StackPane pane = new StackPane();
        Button btOK = new Button("" + rotate);
        btOK.setStyle("-fx-border-color: blue; -fx-background-color: black;"
                + "-fx-text-fill: white;");
        pane.getChildren().add(btOK);

        pane.setRotate(rotate);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("NodeStyleRotateDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
