package com.mycompany.javafxtexts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TextController {

    @FXML
    private TextField Text1;

    @FXML
    private TextField Text2;

    @FXML
    void CambiarT1(ActionEvent event) {

        Text1.setText("Tener amigos como ustedes es como un import en Python: indispensable en mi vida.");
        
    }

    @FXML
    void CambiarT2(ActionEvent event) {

        Text2.setText("Si encuentras un error, toma un respiro, ajusta tu logica y vuelve a intentarlo.");
    }

}

