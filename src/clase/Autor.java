package clase;

import java.util.Objects;

public class Autor extends Persoana{
    private String tara;
    private String celMaiImportantPremiu;

    public Autor(String nume, String prenume, String tara, String celMaiImportantpremiu) {
        super(nume, prenume);
        this.tara = tara;
        this.celMaiImportantPremiu = celMaiImportantpremiu;
    }


    public Autor(String nume, String prenume, String tara) {
        super(nume, prenume);
        this.tara = tara;
        this.celMaiImportantPremiu = null;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getCelMaiImportantpremiu() {
        return celMaiImportantPremiu;
    }

    public void setCelMaiImportantpremiu(String celMaiImportantpremiu) {
        this.celMaiImportantPremiu = celMaiImportantpremiu;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tara " + tara  +
                ", cel mai important premiu(daca este cazul) " + celMaiImportantPremiu;
    }

    public String toString2() {
        return super.toString2();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autor autor = (Autor) obj;
        return Objects.equals(tara, autor.tara)  && Objects.equals(celMaiImportantPremiu, autor.celMaiImportantPremiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tara, celMaiImportantPremiu);
    }
}
