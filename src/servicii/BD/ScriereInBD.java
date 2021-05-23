package servicii.BD;

import clase.Angajat;
import clase.Calculator;
import clase.Cititor;
import clase.Editie;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ScriereInBD {

    public void ScrieCititor (Cititor cititor) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "INSERT INTO cititori(nume, prenume, ziNastere, lunaNastere, anNastere, cnp, mail, nrTelefon, judet, localitate, strada, numar, idAbonament, idCard, ziInceput, lunaInceput," +
                "anInceput, eValabil) VALUES('" + cititor.getNume() + "','" + cititor.getPrenume() + "','" + cititor.getNastere().getZi() + "','" + cititor.getNastere().getLuna() +
                    "','" + cititor.getNastere().getAn() + "','" + cititor.getCnp() + "','" + cititor.getMail() + "','" + cititor.getNrTelefon() + "','" + cititor.getAdresa().getJudet()  + "','" + cititor.getAdresa().getLocalitate() +
                    "','" + cititor.getAdresa().getStrada() + "','" + cititor.getAdresa().getNumar()  + "','" + cititor.getAbonament().getIdCard()  + "','" + cititor.getAbonament().getIdCard() + "','" +
                    cititor.getAbonament().getInceput().getZi() + "','" + cititor.getAbonament().getInceput().getLuna() + "','" + cititor.getAbonament().getInceput().getAn() + "','";

        if ( cititor.getAbonament().iseValabil() == true) sqlQuery = sqlQuery + "1')";
            else sqlQuery = sqlQuery + "0')";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Scrierea cititorului in BD s-a efectuat cu succes..");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la scrierea cititorului in baza de date.");}
    }


    public void ScrieAngajat(Angajat angajat) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "INSERT INTO angajati(nume, prenume, ziNastere, lunaNastere, anNastere, cnp, mail, nrTelefon, judet, localitate, strada, numar, idAbonament, idCard, ziInceput, lunaInceput," +
                "anInceput, eValabil, ziAngajare, lunaAngajare, anAngajare, salariu) VALUES('" + angajat.getNume() + "','" + angajat.getPrenume() + "','" + angajat.getNastere().getZi() + "','" + angajat.getNastere().getLuna() +
                "','" + angajat.getNastere().getAn() + "','" + angajat.getCnp() + "','" + angajat.getMail() + "','" + angajat.getNrTelefon() + "','" + angajat.getAdresa().getJudet()  + "','" + angajat.getAdresa().getLocalitate() +
                "','" + angajat.getAdresa().getStrada() + "','" + angajat.getAdresa().getNumar()  + "','" + angajat.getAbonament().getIdCard()  + "','" + angajat.getAbonament().getIdCard() + "','" +
                angajat.getAbonament().getInceput().getZi() + "','" + angajat.getAbonament().getInceput().getLuna() + "','" + angajat.getAbonament().getInceput().getAn() + "','";

        if ( angajat.getAbonament().iseValabil() == true) sqlQuery = sqlQuery + "1','";
        else sqlQuery = sqlQuery + "0','";
        sqlQuery = sqlQuery + angajat.getAngajare().getZi()  + "','" + angajat.getAngajare().getLuna() + "','" + angajat.getAngajare().getAn()  + "','" + angajat.getSalariu() + "')";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Scrierea angajatului in BD s-a efectuat cu succes..");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la scrierea angajatului in baza de date.");}
    }

    public void ScrieCalculator(Calculator calculator) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "INSERT INTO calculatoare(ziAchizitie, lunaAchizitie, anAchizitie, disponibil, firma) VALUES('"  + calculator.getAchizitie().getZi() + "','" + calculator.getAchizitie().getLuna() +
                "','" + calculator.getAchizitie().getAn() + "','";

        if ( calculator.isDisponibil() == true) sqlQuery = sqlQuery + "1','";
        else sqlQuery = sqlQuery + "0','";
        sqlQuery = sqlQuery + calculator.getFirma() + "')";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Scrierea calculatorului in BD s-a efectuat cu succes..");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la scrierea calculatorului in baza de date.");}
    }


    public void ScrieEditie(Editie editie) throws SQLException {
        Connection conexiune = ConexiuneBD.getConexiune();

        Statement statement = conexiune.createStatement();
        String sqlQuery = "INSERT INTO editii (ziAchizitie, lunaAchizitie, anAchizitie, disponibil, titlu, numeAutor, prenumeAutor, taraAutor, premiuAutor, categorie, editura," +
                "anAparitie, nrPagini) VALUES('"  + editie.getAchizitie().getZi() + "','" + editie.getAchizitie().getLuna() + "','" + editie.getAchizitie().getAn() + "','";

        if ( editie.isDisponibil() == true) sqlQuery = sqlQuery + "1','";
        else sqlQuery = sqlQuery + "0','";
        sqlQuery = sqlQuery + editie.getTitlu() + "','" + editie.getAutor().getNume() + "','" + editie.getAutor().getPrenume()  + "','" + editie.getAutor().getTara() + "','" +
                editie.getAutor().getCelMaiImportantpremiu()  + "','" + editie.getCategorie() + "','" + editie.getEditura() + "','" + editie.getAnAparitie() + "','" + editie.getNrPagini() +"')";

        try {
            statement.executeUpdate(sqlQuery);
            System.out.println("Scrierea editiei in BD s-a efectuat cu succes..");
        }
        catch (SQLException sqle){
            System.out.println("Eroare la scrierea editiei in baza de date.");}
    }

}
