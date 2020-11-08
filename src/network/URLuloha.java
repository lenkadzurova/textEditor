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
            int celkovyPocetDiv = 0;
            int celkovyPocetScript = 0;
            while ((vystup = reader.readLine()) != null) {
                //System.out.println(vystup);
                String cast= vystup;
                int x;

                while (cast.length() != -1){
                    if (cast.contains("div")){
                        celkovyPocetDiv++;
                        x = cast.indexOf("div");
                        cast = cast.substring(x + 3);
                    }
                    else {
                    }
                    if (cast.contains("script")){
                        celkovyPocetScript++;
                        x = cast.indexOf("script");
                        cast = cast.substring(x + 6);
                    }
                    else {
                        break;
                    }
                }
            }
            System.out.println("Počet slova 'div' v texte je: " + celkovyPocetDiv);
            System.out.println("Počet slova 'script' v texte je: " + celkovyPocetScript);
            System.out.println("Celkový počet slov je: "+ (celkovyPocetDiv + celkovyPocetScript));
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
