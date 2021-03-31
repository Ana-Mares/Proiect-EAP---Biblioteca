package clase;

public class Imprumut {
    private Data imprumutare;
    private Data restituire;
    private boolean intarziere;
    private boolean problema;
    private Inventar[] obiecte;

    public Imprumut(Data imprumutare, Data restituire, boolean intarziere, boolean problema, Inventar[] obiecte) {
        this.imprumutare = imprumutare;
        this.restituire = restituire;
        this.intarziere = intarziere;
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

    public boolean isIntarziere() {
        return intarziere;
    }

    public void setIntarziere(boolean intarziere) {
        this.intarziere = intarziere;
    }

    public boolean isProblema() {
        return problema;
    }

    public void setProblema(boolean problema) {
        this.problema = problema;
    }

    public Inventar[] getObiecte() {
        return obiecte;
    }

    public void setObiecte(Inventar[] obiecte) {
        this.obiecte = obiecte;
    }


    @Override
    public String toString() {
        return 
                "Obiect imprumutat: " + obiecte + "Data imprumutare " + imprumutare +
                ", data maxima pentru restituire " + restituire +
                ", au fost intarzieri: " + intarziere +
                ", au fost probleme: " + problema;
    }
}
