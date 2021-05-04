package clase;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class Angajat extends Cititor {
    private Data angajare;
    private int salariu;

    public Angajat(String nume, String prenume, Data dataNastere, String cnp, String mail, String nrTelefon, Adresa adresa, Abonament abonament, List<Imprumut> imprumuturi, Data angajare, int salariu) {
        super(nume, prenume, dataNastere, cnp, mail, nrTelefon, adresa, abonament, imprumuturi);
        this.angajare = angajare;
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, Data dataNastere, String cnp, String mail, String nrTelefon, Adresa adresa, Abonament abonament, Data angajare, int salariu) {
        super(nume, prenume, dataNastere, cnp, mail, nrTelefon, adresa, abonament);
        this.angajare = angajare;
        this.salariu = salariu;
    }

    public Data getAngajare() {
        return angajare;
    }

    public void setAngajare(Data angajare) {
        this.angajare = angajare;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Informatii despre angajat" + '\n' + super.toString() + "\n" +
                "Data angajare " + angajare +
                ", salariu " + salariu + " lei.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Angajat angajat = (Angajat) obj;
        return salariu == angajat.salariu && Objects.equals(angajare, angajat.angajare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(angajare, salariu);
    }
}
