package clase;

public abstract class Persoana {
    protected String nume;
    protected String prenume;
    protected Data nastere;

    public Persoana(String nume, String prenume, Data nastere) {
        this.nume = nume;
        this.prenume = prenume;
        this.nastere = nastere;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Data getNastere() {
        return nastere;
    }

    public void setNastere(Data nastere) {
        nastere = nastere;
    }

    @Override
    public String toString() {
        return   nume + " " + prenume + ", data nastere: " + nastere;
    }
}
