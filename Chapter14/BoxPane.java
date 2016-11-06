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
public class BoxPane extends Pane {

    public BoxPane() {
        Rectangle face1 = new Rectangle();
        face1.xProperty().bind(widthProperty().multiply(0.05));
        face1.yProperty().bind(heightProperty().multiply(0.05));
        face1.widthProperty().bind(widthProperty().multiply(0.65));
        face1.heightProperty().bind(heightProperty().multiply(0.65));
        face1.setStroke(Color.BLACK);
        face1.setFill(null);
        getChildren().add(face1);

        Rectangle face2 = new Rectangle();
        face2.xProperty().bind(widthProperty().multiply(0.3));
        face2.yProperty().bind(heightProperty().multiply(0.3));
        face2.widthProperty().bind(widthProperty().multiply(0.65));
        face2.heightProperty().bind(heightProperty().multiply(0.65));
        face2.setStroke(Color.BLACK);
        face2.setFill(null);
        getChildren().add(face2);

        Line edge1 = new Line();
        edge1.startXProperty().bind(widthProperty().multiply(0.05));
        edge1.startYProperty().bind(heightProperty().multiply(0.05));
        edge1.endXProperty().bind(widthProperty().multiply(0.3));
        edge1.endYProperty().bind(heightProperty().multiply(0.3));
        edge1.setStroke(Color.BLACK);
        getChildren().add(edge1);

        Line edge2 = new Line();
        edge2.startXProperty().bind(widthProperty().multiply(0.7));
        edge2.startYProperty().bind(heightProperty().multiply(0.05));
        edge2.endXProperty().bind(widthProperty().multiply(0.95));
        edge2.endYProperty().bind(heightProperty().multiply(0.3));
        edge2.setStroke(Color.BLACK);
        getChildren().add(edge2);

        Line edge3 = new Line();
        edge3.startXProperty().bind(widthProperty().multiply(0.05));
        edge3.startYProperty().bind(heightProperty().multiply(0.7));
        edge3.endXProperty().bind(widthProperty().multiply(0.3));
        edge3.endYProperty().bind(heightProperty().multiply(0.95));
        edge3.setStroke(Color.BLACK);
        getChildren().add(edge3);

        Line edge4 = new Line();
        edge4.startXProperty().bind(widthProperty().multiply(0.7));
        edge4.startYProperty().bind(heightProperty().multiply(0.7));
        edge4.endXProperty().bind(widthProperty().multiply(0.95));
        edge4.endYProperty().bind(heightProperty().multiply(0.95));
        edge4.setStroke(Color.BLACK);
        getChildren().add(edge4);
    }

}
