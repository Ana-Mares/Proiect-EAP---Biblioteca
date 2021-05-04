package servicii.fisiere;

import clase.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ScriereFisier {
    public static ScriereFisier instanta = null;

    private ScriereFisier() {}

    public static ScriereFisier getInstanta() {
        if(instanta == null)
            instanta = new ScriereFisier();
        return instanta;
    }

    public void scriereCalculator (ArrayList<Calculator> calculatoare) {
        FileWriter scriere = null;
        try {
            scriere = new FileWriter("src\\\\servicii\\\\fisiere\\\\resurse\\\\calculatoareW.csv");
            //scriere = new FileWriter("src\\\\servicii\\\\fisiere\\\\resurse\\\\calculatoare.csv", true);
            for (Calculator calculator : calculatoare) {
                scriere.append(String.valueOf(calculator.getAchizitie().getZi()));
                scriere.append(",");
                scriere.append(String.valueOf(calculator.getAchizitie().getLuna()));
                scriere.append(",");
                scriere.append(String.valueOf(calculator.getAchizitie().getAn()));
                scriere.append(",");
                scriere.append(calculator.getFirma());
                scriere.append("\n");
            }
        }
        catch (Exception exception) {
            System.out.println("Eroare la scrierea in fisierul calculatoare.csv.");
        }

        try {
            scriere.flush();
            scriere.close();
        }
        catch (IOException exception) {
            System.out.println("Eroare la inchiderea fisierului calculatoare.csv");
        }
    }


    public void scriereEditie (ArrayList<Editie> editii) {
        FileWriter scriere = null;
        try {
            scriere = new FileWriter("src\\\\servicii\\\\fisiere\\\\resurse\\\\editiiW.csv");
            for (Editie editie : editii) {
                scriere.append(editie.getEditura());
                scriere.append(",");
                scriere.append(String.valueOf(editie.getAnAparitie()));
                scriere.append(",");
                scriere.append(String.valueOf(editie.getNrPagini()));
                scriere.append(",");
                scriere.append(String.valueOf(editie.getAchizitie().getZi()));
                scriere.append(",");
                scriere.append(String.valueOf(editie.getAchizitie().getLuna()));
                scriere.append(",");
                scriere.append(String.valueOf(editie.getAchizitie().getAn()));
                scriere.append(",");
                scriere.append(editie.getTitlu());
                scriere.append(",");
                scriere.append(editie.getAutor().getNume());
                scriere.append(",");
                scriere.append(editie.getAutor().getPrenume());
                scriere.append(",");
                scriere.append(editie.getAutor().getTara());
                scriere.append(",");
                scriere.append(editie.getAutor().getCelMaiImportantpremiu());
                scriere.append(",");
                scriere.append(editie.getCategorie());
                scriere.append("\n");
            }
        }
        catch (Exception exception) {
            System.out.println("Eroare la scrierea in fisierul editii.csv.");
        }

        try {
            scriere.flush();
            scriere.close();
        }
        catch (IOException exception) {
            System.out.println("Eroare la inchiderea fisierului editii.csv");
        }
    }


    public void scriereCititor (ArrayList<Cititor> cititori) {
        FileWriter scriere = null;
        try {
            scriere = new FileWriter("src\\\\servicii\\\\fisiere\\\\resurse\\\\cititoriW.csv");
            for (Cititor cititor : cititori) {
                scriere.append(String.valueOf(cititor.getNastere().getZi()));
                scriere.append(",");
                scriere.append(String.valueOf(cititor.getNastere().getLuna()));
                scriere.append(",");
                scriere.append(String.valueOf(cititor.getNastere().getAn()));
                scriere.append(",");
                scriere.append(cititor.getCnp());
                scriere.append(",");
                scriere.append(cititor.getMail());
                scriere.append(",");
                scriere.append(cititor.getNrTelefon());
                scriere.append(",");
                scriere.append(cititor.getAdresa().getJudet());
                scriere.append(",");
                scriere.append(cititor.getAdresa().getLocalitate());
                scriere.append(",");
                scriere.append(cititor.getAdresa().getStrada());
                scriere.append(",");
                scriere.append(String.valueOf(cititor.getAdresa().getNumar()));
                scriere.append(",");
                scriere.append(String.valueOf(cititor.getAbonament().getInceput().getZi()));
                scriere.append(",");
                scriere.append(String.valueOf(cititor.getAbonament().getInceput().getLuna()));
                scriere.append(",");
                scriere.append(String.valueOf(cititor.getAbonament().getInceput().getAn()));
                scriere.append(",");
                scriere.append(cititor.getNume());
                scriere.append(",");
                scriere.append(cititor.getPrenume());
                scriere.append("\n");

            }
        }
        catch (Exception exception) {
            System.out.println("Eroare la scrierea in fisierul cititori.csv.");
        }

        try {
            scriere.flush();
            scriere.close();
        }
        catch (IOException exception) {
            System.out.println("Eroare la inchiderea fisierului cititori.csv");
        }
    }

    public void scriereAngajati (ArrayList<Angajat> angajati) {
        FileWriter scriere = null;
        try {
            scriere = new FileWriter("src\\\\servicii\\\\fisiere\\\\resurse\\\\angajatiW.csv");
            for (Angajat angajat : angajati) {
                scriere.append(String.valueOf(angajat.getAngajare().getZi()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getAngajare().getLuna()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getAngajare().getAn()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getSalariu()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getNastere().getZi()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getNastere().getLuna()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getNastere().getAn()));
                scriere.append(",");
                scriere.append(angajat.getCnp());
                scriere.append(",");
                scriere.append(angajat.getMail());
                scriere.append(",");
                scriere.append(angajat.getNrTelefon());
                scriere.append(",");
                scriere.append(angajat.getAdresa().getJudet());
                scriere.append(",");
                scriere.append(angajat.getAdresa().getLocalitate());
                scriere.append(",");
                scriere.append(angajat.getAdresa().getStrada());
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getAdresa().getNumar()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getAbonament().getInceput().getZi()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getAbonament().getInceput().getLuna()));
                scriere.append(",");
                scriere.append(String.valueOf(angajat.getAbonament().getInceput().getAn()));
                scriere.append(",");
                scriere.append(angajat.getNume());
                scriere.append(",");
                scriere.append(angajat.getPrenume());
                scriere.append("\n");

            }
        }
        catch (Exception exception) {
            System.out.println("Eroare la scrierea in fisierul angajati.csv.");
        }

        try {
            scriere.flush();
            scriere.close();
        }
        catch (IOException exception) {
            System.out.println("Eroare la inchiderea fisierului angajati.csv");
        }
    }


    public void scriereImprumuturi (ArrayList<Cititor> cititori) {
        FileWriter scriere = null;
        try {
            scriere = new FileWriter("src\\\\servicii\\\\fisiere\\\\resurse\\\\imprumuturiW.csv");
            for (Cititor cititor : cititori) {
                for (Imprumut imprumut: cititor.getImprumuturi()) {
                    for (Inventar inventar: imprumut.getObiecte()) {
                        scriere.append(cititor.getCnp());
                        scriere.append(",");
                        scriere.append(String.valueOf(imprumut.getImprumutare().getZi()));
                        scriere.append(",");
                        scriere.append(String.valueOf(imprumut.getImprumutare().getLuna()));
                        scriere.append(",");
                        scriere.append(String.valueOf(imprumut.getImprumutare().getAn()));
                        scriere.append(",");
                        scriere.append(String.valueOf(inventar.getIdInventar()));
                        scriere.append("\n");
                    }
                }
            }
        }
        catch (Exception exception) {
            System.out.println("Eroare la scrierea in fisierul imprumuturi.csv.");
        }

        try {
            scriere.flush();
            scriere.close();
        }
        catch (IOException exception) {
            System.out.println("Eroare la inchiderea fisierului imprumuturi.csv");
        }
    }


}
