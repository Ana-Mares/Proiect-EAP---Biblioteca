package clase;

public class Abonament {
    private String idCard;
    private Data inceput;
    private Data sfarsit;
    private boolean eValabil;

    public Abonament(String idCard, Data inceput, Data sfarsit, boolean eValabil) {
        this.idCard = idCard;
        this.inceput = inceput;
        this.sfarsit = sfarsit;
        this.eValabil = eValabil;
    }


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Data getInceput() {
        return inceput;
    }

    public void setInceput(Data inceput) {
        this.inceput = inceput;
    }

    public Data getSfarsit() {
        return sfarsit;
    }

    public void setSfarsit(Data sfarsit) {
        this.sfarsit = sfarsit;
    }

    public boolean iseValabil() {
        return eValabil;
    }

    public void seteValabil(boolean eValabil) {
        this.eValabil = eValabil;
    }

    @Override
    public String toString() {
        return "Abonamentul legat de cardul cu id-ul " + idCard +
                " are data de inceput " + inceput +
                ", si data de sfarsit " + sfarsit +
                ". Abonamentului este valabil: " + eValabil;
    }
}
