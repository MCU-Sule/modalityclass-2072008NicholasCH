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

import java.io.IOException;

public class addController {
    @FXML
    private TextField namaMenu;
    @FXML
    private TextField hargaMenu;
    private String menuNama;
    private float menuHarga;
    private float menuDiskon;
    @FXML
    private ComboBox cBoxDisc;
    @FXML
    private Button custDisc;
    private FXMLLoader loader;
    private Stage stage;

    private ObservableList <Float> oList;

    public void initialize(){
        oList = FXCollections.observableArrayList(
                0.0F,
                0.1F,
                0.2F,
                0.3F,
                0.4F,
                0.5F,
                0.6F,
                0.7F,
                0.8F,
                0.9F
        );
        cBoxDisc.setItems(oList);
        cBoxDisc.getSelectionModel().select(0);
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
    }

    public String getMenuNama() {
        return menuNama;
    }

    public void setMenuNama(String menuNama) {
        this.menuNama = menuNama;
    }

    public Float getMenuHarga() {
        return menuHarga;
    }

    public void setMenuHarga(Float menuHarga) {
        this.menuHarga = menuHarga;
    }

    public Float getMenuDiskon() {
        return menuDiskon;
    }

    public void setMenuDiskon(Float menuDiskon) {
        this.menuDiskon = menuDiskon;
    }

    public void add(){
        setMenuNama(namaMenu.getText());
        setMenuHarga(Float.valueOf(hargaMenu.getText()));

        if (custDisc.getText().equalsIgnoreCase("custom discount")){
            setMenuDiskon((Float) cBoxDisc.getValue());
        } else {
            setMenuDiskon(Float.valueOf(custDisc.getText()));
        }
        namaMenu.getScene().getWindow().hide();
    }

    public void customDisk() throws IOException {
        loader = new FXMLLoader(HelloApplication.class.getResource("custDisc-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Custom Discount");
        stage.setScene(scene);
        stage.showAndWait();
        discController discController = loader.getController();
        custDisc.setText(String.valueOf(discController.getDiskon()));
    }
}
