package clase;

import java.util.Objects;

public class Carte extends Inventar {
    protected String titlu;
    protected Autor autor;
    protected String categorie;

    public Carte(Data achizitie, String denumire, Autor autor, String categorie) {
        super(achizitie);
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

    public String toString2() {
        return super.toString2() + "Denumire carte: " + titlu +
                ", scrisa de " + autor.toString2() +
                ", categorie " + categorie;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carte carte = (Carte) obj;
        return Objects.equals(titlu, carte.titlu) && Objects.equals(autor, carte.autor) && Objects.equals(categorie, carte.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titlu, autor, categorie);
    }
}
