/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;
//images go in /build/classes/images

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 *
 * @author Java
 */
public class FourImages extends Application {

    @Override
    public void start(Stage primaryStage) {
        Image img1 = new Image("images/girl1.jpg");
        Image img2 = new Image("images/girl2.jpg");
        Image img3 = new Image("images/girl3.jpg");
        Image img4 = new Image("images/girl4.jpg");

        ImageView iView1 = makeView(img1);
        ImageView iView2 = makeView(img2);
        ImageView iView3 = makeView(img3);
        ImageView iView4 = makeView(img4);

        GridPane gPane = new GridPane();
        gPane.add(iView1, 1, 1);
        gPane.add(iView2, 1, 2);
        gPane.add(iView3, 2, 1);
        gPane.add(iView4, 2, 2);

        Scene scene = new Scene(gPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pretty Girls");
        primaryStage.show();
    }

    private ImageView makeView(Image img) {
        ImageView rtnImage = new ImageView(img);
        rtnImage.setFitHeight(300);
        rtnImage.setFitWidth(450);
        return rtnImage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
