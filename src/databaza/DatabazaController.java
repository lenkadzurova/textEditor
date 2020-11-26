package databaza;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DatabazaController {
    @FXML
    TextField meno;
    @FXML
    TextField priezvisko;
    @FXML
    TextField vek;
    @FXML
    TextArea vysledok;

    @FXML
    public void save(){
        System.out.println("save");
    }
}
