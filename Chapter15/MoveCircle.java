/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Java
 */
public class MoveCircle extends Application {
    
    private MoveBallPane moveBallPane = new MoveBallPane();

    @Override
    public void start(Stage primaryStage) {

        //bind functions to key events
        moveBallPane.setOnKeyPressed((KeyEvent e) -> {
            switch (e.getCode()) {
                case DOWN: {
                    moveBallPane.moveDown();
                    break;
                }
                case UP: {
                    moveBallPane.moveUp();
                    break;
                }
                case LEFT: {
                    moveBallPane.moveLeft();
                    break;
                }
                case RIGHT: {
                    moveBallPane.moveRight();
                    break;
                }
            }
        });

        //create pane and put in window
        Scene scene = new Scene(moveBallPane, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        moveBallPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
