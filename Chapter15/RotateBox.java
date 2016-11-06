/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

/**
 *
 * @author Java
 */
public class RotateBox extends Application {
    
private RotateBoxPane rotateBoxPane = new RotateBoxPane();

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(5, 5, 5, 5));
        vBox.setAlignment(Pos.CENTER);

        Button btRotate = new Button("Rotate");

        vBox.getChildren().addAll(rotateBoxPane, btRotate);

        //make handler
        btRotate.setOnAction(e -> rotateBoxPane.rotate());

        Scene scene = new Scene(vBox);
        primaryStage.setTitle("Rotate This Box!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
