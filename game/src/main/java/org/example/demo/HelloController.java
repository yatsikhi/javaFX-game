package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private ImageView image;

    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText1;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        int randomNumber = (int) (Math.random() * 6);
        welcomeText.setText(String.valueOf(randomNumber + 1));
        int randomNumber1 = (int) (Math.random() * 6);
        welcomeText1.setText(String.valueOf(randomNumber1 + 1));
    }

}
