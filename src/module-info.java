module projekt_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens sample;
    opens textEditor;
    opens databaza;
}