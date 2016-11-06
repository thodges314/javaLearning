/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Java
 */
public class ShowImage extends Application {

    @Override
    public void start(Stage pStage) {
        // make a pane
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("images/us.jpg");
        //Image image = new Image("http://image.blingee.com/images17/content/output/000/000/000/6c6/626996797_429997.gif");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate((int)(Math.random()*360));
        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane);
        pStage.setTitle("ShowImage");
        pStage.setScene(scene);
        pStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
