/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Insets;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Java
 */
public class ThreeCards extends Application {

    static ArrayList<Image> cards = new ArrayList<>();

    private static void makeDeck() {
        for (int c = 1; c <= 52; c++) {
            cards.add(new Image("images/cards/" + c + ".png"));
        }
    }

    private static void shuffleDeck() {
        Collections.shuffle(cards);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox();
        pane.setPadding(new Insets(5, 5, 5, 5));
        for (int c = 1; c <= 3; c++) {
            pane.getChildren().add(new ImageView(cards.get(c)));
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Three Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        makeDeck();
        shuffleDeck();
        launch(args);
    }

}
