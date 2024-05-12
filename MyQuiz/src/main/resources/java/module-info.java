module com.example.myquiz {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.myquiz to javafx.fxml;
    exports com.example.myquiz;
}