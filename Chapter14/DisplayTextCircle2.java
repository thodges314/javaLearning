/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.*;

/**
 *
 * @author Java
 */
public class DisplayTextCircle2 extends Application {

    private static String phrase = "WELCOME TO JAVA";
    private static Font fnt = Font.font("Janson SSi", FontWeight.BOLD, 20);
    private static int numLetters;
    private static double radius;
    private static double degIncrement;

    private static void evaluate() {
        phrase = phrase + " ";
        numLetters = phrase.length();
        radius = (numLetters * 26.0) / (2.0 * Math.PI);
        degIncrement = 360.0 / numLetters;
    }

    public void start(Stage primaryStage) {
        evaluate();

        Pane pane = new Pane();
        double xPos;
        double yPos;
        double angle;

        for (int l = 0; l < numLetters; l++) {
            angle = l * degIncrement;
            xPos = radius * Math.cos(Math.toRadians(angle)) + radius + 20;
            yPos = radius * Math.sin(Math.toRadians(angle)) + radius + 30;

            Text letter = new Text(xPos, yPos,
                    Character.toString(phrase.charAt(l)));
            letter.setFont(fnt);
            letter.setRotate(angle + 90);

            pane.getChildren().add(letter);
        }

        int size = 2 * (int) radius + 60;
        Scene scene = new Scene(pane, size, size);
        primaryStage.setTitle(phrase);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
