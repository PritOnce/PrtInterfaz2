module com.example.prtinterfaz2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prtinterfaz2 to javafx.fxml;
    exports com.example.prtinterfaz2;
}