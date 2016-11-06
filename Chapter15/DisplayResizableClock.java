/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;
import Chapter14.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class DisplayResizableClock extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create clock and label
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + 
                clock.getSecond();
        Label lblCurrentTime = new Label(timeString);
        
        //place clock in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
        
        //create a scene and place it on stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("DisplayClock");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        pane.widthProperty().addListener(ov -> clock.setW(pane.getWidth()));
        pane.heightProperty().addListener(ov -> clock.setH(pane.getHeight()));
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
