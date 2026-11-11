module com.mycompany.iuwar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.iuwar to javafx.fxml;
    exports com.mycompany.iuwar;
}
