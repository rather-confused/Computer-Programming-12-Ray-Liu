module com.example.idkproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.idkproject to javafx.fxml;
    exports com.example.idkproject;
}