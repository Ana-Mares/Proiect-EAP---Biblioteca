package clase;

public class Carte extends Inventar {
    protected String titlu;
    protected Autor autor;
    protected String categorie;

    public Carte(Data achizitie, boolean disponibil, String denumire, Autor autor, String categorie) {
        super(achizitie, disponibil);
        this.titlu = denumire;
        this.autor = autor;
        this.categorie = categorie;
    }


    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
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
        return super.toString() + "Denumire carte: " + titlu +
                ", scrisa de " + autor +
                ", categorie " + categorie;
    }
}
