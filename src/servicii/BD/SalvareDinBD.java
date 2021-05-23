package servicii.BD;

import clase.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SalvareDinBD {

    public void SalveazaAngajati (ArrayList<Angajat> angajati) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM angajati";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        while(rSet.next()) {
            Data nastereTemp = new Data(rSet.getInt("ziNastere"), rSet.getInt("lunaNastere"), rSet.getInt("anNastere"));
            Data angajareTemp = new Data(rSet.getInt("ziAngajare"), rSet.getInt("lunaAngajare"), rSet.getInt("anAngajare"));
            Adresa adresaTemp = new Adresa(rSet.getString("judet"), rSet.getString("localitate"), rSet.getString("strada"), Integer.parseInt((rSet.getString("numar"))));
            Data dAbonamentTemp = new Data(rSet.getInt("ziInceput"), rSet.getInt("lunaInceput"), rSet.getInt("anInceput"));
            Abonament abonamentTemp = null;
            if (rSet.getInt("eValabil") == 1) abonamentTemp = new Abonament(rSet.getString("idCard"), dAbonamentTemp, Boolean.TRUE);
            else abonamentTemp = new Abonament(rSet.getString("idCard"), dAbonamentTemp, Boolean.FALSE);

            Angajat temp = new Angajat(rSet.getString("nume"), rSet.getString("prenume"), nastereTemp, rSet.getString("cnp"), rSet.getString("mail"),
                    rSet.getString("nrTelefon"), adresaTemp, abonamentTemp, angajareTemp, rSet.getInt("salariu"));
            angajati.add(temp);


        }
        conexiune.close();
            System.out.println("Salvarea angajatilor din BD s-a efectuat cu succes.");
    }

    public void SalveazaCititori (ArrayList<Cititor> cititori) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM cititori";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        while(rSet.next()) {
            Data nastereTemp = new Data(rSet.getInt("ziNastere"), rSet.getInt("lunaNastere"), rSet.getInt("anNastere"));
            Adresa adresaTemp = new Adresa(rSet.getString("judet"), rSet.getString("localitate"), rSet.getString("strada"), Integer.parseInt((rSet.getString("numar"))));
            Data dAbonamentTemp = new Data(rSet.getInt("ziInceput"), rSet.getInt("lunaInceput"), rSet.getInt("anInceput"));
            Abonament abonamentTemp = null;
            if (rSet.getInt("eValabil") == 1) abonamentTemp = new Abonament(rSet.getString("idCard"), dAbonamentTemp, Boolean.TRUE);
            else abonamentTemp = new Abonament(rSet.getString("idCard"), dAbonamentTemp, Boolean.FALSE);

            Cititor temp = new Cititor(rSet.getString("nume"), rSet.getString("prenume"), nastereTemp, rSet.getString("cnp"), rSet.getString("mail"),
                    rSet.getString("nrTelefon"), adresaTemp, abonamentTemp);
            cititori.add(temp);


        }
        conexiune.close();
        System.out.println("Salvarea cititorilor din BD s-a efectuat cu succes.");
    }


    public void SalveazaCalculatoare (ArrayList<Calculator> calculatoare) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM calculatoare";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        while(rSet.next()) {
            Data achizitieTemp = new Data(rSet.getInt("ziAchizitie"), rSet.getInt("lunaAchizitie"), rSet.getInt("anAchizitie"));

            Calculator temp = new Calculator(achizitieTemp, rSet.getString("firma"));
            if (rSet.getInt("disponibil") == 0) temp.setDisponibil(Boolean.FALSE);

            calculatoare.add(temp);


        }
        conexiune.close();
        System.out.println("Salvarea calculatoarelor din BD s-a efectuat cu succes.");
    }


    public void SalveazaEditii (ArrayList<Editie> editii) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "SELECT * FROM editii";

        ResultSet rSet = statement.executeQuery(sqlQuery);

        while(rSet.next()) {
            Data achizitieTemp = new Data(rSet.getInt("ziAchizitie"), rSet.getInt("lunaAchizitie"), rSet.getInt("anAchizitie"));
            Autor autorTemp = new Autor(rSet.getString("numeAutor"), rSet.getString("prenumeAutor"), rSet.getString("taraAutor"),  rSet.getString("premiuAutor"));
            Editie temp = new Editie(achizitieTemp, rSet.getString("titlu"), autorTemp, rSet.getString("categorie"), rSet.getString("editura"),
                    rSet.getInt("anAparitie"), rSet.getInt("nrPagini"));
            if (rSet.getInt("disponibil") == 0) temp.setDisponibil(Boolean.FALSE);

            editii.add(temp);

        }
        conexiune.close();
        System.out.println("Salvarea editiilor din BD s-a efectuat cu succes.");
    }

}
