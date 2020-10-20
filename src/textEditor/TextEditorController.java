package textEditor;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;

public class TextEditorController {

    @FXML
    TextArea myTetxFile;

    @FXML
    public void save(){
        try {
            BufferedWriter bufferedWriter02 = new BufferedWriter(new FileWriter("dokument", true));
            bufferedWriter02.newLine();
            bufferedWriter02.write(String.valueOf(myTetxFile));
            bufferedWriter02.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initialize(){
        String strBuffer;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("dokument"));
            while ((strBuffer= bufferedReader.readLine()) != null){
                System.out.println(strBuffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
