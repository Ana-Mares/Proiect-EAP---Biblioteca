package clase;

import java.util.Objects;

public class Abonament {
    private static Integer id=0;
    private String idCard;
    private Data inceput;
    private boolean eValabil = Boolean.TRUE;

    public Abonament(String idCard, Data inceput, boolean eValabil) {
        this.idCard = idCard;
        this.inceput = inceput;
        this.eValabil = eValabil;
    }

    public Abonament(Data inceput) {
        id++;
        this.idCard = Integer.toString(id);
        this.inceput = inceput;
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

    public boolean iseValabil() {
        return eValabil;
    }

    public void seteValabil(boolean eValabil) {
        this.eValabil = eValabil;
    }

    @Override
    public String toString() {
        return "Abonamentul legat de cardul cu id-ul " + idCard +
                " are data de inceput" + inceput +
                " si valabilitate de 2 ani. Abonamentul este valabil: " + eValabil;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Abonament abonament = (Abonament) obj;
        return eValabil == abonament.eValabil && Objects.equals(idCard, abonament.idCard) && Objects.equals(inceput, abonament.inceput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCard, inceput, eValabil);
    }
}
