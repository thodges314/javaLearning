/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Java
 */
public class ShapePane extends Pane {

    Text text = new Text();

    public ShapePane(int height, int width, Shape shape, String name) {
        //set up pane
        setMinHeight(height);
        setMinWidth(width);
        getChildren().add(shape);
        getChildren().add(text);

        setOnMouseMoved((MouseEvent e) -> {
            Double X = e.getSceneX();
            Double Y = e.getSceneY();
            text.setX(X);
            text.setY(Y);
            if (shape.contains(X, Y)) {
                text.setText(X + ", " + Y + " is inside the " + name + ".");
            } else {
                text.setText(X + ", " + Y + " is outside the " + name + ".");
            }
        });

        requestFocus();
    }

}
