/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Java
 */
public class CirclePane extends StackPane {
    
    private Circle circle = new Circle(50);
    
    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);
    }
    
    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }
    
    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2
                : circle.getRadius());
    }
    
    public void color() {
        Color color = new Color(Math.random(), Math.random(), Math.random(),
                Math.random());
        circle.setFill(color);
        circle.setStroke(color);
    }
    
}
