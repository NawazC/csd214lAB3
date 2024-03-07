module com.example.csd_214_lab_3_nawaz_cho {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csd_214_lab_3_nawaz_cho to javafx.fxml;
    exports com.example.csd_214_lab_3_nawaz_cho;
}