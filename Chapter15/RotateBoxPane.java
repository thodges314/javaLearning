/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Java
 */
public class RotateBoxPane extends StackPane {

    private Rectangle rectangle = new Rectangle(50 * 1.618, 50);

    public RotateBoxPane() {
        setMinHeight(100);
        setMinWidth(100);
        getChildren().add(rectangle);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(null);
    }

    public void rotate() {
        rectangle.setRotate(rectangle.getRotate() + 15);
    }

}
