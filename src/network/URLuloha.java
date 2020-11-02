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
            int celkovypocet = 0;
            while ((vystup = reader.readLine()) != null) {
                //System.out.println(vystup);

                for (int x= 0; x < vystup.length(); x++){
                    switch (vystup.substring(x)){
                        case "div":
                            celkovypocet++;
                            break;
                        case "script":
                            celkovypocet++;
                            break;
                    }
                }
                System.out.println(celkovypocet);
            }
            reader.close();




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
