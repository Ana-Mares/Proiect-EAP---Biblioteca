package clase;

import java.util.Arrays;

public class Autor extends Persoana{
    private String tara;
    private Data deces;
    private String celMaiImportantpremiu;

    public Autor(String nume, String prenume, Data dataNastere, String tara, Data deces, String celMaiImportantpremiu) {
        super(nume, prenume, dataNastere);
        this.tara = tara;
        this.deces = deces;
        this.celMaiImportantpremiu = celMaiImportantpremiu;
    }


    public Autor(String nume, String prenume, Data dataNastere, String tara, Data deces) {
        super(nume, prenume, dataNastere);
        this.tara = tara;
        this.deces = deces;
        this.celMaiImportantpremiu = null;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public Data getDeces() {
        return deces;
    }

    public void setDeces(Data deces) {
        this.deces = deces;
    }

    public String getCelMaiImportantpremiu() {
        return celMaiImportantpremiu;
    }

    public void setCelMaiImportantpremiu(String celMaiImportantpremiu) {
        this.celMaiImportantpremiu = celMaiImportantpremiu;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tara " + tara  +
                ", deces(daca este cazul) " + deces +
                ", cel mai important premiu(daca este cazul) " + celMaiImportantpremiu;
    }
}
