package network;

public class testovaciaTrieda {
    public static void main(String[] args) {
        String test = "dbsfdfnjanfjnsjfngjsngjkndsj test nsjldnfjlnfjnnfnj";
        String slovo = "test";
        int vysledok = 0;

        if(test.contains(slovo)){
            vysledok++;

            int contol = test.indexOf(slovo);
            String cast = test.substring(contol);

            System.out.println(contol);
            System.out.println(cast);



        }
        System.out.println(vysledok);


        String mojText = "test a este jeden testtest a este jeden testtest a este jeden testtest a este jeden testtest a este jeden test";
        String cast = mojText;
        int pocet =0;

        int y;

        while (cast.length() != -1){
            if(cast.contains("test")){
                pocet++;
                y = cast.indexOf("test");
                cast = cast.substring(y+4);
            }
            else {
                break;
            }
        }

        System.out.println(pocet);

    }
}
