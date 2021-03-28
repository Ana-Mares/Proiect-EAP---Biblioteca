package clase;

public abstract class Persoana {
    protected String nume;
    protected String prenume;
    protected String dataNastere;

    public Persoana(String nume, String prenume, String dataNastere) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNastere = dataNastere;
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

    public String getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }

    @Override
    public String toString() {
        return  "Nume: " + nume + ", prenume: " + prenume + ", data nastere='" + dataNastere;
    }
}
