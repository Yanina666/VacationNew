module com.example.vacationnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vacationnew to javafx.fxml;
    exports com.example.vacationnew;
}