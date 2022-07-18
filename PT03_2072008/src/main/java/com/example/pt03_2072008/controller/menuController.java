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

public class menuController {
    private ObservableList <item> oList;
    private Stage stage;
    @FXML
    public ListView lView;
    @FXML
    public Button button;
    @FXML
    private FXMLLoader loader;

    public void initialize(){
        oList = FXCollections.observableArrayList(
                new item("Caramel Machiato", 56000F, 0.0F),
                new item("Cofee Late", 46000F, 0.2F)

        );
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        lView.setItems(oList);
    }

    public void addNewMenu() throws IOException {
        loader = new FXMLLoader(HelloApplication.class.getResource("addMenu-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Add New Menu");
        stage.setScene(scene);
        stage.showAndWait();
        addController addMenu = loader.getController();
        oList.add(new item(addMenu.getMenuNama(), addMenu.getMenuHarga(), addMenu.getMenuDiskon()));
    }

}
