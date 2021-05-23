package servicii.BD;

import java.sql.*;

public class SelecteazaDinBD {

    public void SelecteazaCititorii () throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM cititori";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        System.out.println(sqlQuery + "\n");
        while(rSet.next()) {
            System.out.print( "Nume: " + rSet.getString("nume") + ", prenume: " + rSet.getString("prenume") + ",data nasterii: " + rSet.getInt("ziNastere") + "." +
                            rSet.getInt("lunaNastere") + "." + rSet.getInt("anNastere") + ", cnp: " + rSet.getString("cnp") + ", mail: " + rSet.getString("mail") +
                            " numar telefon: " + rSet.getString("nrTelefon") + ". Adresa: judet: " +  rSet.getString("judet") + ", localitate: " + rSet.getString("localitate") +
                            ", strada: " + rSet.getString("strada") + ", numarul " + rSet.getString("numar") + ". Id-ul cardului: " + rSet.getString("idCard") +
                            ", data de ionceput a abonamentului: " + rSet.getInt("ziInceput") + "." + rSet.getInt("lunaInceput") + "." + rSet.getInt("anInceput"));
            if ( rSet.getInt("eValabil") == 0 ) System.out.println(". Abonamentul nu este valabil.");
            else System.out.println(". Abonamentul este valabil.");
        }

        conexiune.close();
    }

    public void SelecteazaAngajatii () throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM angajati";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        System.out.println(sqlQuery + "\n");
        while(rSet.next()) {
            System.out.print( "Nume: " + rSet.getString("nume") + ", prenume: " + rSet.getString("prenume") + ",data nasterii: " + rSet.getInt("ziNastere") + "." +
                    rSet.getInt("lunaNastere") + "." + rSet.getInt("anNastere") + ", cnp: " + rSet.getString("cnp") + ", mail: " + rSet.getString("mail") +
                    " numar telefon: " + rSet.getString("nrTelefon") + ". Adresa: judet: " +  rSet.getString("judet") + ", localitate: " + rSet.getString("localitate") +
                    ", strada: " + rSet.getString("strada") + ", numarul " + rSet.getString("numar") + ". Id-ul cardului: " + rSet.getString("idCard") +
                    ", data de ionceput a abonamentului: " + rSet.getInt("ziInceput") + "." + rSet.getInt("lunaInceput") + "." + rSet.getInt("anInceput"));
            if ( rSet.getInt("eValabil") == 0 ) System.out.print(". Abonamentul nu este valabil.");
            else System.out.print(". Abonamentul este valabil. ");
            System.out.println("Data angajarii: " + rSet.getInt("ziAngajare") + "." + rSet.getInt("lunaAngajare") + "." + rSet.getInt("anAngajare") +
            ", salariul: " + rSet.getInt("salariu"));
        }
        conexiune.close();
    }
    

    public void SelecteazaCalculatoarele () throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM calculatoare";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        System.out.println(sqlQuery + "\n");
        while(rSet.next()) {
            System.out.print( "Data achizitiei: " + rSet.getInt("ziAchizitie") + "." + rSet.getInt("lunaAchizitie") + "." + rSet.getInt("anAchizitie") +
                    " Firma: " + rSet.getString("firma"));
            if ( rSet.getInt("disponibil") == 0 ) System.out.println(". Calculatorul nu este disponibil.");
            else System.out.println(". Calculatorul este disponibil. ");
        }
        conexiune.close();
    }


    public void SelecteazaEditiile () throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM editii";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        System.out.println(sqlQuery + "\n");
        while(rSet.next()) {
            System.out.print( "Data achizitiei: " + rSet.getInt("ziAchizitie") + "." + rSet.getInt("lunaAchizitie") + "." + rSet.getInt("anAchizitie") +
                   ", titlu: " + rSet.getString("titlu") + ", autor: " + rSet.getString("prenumeAutor") + rSet.getString("numeAutor") + ", tara : " + rSet.getString("taraAutor") );
            if (rSet.getString("premiuAutor") != null ) System.out.print(", cel mai important premiu al autorului: " + rSet.getString("premiuAutor"));
            System.out.print(". Categorie: " + rSet.getString("categorie") + ", editura: " + rSet.getString("editura") + ", anul aparitiei: " +
                    rSet.getInt("anAparitie") + ", numar de pagini: " + rSet.getInt("nrPagini"));
            if ( rSet.getInt("disponibil") == 0 ) System.out.println(". Calculatorul nu este disponibil.");
            else System.out.println(". Calculatorul este disponibil. ");
        }
        conexiune.close();

    }


}
