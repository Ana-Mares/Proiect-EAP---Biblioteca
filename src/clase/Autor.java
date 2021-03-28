package clase;

import java.util.Arrays;

public class Autor extends Persoana{
    private String tara;
    private Data deces;
    private String[] premii;

    public Autor(String nume, String prenume, String dataNastere, String tara, Data deces, String[] premii) {
        super(nume, prenume, dataNastere);
        this.tara = tara;
        this.deces = deces;
        this.premii = premii;
    }


    public Autor(String nume, String prenume, String dataNastere, String tara, Data deces) {
        super(nume, prenume, dataNastere);
        this.tara = tara;
        this.deces = deces;
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

    public String[] getPremii() {
        return premii;
    }

    public void setPremii(String[] premii) {
        this.premii = premii;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tara " + tara  +
                ", deces(daca este cazul) " + deces +
                ", premii(daca este cazul) " + Arrays.toString(premii);
    }
}
