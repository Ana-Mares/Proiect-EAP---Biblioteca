package clase;

public abstract class Inventar {
    protected static int id;
    protected String idInventar;
    protected Data achizitie;
    protected boolean disponibil;

    public Inventar(String idInventar, Data achizitie, boolean disponibil) {
        this.idInventar = idInventar;
        this.achizitie = achizitie;
        this.disponibil = disponibil;
    }

    public Inventar(Data achizitie, boolean disponibil) {
        id++;
        idInventar = Integer.toString(id);
        this.achizitie = achizitie;
        this.disponibil = disponibil;
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
                ", disponibil=" + disponibil;
    }
}
