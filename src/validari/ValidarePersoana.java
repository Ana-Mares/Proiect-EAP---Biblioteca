package validari;

import clase.Data;
import clase.Persoana;

public class ValidarePersoana {
    String[] premii = {"Nobel pentru Lieratura", "Pulitzer", "Goodreads Choice", "academiei Romane", "Uniunii Scriitorilor"};


   /* public boolean validPersoana(Persoana persoana)
    {
        return validareNume(persoana.getNume()) && validarePrenume(persoana.getPrenume());
    }

    public boolean validCititor (Cititor cititor)*/

    public boolean validareNume (String nume ) {
        return nume.matches("^[a-zA-Z- ]+$") && nume.length() <= 30;
    }

    public boolean validarePrenume (String prenume ) {
        return prenume.matches("^[a-zA-Z- ]+$") && prenume.length() <= 45;
    }

    public boolean validareMail(String mail) {
        return mail.matches("^[a-zA-Z0-9_]+@[a-zA-Z]+[.]+[a-zA-Z]{2,3}$");
    }

    public boolean validareNrTelefon(String NrTelefon) {
        boolean startsWith = NrTelefon.startsWith("07");
        for (char x: NrTelefon.toCharArray() )
            if(!(startsWith && NrTelefon.length() == 10 && Character.isDigit(x))) {
                return false;
            }
        return true;
    }

    public boolean validareCnp(String cnp) {
        boolean startsWith = cnp.startsWith("1") || cnp.startsWith("2") ||cnp.startsWith("5") || cnp.startsWith("6");
        if (!(startsWith && cnp.length() == 13)) return false;
        for (char x: cnp.toCharArray() )
            if( Character.isDigit(x)) {
                return false;
            }
        return true;
    }

    public boolean validareSalariu (int salariu ) {
        return salariu >= 500;
    }

    public boolean validarePremiu(String premiu) {
        for (String numePremiu : premii)
            if (numePremiu.equalsIgnoreCase(premiu))
                return true;
        return false;
    }


}
