package clase;

import java.util.Objects;

public abstract class Persoana {
    protected String nume;
    protected String prenume;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
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

    @Override
    public String toString() {
        return   nume + " " + prenume + " ";
    }

    public String toString2() {
        return   nume + " " + prenume;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persoana persoana = (Persoana) obj;
        return Objects.equals(nume, persoana.nume) && Objects.equals(prenume, persoana.prenume) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume);
    }
}
