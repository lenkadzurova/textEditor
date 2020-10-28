package textEditor;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;

public class TextEditorController {

    @FXML
    TextArea myTetxFile;

    @FXML
    public void save(){
        String strWriter;
        try {
            BufferedWriter bufferedWriter02 = new BufferedWriter(new FileWriter("dokument", true));
            strWriter = myTetxFile.getText();
            System.out.println(strWriter);
            bufferedWriter02.write(strWriter);
            bufferedWriter02.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initialize(){
        String strBuffer;
        String vystup = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("dokument"));
            while ((strBuffer= bufferedReader.readLine()) != null){
            //    System.out.println(strBuffer);
            //    myTetxFile.setText(strBuffer);
                vystup= vystup + strBuffer + "\n";
            }
            myTetxFile.setText(vystup);
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
