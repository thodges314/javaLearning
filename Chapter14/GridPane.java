/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

/**
 *
 * @author Java
 */
public class GridPane extends Pane {

    public GridPane() {
        Line horizontal1 = new Line(0, 0, 0, 0);
        horizontal1.startYProperty().bind(heightProperty().multiply(0.33));
        horizontal1.endXProperty().bind(widthProperty());
        horizontal1.endYProperty().bind(heightProperty().multiply(0.33));
        horizontal1.setStrokeWidth(5);
        horizontal1.setStroke(Color.BLUE);
        getChildren().add(horizontal1);

        Line horizontal2 = new Line(0, 0, 0, 0);
        horizontal2.startYProperty().bind(heightProperty().multiply(0.67));
        horizontal2.endXProperty().bind(widthProperty());
        horizontal2.endYProperty().bind(heightProperty().multiply(0.67));
        horizontal2.setStrokeWidth(5);
        horizontal2.setStroke(Color.BLUE);
        getChildren().add(horizontal2);

        Line vertical1 = new Line(0, 0, 0, 0);
        vertical1.startXProperty().bind(widthProperty().multiply(0.33));
        vertical1.endXProperty().bind(widthProperty().multiply(0.33));
        vertical1.endYProperty().bind(heightProperty());
        vertical1.setStrokeWidth(5);
        vertical1.setStroke(Color.RED);
        getChildren().add(vertical1);

        Line vertical2 = new Line(0, 0, 0, 0);
        vertical2.startXProperty().bind(widthProperty().multiply(0.67));
        vertical2.endXProperty().bind(widthProperty().multiply(0.67));
        vertical2.endYProperty().bind(heightProperty());
        vertical2.setStrokeWidth(5);
        vertical2.setStroke(Color.RED);
        getChildren().add(vertical2);

    }
}
