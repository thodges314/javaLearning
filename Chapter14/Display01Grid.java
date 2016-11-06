/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class Display01Grid extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);
        for (int h = 0; h < 10; h++) {
            for (int v = 0; v < 10; v++) {
                String numb = (int) (Math.random() * 2) + "";
                TextField txtFld = new TextField();
                txtFld.setPrefColumnCount(1);
                txtFld.setText(numb);
                pane.add(txtFld, h, v);
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("numbers 0 and 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
