package databaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MojaDB {
    public static void main(String[] args) {
        String url="jdbc:h2:tcp://localhost/C:/Users/admin/Desktop/škola/PRO/4.ročník/java/test.db";
        String meno="sa";
        String heslo="sa";

        try {
            Connection connection = DriverManager.getConnection(url,meno,heslo);


            Statement statement = connection.createStatement();

           /* String sql = "CREATE TABLE POKUSB " +
                    "(id INTEGER not NULL, " +
                    " meno VARCHAR(255), " +
                    " priezvisko VARCHAR(255), " +
                    " vek INTEGER, " +
                    " PRIMARY KEY ( id ))";

            statement.execute(sql); */

            //System.out.println("tabulka vytvorena");

            String sqlinsert = " INSERT INTO POKUSB VALUES (1, 'Lenka', 'Dzurova', 18)";

            statement.execute(sqlinsert);

            System.out.println("data vlozene");

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
