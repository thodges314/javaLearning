/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class PaneStackPaneExperiments extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create four circles
        Circle c1 = new Circle();
        c1.setCenterX(100);
        c1.setCenterY(100);
        c1.setRadius(50);
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.RED);

        Circle c2 = new Circle();
        c2.setCenterX(75);
        c2.setCenterY(120);
        c2.setRadius(50);
        c2.setStroke(Color.GREEN);
        c2.setFill(Color.BLUE);

        Circle c1Copy = new Circle();
        c1Copy.setCenterX(100);
        c1Copy.setCenterY(100);
        c1Copy.setRadius(50);
        c1Copy.setStroke(Color.BLACK);
        c1Copy.setFill(Color.RED);

        Circle c2Copy = new Circle();
        c2Copy.setCenterX(75);
        c2Copy.setCenterY(120);
        c2Copy.setRadius(50);
        c2Copy.setStroke(Color.GREEN);
        c2Copy.setFill(Color.BLUE);
        //pane
        Pane nPane = new Pane();
        nPane.getChildren().addAll(c1, c2);
        //nPane.getChildren().add(c1);

        //stackpane
        StackPane sPane = new StackPane();
        sPane.getChildren().addAll(c1Copy, c2Copy);
        //sPane.getChildren().add(c1Copy);

        Scene nScene = new Scene(nPane, 200, 200);
        Scene sScene = new Scene(sPane, 200, 200);

        Stage stageTwo = new Stage();

        primaryStage.setTitle("Normal Pane");
        primaryStage.setScene(nScene);
        primaryStage.show();

        stageTwo.setTitle("Stack Pane");
        stageTwo.setScene(sScene);
        stageTwo.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
