module com.example.supplychainangad17dec {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.supplychainangad17dec to javafx.fxml;
    exports com.example.supplychainangad17dec;
}