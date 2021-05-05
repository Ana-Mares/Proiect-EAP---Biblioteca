package validari;

import clase.*;
import servicii.fisiere.CitireFisier;
import servicii.fisiere.ServiceAudit;



public class Validari {
    ValidarePersoana vP = new ValidarePersoana();
    ValidareCarte vC = new ValidareCarte();
    ValidareImprumut vI = new ValidareImprumut();


    public boolean validPersoana(Persoana persoana)
    {
        ServiceAudit.getInstanta().audit("Validare persoana");
        return vP.validareNume(persoana.getNume()) && vP.validarePrenume(persoana.getPrenume());
    }

    public boolean validCititor (Cititor cititor) {
        ServiceAudit.getInstanta().audit("Validare cititor");
        return validPersoana(cititor) && vP.validareMail(cititor.getMail()) && vP.validareNrTelefon(cititor.getNrTelefon());
    }

    public boolean validAngajat (Angajat angajat) {
        ServiceAudit.getInstanta().audit("Validare angajat");
        return validCititor(angajat) && vP.validareSalariu(angajat.getSalariu());
    }

    public boolean validEditie (Editie editie) {
        ServiceAudit.getInstanta().audit("Validare editie");
        return vP.validareNume(editie.getAutor().getNume()) && vC.validareAnAnaparitie(editie.getAnAparitie()) && vC.validareNrPagini(editie.getNrPagini());
    }

    public boolean validImprumut (Imprumut imprumut) {
        ServiceAudit.getInstanta().audit("Validare imprumut");
        return vI.validareRestituire(imprumut.getImprumutare(), imprumut.getRestituire());
    }
}
