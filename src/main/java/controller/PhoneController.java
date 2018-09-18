package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PhoneController implements Initializable {

    @FXML
    private TextField txtPhone;
    @FXML
    private Button btnHi;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnHi.setOnAction(event -> printPhone());
    }

    private void printPhone() {
        final String phone = txtPhone.getText();
        if (phone.equals("")) {
            return;
        }

        System.out.println(phone);
        txtPhone.setText("Thank you");
    }
}
