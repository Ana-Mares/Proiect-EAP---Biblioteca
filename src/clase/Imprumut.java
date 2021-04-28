package clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public class Imprumut {
    private Data imprumutare;
    private Data restituire;
    private boolean problema = Boolean.FALSE;
    private List<Inventar> obiecte = new ArrayList<Inventar>();

    public Imprumut(Data imprumutare, Data restituire, List<Inventar> obiecte) {
        this.imprumutare = imprumutare;
        this.restituire = restituire;
        this.problema = problema;
        this.obiecte = obiecte;
    }

    public Data getImprumutare() {
        return imprumutare;
    }

    public void setImprumutare(Data imprumutare) {
        this.imprumutare = imprumutare;
    }

    public Data getRestituire() {
        return restituire;
    }

    public void setRestituire(Data restituire) {
        this.restituire = restituire;
    }

    public boolean isProblema() {
        return problema;
    }

    public void setProblema(boolean problema) {
        this.problema = problema;
    }

    public List<Inventar> getObiecte() {
        return obiecte;
    }

    public void setObiecte(List<Inventar> obiecte) {
        this.obiecte = obiecte;
    }


    @Override
    public String toString() {
        String temp = "Obiecte imprumutate: ";
        for (int i = 0; i < obiecte.size(); i ++ )
            temp = temp + '\n' + (i+1) + "." + obiecte.get(i).toString2() + ", " ;
        temp = temp + '\n' + "Data imprumutare" + imprumutare +
                ", data restituire:" + restituire +
                //"; au fost intarzieri: " + intarziere +
                ", au fost probleme: " + problema;
        return temp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Imprumut imprumut = (Imprumut) obj;
        return problema == imprumut.problema && Objects.equals(imprumutare, imprumut.imprumutare) && Objects.equals(restituire, imprumut.restituire) && Objects.equals(obiecte, imprumut.obiecte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imprumutare, restituire, problema, obiecte);
    }
}
