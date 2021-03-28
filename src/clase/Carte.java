package clase;

public class Carte extends Inventar {
    protected String denumire;
    protected Autor autor;
    protected String categorie;

    public Carte(Data achizitie, boolean disponibil, String denumire, Autor autor, String categorie) {
        super(achizitie, disponibil);
        this.denumire = denumire;
        this.autor = autor;
        this.categorie = categorie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


    @Override
    public String toString() {
        return super.toString() + "Denumire carte: " + denumire +
                ", scrisa de " + autor +
                ", categorie " + categorie;
    }
}
