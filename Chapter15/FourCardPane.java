/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

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
public class FourCardPane extends HBox {

    static ArrayList<Image> cards = new ArrayList<>();

    public FourCardPane() {
        setPadding(new Insets(5, 5, 5, 5));
        makeDeck();
        shuffleDeck();
        for (int c = 1; c <= 4; c++) {
            getChildren().add(new ImageView(cards.get(c)));
        }
    }

    public void refresh() {
        shuffleDeck();
        getChildren().clear();
        for (int c = 1; c <= 4; c++) {
            getChildren().add(new ImageView(cards.get(c)));
        }
    }

    private static void makeDeck() {
        for (int c = 1; c <= 52; c++) {
            cards.add(new Image("images/cards/" + c + ".png"));
        }
    }

    private static void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
