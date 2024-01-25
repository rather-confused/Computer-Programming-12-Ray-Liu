package com.example.idkproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public Label lblName;
    public TextField textName;

    public void getName() {
        String name = textName.getText();
        Item item = new Item(name);
        listItem.getItems
    }

    public void getNum() {
        int num = Integer.parseInt(textName.getText());
        lblName.setText(num + ""); 
    }
}