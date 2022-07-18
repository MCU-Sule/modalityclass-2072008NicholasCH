module com.example.pt03_2072008 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pt03_2072008 to javafx.fxml;
    exports com.example.pt03_2072008;
    exports com.example.pt03_2072008.model;
    opens com.example.pt03_2072008.model to javafx.fxml;
    exports com.example.pt03_2072008.controller;
    opens com.example.pt03_2072008.controller to javafx.fxml;
}