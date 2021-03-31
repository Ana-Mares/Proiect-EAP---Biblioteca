package clase;

public class Angajat extends Cititor {
    private Data angajare;
    private int salariu;

    public Angajat(String nume, String prenume, Data dataNastere, String cnp, String mail, String nrTelefon, Adresa adresa, Abonament abonament, Imprumut[] imprumuturi, Data angajare, int salariu) {
        super(nume, prenume, dataNastere, cnp, mail, nrTelefon, adresa, abonament, imprumuturi);
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
        return "Informatii despre angajat" + '\n' + super.toString() +
                ", data angajare " + angajare +
                ", salariu " + salariu;
    }
}
