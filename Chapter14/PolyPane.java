/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Line;

/**
 *
 * @author Java
 */
public class PolyPane extends Pane {

    public PolyPane() {
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add((double) x);
            list.add(-1 * scaleFactor * x * x);
        }
        polyline.translateXProperty().set(200);
        polyline.translateYProperty().set(150);
        getChildren().add(polyline);

        drawArrowLine(0, 150, 400, 150, this);
        drawArrowLine(200, 200, 200, 0, this);

    }

    public static void drawArrowLine(double X1, double Y1, double X2,
            double Y2, Pane pane) {
        double angle = 30;

        pane.getChildren().add(new Line(X1, Y1, X2, Y2)); //draw main line

        double length = Math.sqrt((X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2));
        double headLength = 0.10 * length;
        double slope = ((Y1 - Y2) / (X1 - X2));
        System.out.println(slope);

        double angleInRads = Math.atan(slope);
        System.out.println(angleInRads);

        double set30 = (X1 > X2 || (X1 == X2 && Y1 > Y2)) ? (Math.PI / 6)
                : (7 * Math.PI / 6);

        pane.getChildren().add(new Line(X2, Y2, (X2 + (Math.cos(angleInRads + set30)
                * headLength)), (Y2 + Math.sin(angleInRads + set30) * headLength)));

        pane.getChildren().add(new Line(X2, Y2, (X2 + (Math.cos(angleInRads - set30)
                * headLength)), (Y2 + Math.sin(angleInRads - set30) * headLength)));

    }
}
