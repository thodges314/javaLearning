/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class HandleEvent extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create pane and set it's properties
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");

        OKHandlerClass handler1 = new OKHandlerClass(); //create instance of handler class
        btOK.setOnAction(handler1); //register handler instance with button

        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);

        pane.getChildren().addAll(btOK, btCancel);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("HandleEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
