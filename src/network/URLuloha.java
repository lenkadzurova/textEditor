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
                //System.out.println(vystup);
                String slovo1 = "div";
                int slovo1Pocet = 0;
                int celkovypocet = 0;

                while (slovo1Pocet != -1) {
                    slovo1Pocet = vystup.indexOf(slovo1, slovo1Pocet);
                    if (slovo1Pocet != -1)
                        celkovypocet++;

                    slovo1Pocet += slovo1.length();
                }
                System.out.println(celkovypocet);
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
