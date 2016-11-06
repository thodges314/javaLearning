/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

/**
 *
 * @author Java
 */
public class ShowText extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create pane to hold texts
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Text text1 = new Text(20, 20, "Programming is fun!");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,
                15));
        pane.getChildren().add(text1);

        Text text2 = new Text(60, 60,
                "Programming is fun!\nDisplay Text!");
        pane.getChildren().add(text2);

        Text text3 = new Text(10, 100,
                "Programming is fun!\nDisplay Text!");
        text3.setFill(Color.RED);
        text3.setUnderline(true);
        text3.setStrikethrough(true);
        text3.setRotate((int) (Math.random() * 360));
        pane.getChildren().add(text3);

        //create a scene and put it on stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowText");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
