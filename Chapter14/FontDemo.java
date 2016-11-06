/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class FontDemo extends Application {
    @Override
    public void start(Stage pStage) {
        Pane pane = new StackPane();
        
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(.5, .5, .5, .1));
        //pane.getChildren().add(circle);
        
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Janson SSi", FontWeight.BOLD,
                FontPosture.ITALIC, 20));
        //pane.getChildren().add(label);
        
        pane.getChildren().addAll(circle, label);
        
        Scene scene = new Scene(pane);
        pStage.setTitle("Font Demo");
        pStage.setScene(scene);
        pStage.show();
    }
    public static void main(String[] args) {
        System.out.println(Font.getFamilies());
        launch(args);
    }
    
}
