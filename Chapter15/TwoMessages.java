/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class TwoMessages extends Application {

    Boolean funMessage = true;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "Java is Fun!");

        pane.getChildren().add(text);
        pane.setOnMouseClicked(e -> {
            if (funMessage) {
                text.setText("Java is powerful.");
                funMessage = false;
            } else {
                text.setText("Jave is fun.");
                funMessage = true;
            }

        });
        //create scene and stage etc
        Scene scene = new Scene(pane, 120, 30);
        primaryStage.setTitle("TwoMessages");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
