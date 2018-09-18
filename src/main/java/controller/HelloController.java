package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextArea txtAbout;
    @FXML
    private TextField txtName;
    @FXML
    private Button btnHello;

    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Hello");
        btnHello.setOnAction(event -> sayHello());
    }

    private void sayHello() {
        final String text = txtName.getText();
        final String about = txtAbout.getText();

        System.out.println(text);
        System.out.println(about);
    }
}
