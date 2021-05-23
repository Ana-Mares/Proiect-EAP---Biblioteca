package servicii.BD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StergeDinBD {

    public void StergeCititor(int id) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "DELETE FROM cititori WHERE idcititor=" + id;

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Stergerea cititorului din BD s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la stergerea cititorului din baza de date.");}

    }

    public void StergeAngajat(int id) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "DELETE FROM angajati WHERE idangajat=" + id;

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Stergerea angajatului din BD s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la stergerea angajatului din baza de date.");}

    }

    public void StergeEditie(int id) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "DELETE FROM editii WHERE ideditie=" + id;

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Stergerea editiei din BD s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la stergerea editiei din baza de date.");}

    }

    public void StergeCalculator(int id) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "DELETE FROM calculatoare WHERE idcalculator=" + id;

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Stergerea calculatorului din BD s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la stergerea calculatorului din baza de date.");}

            conexiune.close();
    }




    public void sterge ( String numeTabela, String coloanaTabela, int valoare ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "DELETE FROM " + numeTabela +  " WHERE " + coloanaTabela + "= " + valoare;

        statement.executeUpdate(sqlQuery);

        try
        {
            statement.executeUpdate(sqlQuery);
            System.out.println("Stergerea din baza de date s-a efectuat cu succes.");
        }

        catch (SQLException sqle){
            System.out.println("Eroare la stergerea din baza de date.");}

    }


    public void sterge ( String numeTabela, String coloanaTabela, String valoare ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();

            String sqlQuery = "DELETE FROM " + numeTabela +  " WHERE " + coloanaTabela + "= '" + valoare+ "'";
        try
        {
        statement.executeUpdate(sqlQuery);
            System.out.println("Stergerea din baza de date s-a efectuat cu succes.");
        }

        catch (SQLException sqle){
        System.out.println("eroare la stergerea din baza de date.");}


        conexiune.close();
    }




}
