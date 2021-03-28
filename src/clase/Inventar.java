package clase;

public abstract class Inventar {
    protected static String idInventar;
    protected Data achizitie;
    protected boolean disponibil;


    public Inventar(Data achizitie, boolean disponibil) {
        this.achizitie = achizitie;
        this.disponibil = disponibil;
    }


    public static String getIdInventar() {
        return idInventar;
    }

    public static void setIdInventar(String idInventar) {
        Inventar.idInventar = idInventar;
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
