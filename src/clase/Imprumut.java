package clase;

public class Imprumut {
    private Data imprumutare;
    private Data restituire;
    private boolean intarziere;
    private boolean problema;
    private Inventar obiect;

    public Imprumut(Data imprumutare, Data restituire, boolean intarziere, boolean problema, Inventar obiect) {
        this.imprumutare = imprumutare;
        this.restituire = restituire;
        this.intarziere = intarziere;
        this.problema = problema;
        this.obiect = obiect;
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

    public Inventar getObiect() {
        return obiect;
    }

    public void setObiect(Inventar obiect) {
        this.obiect = obiect;
    }


    @Override
    public String toString() {
        return 
                "Obiect imprumutat: " + obiect + "Data imprumutare " + imprumutare +
                ", data maxima pentru restituire " + restituire +
                ", au fost intarzieri: " + intarziere +
                ", au fost probleme: " + problema;
    }
}
