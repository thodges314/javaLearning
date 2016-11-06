/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class Example14_4 extends Application {
    public Example14_4() {
        System.out.println("Test constructor is envoked.");
    }
    
    @Override
    public void start(Stage primaryStage) {
        System.out.println("start method is invoked.");
    }
    
    public static void main(String[] args) {
        System.out.println("launch application");
        launch(args);
    }
    
}
