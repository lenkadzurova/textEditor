package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLuloha {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://sosholic.sk/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String vystup;
            while ((vystup = reader.readLine()) != null) {
                System.out.println(vystup);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
