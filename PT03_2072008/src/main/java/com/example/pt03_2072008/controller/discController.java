package com.example.pt03_2072008.controller;

import com.example.pt03_2072008.HelloApplication;
import com.example.pt03_2072008.model.item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.ComboBox;

public class discController {
    @FXML
    private TextField custDiskon;
    private float diskon;

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public void custDiskon(){
        setDiskon((Float.parseFloat(custDiskon.getText())/100));

        custDiskon.getScene().getWindow().hide();
    }
}
