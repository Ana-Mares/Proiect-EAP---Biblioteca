package servicii.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexiuneBD {


    //public static Connection getConexiune;



    public static Connection getConexiune() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sys", "root", "parolaSQL");
        } catch (SQLException sqle) {
            throw new RuntimeException("Eroare la conectarea la baza de date");
            //System.out.println("Eroare la conectarea la baza de date");
        }

    }


    /*
    Connection connection = null;

    connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "parolaSQL");
    //Class.forName("com.mysql.cj.jdbc.Driver");*/

}
