/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

/**
 *
 * @author Java
 */
public class MoveBall extends Application {

    private MoveBallPane moveBallPane = new MoveBallPane();

    @Override
    public void start(Stage primaryStage) {

        //define buttons
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");

        //bind functions to buttons
        btLeft.setOnAction(e -> moveBallPane.moveLeft());
        btRight.setOnAction(e -> moveBallPane.moveRight());
        btUp.setOnAction(e -> moveBallPane.moveUp());
        btDown.setOnAction(e -> moveBallPane.moveDown());

        //define button pane with buttons inside
        HBox buttonPane = new HBox(btLeft, btRight, btUp, btDown);

        //create pane and put in window
        VBox fullPane = new VBox(moveBallPane, buttonPane);
        Scene scene = new Scene(fullPane, 600, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
