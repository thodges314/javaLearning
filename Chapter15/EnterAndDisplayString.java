/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

/**
 *
 * @author Java
 */
public class EnterAndDisplayString extends Application {

    String stringInput = "";
    Text textDisplay = new Text(20, 20, "");

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane(textDisplay);

        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                textDisplay.setText(stringInput);
                stringInput = "";
            } else if (e.getCode() == KeyCode.SPACE) {
                stringInput += " ";
            } else if (Character.isLetterOrDigit(e.getText().charAt(0))) {
                stringInput += e.getText();
            }
        });

        primaryStage.setTitle("EnterAndDisplayString");
        primaryStage.setScene(new Scene(pane, 30, 70));
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
