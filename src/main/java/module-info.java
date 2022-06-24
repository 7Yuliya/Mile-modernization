module com.example.mile7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mile7 to javafx.fxml;
    exports com.example.mile7;
}