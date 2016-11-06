/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Java
 */
public class OKHandlerClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("OK button pressed.");
    }

}
