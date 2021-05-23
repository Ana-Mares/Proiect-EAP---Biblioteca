package clase;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class Cititor extends Persoana {
    protected Data nastere;
    protected String cnp;
    protected String mail;
    protected String nrTelefon;
    protected Adresa adresa;
    protected Abonament abonament;
    protected List<Imprumut> imprumuturi = new ArrayList<Imprumut>();

        public Cititor(String nume, String prenume, Data nastere, String cnp, String mail, String nrTelefon, Adresa adresa, Abonament abonament, List<Imprumut> imprumuturi) {
        super(nume, prenume);
        this.nastere = nastere;
        this.cnp = cnp;
        this.mail = mail;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
        this.abonament = abonament;
        this.imprumuturi = imprumuturi;
    }

    public Cititor(String nume, String prenume, Data nastere, String cnp, String mail, String nrTelefon, Adresa adresa, Abonament abonament) {
        super(nume, prenume);
        this.nastere = nastere;
        this.cnp = cnp;
        this.mail = mail;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
        this.abonament = abonament;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public Abonament getAbonament() {
        return abonament;
    }

    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }

    public void setImprumuturi(List<Imprumut> imprumuturi) {
        this.imprumuturi = imprumuturi;
    }

    public Data getNastere() {
        return nastere;
    }

    public void setNastere(Data nastere) {
        this.nastere = nastere;
    }

    public List<Imprumut> getImprumuturi() {
            return imprumuturi;
    }

    @Override
    public String toString() {
        String tmp = super.toString2() +
                ", data nasterii: " + nastere +
                ", CNP: " + cnp  +
                ", adresa mail: " + mail +
                ", numar de telefon: " + nrTelefon +
                " " + '\n' + adresa + '\n' +
                "Informatii despre abonament: " + abonament + '\n' +
                "Imprumuturi: " + imprumuturi;
        //int j = 0;
       // while (imprumuturi[j]!= null) {
         //   tmp += "\n" + "Imprumutul " + (j+1) + " -  " + imprumuturi[j].toString();
         //   j++;
       // }

    return tmp;
    }

    public String toString2() {
        String tmp = super.toString() +
                ", data nasterii: " + nastere +
                ", CNP: " + cnp  +
                ", adresa mail: " + mail +
                ", numar de telefon: " + nrTelefon +
                " " + '\n' + adresa + '\n';
        return tmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cititor cititor = (Cititor) o;
        return Objects.equals(nastere, cititor.nastere) && Objects.equals(cnp, cititor.cnp) && Objects.equals(mail, cititor.mail) && Objects.equals(nrTelefon, cititor.nrTelefon) && Objects.equals(adresa, cititor.adresa) && Objects.equals(abonament, cititor.abonament) && Objects.equals(imprumuturi, cititor.imprumuturi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nastere, cnp, mail, nrTelefon, adresa, abonament, imprumuturi);
    }

    /*
    public String toString(int i) {
        String tmp = super.toString() +
                ", CNP: " + cnp  +
                ", adresa mail: " + mail +
                ", numar de telefon: " + nrTelefon +
                " " + '\n' + adresa + '\n' +
                "Informatii despre abonament: " + abonament + '\n' +
                "Imprumuturi: ";
        for (int i = 0 ; i < imprumuturi.length; i++)
            tmp = tmp+imprumuturi[i].toString() + " ";
        return tmp;
    }*/
}
