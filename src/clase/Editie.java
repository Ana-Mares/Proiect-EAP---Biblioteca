package clase;

import java.util.Objects;

public class Editie extends Carte {
    private String editura;
    private int anAparitie;
    private int nrPagini;

    public Editie(Data achizitie, String denumire, Autor autor, String categorie, String editura, int anAparitie, int nrPagini) {
        super(achizitie, denumire, autor, categorie);
        this.editura = editura;
        this.anAparitie = anAparitie;
        this.nrPagini = nrPagini;
    }


    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }


    @Override
    public String toString() {
        return super.toString() + '\n' + "Informatii despre editie:" +
                "Editura " + editura  +
                ", anul aparitiei: " + anAparitie +
                ", numarul de pagini: " + nrPagini;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Editie editie = (Editie) obj;
        return anAparitie == editie.anAparitie && nrPagini == editie.nrPagini && Objects.equals(editura, editie.editura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), editura, anAparitie, nrPagini);
    }
}
