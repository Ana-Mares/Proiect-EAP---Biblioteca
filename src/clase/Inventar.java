package clase;

import java.util.Objects;

public abstract class Inventar {
    protected static int id;
    protected int idInventar;
    protected Data achizitie;
    protected boolean disponibil = Boolean.TRUE;

    public Inventar(int idInventar, Data achizitie) {
        this.idInventar = idInventar;
        this.achizitie = achizitie;
        this.disponibil = disponibil;
    }

    public Inventar(Data achizitie) {
        id++;
        idInventar = id;
        this.achizitie = achizitie;
    }

    public int getIdInventar() {
        return idInventar;
    }

    public void setIdInventar(int idInventar) {
        this.idInventar = idInventar;
    }

    public static int getId() {
        return id;
    }

    public Data getAchizitie() {
        return achizitie;
    }

    public void setAchizitie(Data achizitie) {
        this.achizitie = achizitie;
    }

    public boolean isDisponibil() {
        return disponibil;
    }

    public void setDisponibil(boolean disponibil) {
        this.disponibil = disponibil;
    }


    @Override
    public String toString() {
        return "Data achizitiei" + achizitie +
                ", disponibil= " + disponibil+ ". ";
    }

    public String toString2() {
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Inventar inventar = (Inventar) obj;
        return idInventar == inventar.idInventar && disponibil == inventar.disponibil && Objects.equals(achizitie, inventar.achizitie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInventar, achizitie, disponibil);
    }
}
