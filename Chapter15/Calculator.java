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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Java
 */
public class Calculator extends Application {

    private TextField tfFirstNumber = new TextField();
    private TextField tfSecondNumber = new TextField();
    private TextField tfResult = new TextField();
    private Button btAdd = new Button("Add");
    private Button btSubtract = new Button("Subtract");
    private Button btMultiply = new Button("Multiply");
    private Button btDivide = new Button("Divide");

    @Override
    public void start(Stage primaryStage) {
        //Create UI
        HBox topLine = new HBox();
        HBox bottomLine = new HBox();
        VBox fullPane = new VBox(topLine, bottomLine);

        topLine.getChildren().add(new Label("Number 1: "));
        topLine.getChildren().add(tfFirstNumber);
        tfFirstNumber.setPrefColumnCount(5);
        topLine.getChildren().add(new Label("Number 2: "));
        topLine.getChildren().add(tfSecondNumber);
        tfSecondNumber.setPrefColumnCount(5);
        topLine.getChildren().add(new Label("Result: "));
        topLine.getChildren().add(tfResult);
        tfResult.setPrefColumnCount(5);
        tfResult.setEditable(false);
        topLine.setAlignment(Pos.CENTER);

        bottomLine.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
        bottomLine.setAlignment(Pos.CENTER);

        //set events
        btAdd.setOnAction(e -> addNumbers());
        btSubtract.setOnAction(e -> subtractNumbers());
        btMultiply.setOnAction(e -> multiplyNumbers());
        btDivide.setOnAction(e -> divideNumbers());

        //create scene and place on stage
        Scene scene = new Scene(fullPane);
        primaryStage.setTitle("Handy Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void addNumbers() {
        tfResult.setText((firstNumber() + secondNumber()) + "");
    }

    private void subtractNumbers() {
        tfResult.setText((firstNumber() - secondNumber()) + "");
    }

    private void multiplyNumbers() {
        tfResult.setText((firstNumber() * secondNumber()) + "");
    }

    private void divideNumbers() {
        tfResult.setText((secondNumber() != 0)
                ? (firstNumber() / secondNumber()) + "" : "TILT");
    }

    private double firstNumber() {
        return Double.parseDouble(tfFirstNumber.getText());
    }

    private double secondNumber() {
        return Double.parseDouble(tfSecondNumber.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }

}
