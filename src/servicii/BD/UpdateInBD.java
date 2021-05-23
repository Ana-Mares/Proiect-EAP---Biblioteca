package servicii.BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateInBD {

    public void UpdateTabela ( String numeTabela, String coloanaTabela, int valoareVeche, int valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaTabela + "= " + valoareNoua + " WHERE " + coloanaTabela + "= " + valoareVeche;


        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la actualizarea bazei de date.");}

    }


    public void UpdateTabela ( String numeTabela, String coloanaTabela, String valoareVeche, String valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaTabela + "= '" + valoareNoua + "' WHERE " + coloanaTabela + "= '" + valoareVeche+ "'";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la actualizarea bazei de date.");}
    }



    public void UpdateTabela ( String numeTabela, String coloanaSchimbata, String coloanaVerificata, String valoareCautata, String valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaSchimbata + "= '" + valoareNoua + "' WHERE " + coloanaVerificata + "= '" + valoareCautata + "'";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        } catch (SQLException sqle) {
            System.out.println("Eroare la actualizarea bazei de date.");
        }
    }

    public void UpdateTabela ( String numeTabela, String coloanaSchimbata, String coloanaVerificata, String valoareCautata, int valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaSchimbata + "= '" + valoareNoua + "' WHERE " + coloanaVerificata + "= '" + valoareCautata+ "'";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la actualizarea bazei de date.");}
    }


    public void UpdateTabela ( String numeTabela, String coloanaSchimbata, String coloanaVerificata, int valoareCautata, int valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaSchimbata + "= '" + valoareNoua + "' WHERE " + coloanaVerificata + "= '" + valoareCautata+ "'";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la actualizarea bazei de date.");}
    }

    public void UpdateTabela ( String numeTabela, String coloanaSchimbata, String coloanaVerificata, int valoareCautata, String valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaSchimbata + "= '" + valoareNoua + "' WHERE " + coloanaVerificata + "= '" + valoareCautata+ "'";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la actualizarea bazei de date.");}
    }

    public void UpdateTabelaToataColoana ( String numeTabela, String coloanaSchimbata, String valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaSchimbata + "= '" + valoareNoua + "'";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la actualizarea bazei de date.");}
    }

    public void UpdateTabelaToataColoana ( String numeTabela, String coloanaSchimbata, int valoareNoua ) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "UPDATE " + numeTabela + " SET " + coloanaSchimbata + "= '" + valoareNoua + "'";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Actualizarea bazei de date s-a efectuat cu succes.");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la actualizarea bazei de date.");}
    }

}
