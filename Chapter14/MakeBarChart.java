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
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

/**
 *
 * @author Java
 */
public class MakeBarChart extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox fPane = new HBox();
        fPane.setPadding(new Insets(5, 5, 5, 5));
        fPane.setSpacing(5);

        fPane.getChildren().add(oneBar(20, "Project", Color.RED));
        fPane.getChildren().add(oneBar(10, "Quiz", Color.BLUE));
        fPane.getChildren().add(oneBar(30, "MidTerm", Color.GREEN));
        fPane.getChildren().add(oneBar(40, "Final", Color.ORANGE));

        Scene scene = new Scene(fPane);
        primaryStage.setTitle("Grade breakdown.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static Pane oneBar(int prcnt, String title, Color clr) {
        Pane returnPane = new Pane();
        returnPane.setPrefSize(100, 120);
        Rectangle thisBar = new Rectangle(0, 120 - prcnt, 100, prcnt);
        thisBar.setFill(clr);
        thisBar.setStroke(clr);
        returnPane.getChildren().add(thisBar);

        Text thisTitle = new Text(0, 110 - prcnt, title + " -- " + prcnt + "%");
        returnPane.getChildren().add(thisTitle);

        return returnPane;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
