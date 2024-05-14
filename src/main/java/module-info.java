module com.example.laboratorul {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laboratorul7 to javafx.fxml;
    exports com.example.laboratorul7;
}