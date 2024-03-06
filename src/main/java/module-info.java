module com.example.metodos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metodos to javafx.fxml;
    exports com.example.metodos;
    exports com.example.metodos.vistas;
    opens com.example.metodos.vistas to javafx.fxml;
}