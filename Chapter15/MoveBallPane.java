/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Java
 */
public class MoveBallPane extends Pane {

    private Circle circle = new Circle(25);

    public MoveBallPane() {
        setMinHeight(300);
        setMinWidth(600);

        getChildren().add(circle);
        circle.setCenterX(300);
        circle.setCenterY(150);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLACK);
    }

    public void moveLeft() {
        circle.setCenterX(circle.getCenterX() > 25 ? circle.getCenterX() - 5
                : circle.getCenterX());
    }

    public void moveRight() {
        circle.setCenterX(circle.getCenterX() < 575 ? circle.getCenterX() + 5
                : circle.getCenterX());
    }

    public void moveUp() {
        circle.setCenterY(circle.getCenterY() > 25 ? circle.getCenterY() - 5
                : circle.getCenterY());
    }

    public void moveDown() {
        circle.setCenterY(circle.getCenterY() < 275 ? circle.getCenterY() + 5
                : circle.getCenterY());
    }

}
