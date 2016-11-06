/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;

/**
 *
 * @author Java
 */
public class WordCircle extends Application {

    private static String phrase = "WELCOME TO JAVA";
    private static int numLetters;
    private static double radius;
    private static double incDegrees;

    private static void evaluate() {
        phrase = phrase + " ";
        numLetters = phrase.length();
        incDegrees = 360.0 / numLetters;
        radius = (26.0 * numLetters) / (2 * Math.PI);
    }

    @Override
    public void start(Stage primaryStage) {
        Label pLetters[] = new Label[numLetters];

        //Label labelTemp = new Label();
        Pane pane = new Pane();
        double pSize = 2 * radius + 90;
        pane.setMinSize(pSize, pSize);

        for (int l = 0; l < numLetters; l++) {
            double angleD = l * incDegrees + 180;
            double angleR = Math.toRadians(angleD);
            pLetters[l] = new Label();
            pLetters[l].setText(String.valueOf(phrase.charAt(l)));
            pLetters[l].setFont(Font.font("Janson SSi", FontWeight.BOLD, 20));
            pLetters[l].setRotate(angleD - 90);
            double xLoc = -1 * radius * Math.cos(angleR) + radius + 30;
            double yLoc = -1 * radius * Math.sin(angleR) + radius + 30;
            pLetters[l].setTranslateX(xLoc);
            pLetters[l].setTranslateY(yLoc);

            pane.getChildren().add(pLetters[l]);

        }

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        evaluate();
        launch(args);
    }

}
