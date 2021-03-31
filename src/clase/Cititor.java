package clase;

import java.util.Arrays;

public class Cititor extends Persoana {
    protected String cnp;
    protected String mail;
    protected String nrTelefon;
    protected Adresa adresa;
    protected Abonament abonament;
    protected Imprumut[] imprumuturi;

    public Cititor(String nume, String prenume, Data dataNastere, String cnp, String mail, String nrTelefon, Adresa adresa, Abonament abonament, Imprumut[] imprumuturi) {
        super(nume, prenume, dataNastere);
        this.cnp = cnp;
        this.mail = mail;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
        this.abonament = abonament;
        this.imprumuturi = imprumuturi;
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

    public Imprumut[] getImprumuturi() {
        return imprumuturi;
    }

    public void setImprumuturi(Imprumut[] imprumuturi) {
        this.imprumuturi = imprumuturi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cnp: " + cnp  +
                ", adresa mail: " + mail +
                ", numar de telefon: " + nrTelefon +
                ", adresa: " + adresa +
                ", informatii despre abonament: " + abonament +
                ", imprumuturi: " + Arrays.toString(imprumuturi);
    }
}
