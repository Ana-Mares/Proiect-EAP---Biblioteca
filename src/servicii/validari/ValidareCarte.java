package servicii.validari;

public class ValidareCarte {
    String[] categorii = {"Beletristica", "Pentru copii", "Biografii, memorii", "Istorie", "Economie", "Psihologie", "Filosofie", "Religie", "Stiinte", "Arta", "Dictionare, enciclopedii"};

    public boolean validareCategorie(String categorie) {
        for (String ctg : categorii)
            if (ctg.equalsIgnoreCase(categorie))
                return true;
        return false;
    }

    public boolean validareAnAnaparitie(int anAparitie) {
        return anAparitie > 1500 && anAparitie <= 2021;
    }

    public boolean validareNrPagini(int nrPagini) {
        return nrPagini > 0;
    }

}
