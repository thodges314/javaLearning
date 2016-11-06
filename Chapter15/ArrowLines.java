/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class ArrowLines extends Application {

    //starting position
    int xLoc = 250;
    int yLoc = 250;
    Rectangle colorRectangle = new Rectangle(0, 0, 10, 10);
    Color paintColor = Color.BLACK;

    @Override
    public void start(Stage primaryStage) {
        //define only the pane w color rectangle
        colorRectangle.setStroke(paintColor);
        colorRectangle.setFill(paintColor);
        Pane drawPane = new Pane(colorRectangle);

        //define actions
        drawPane.setOnKeyPressed((KeyEvent e) -> {
            switch (e.getCode()) {
                case DOWN: {
                    Line line = new Line(xLoc, yLoc, xLoc, yLoc + 10);
                    line.setStroke(paintColor);
                    line.setStrokeWidth(3);
                    drawPane.getChildren().add(line);
                    yLoc += 10;
                    break;
                }
                case UP: {
                    Line line = new Line(xLoc, yLoc, xLoc, yLoc - 10);
                    line.setStroke(paintColor);
                    line.setStrokeWidth(3);
                    drawPane.getChildren().add(line);
                    yLoc -= 10;
                    break;
                }
                case LEFT: {
                    Line line = new Line(xLoc, yLoc, xLoc - 10, yLoc);
                    line.setStroke(paintColor);
                    line.setStrokeWidth(3);
                    drawPane.getChildren().add(line);
                    xLoc -= 10;
                    break;
                }
                case RIGHT: {
                    Line line = new Line(xLoc, yLoc, xLoc + 10, yLoc);
                    line.setStroke(paintColor);
                    line.setStrokeWidth(3);
                    drawPane.getChildren().add(line);
                    xLoc += 10;
                    break;
                }
                case C: {
                    paintColor = new Color(Math.random(),
                            Math.random(), Math.random(), 1);
                    colorRectangle.setStroke(paintColor);
                    colorRectangle.setFill(paintColor);
                }
            }
        });

        //set stage etc
        Scene scene = new Scene(drawPane, 500, 500);
        primaryStage.setTitle("ArrowLines");
        primaryStage.setScene(scene);
        primaryStage.show();

        drawPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
