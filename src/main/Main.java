package main;

import clase.*;
import servicii.BD.*;
import servicii.ServiceAutor;
import servicii.fisiere.CitireFisier;
import servicii.fisiere.ScriereFisier;

import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        //Citesc din fisierele .csv informatii despre calculatoare, editii, cititori si angajati.
                //Majoritatea partilor comentate fac parte din versiunile pentru etapele 1 si 2.
        //ArrayList<Inventar> inventar = new ArrayList<Inventar>();
        ArrayList<Calculator> calculatoare = new ArrayList<Calculator>();
        ArrayList<Editie> editii = new ArrayList<Editie>();
        ArrayList<Cititor> cititori = new ArrayList<Cititor>();
       // ArrayList<Cititor> angajatiSiCititori = new ArrayList<Cititor>();
        ArrayList<Angajat> angajati = new ArrayList<Angajat>();


        CitireFisier.getInstanta().citireEditie(editii);
        CitireFisier.getInstanta().citireCalculator( calculatoare );
        //inventar.addAll(editii);
        //inventar.addAll(calculatoare);
        CitireFisier.getInstanta().citireAngajati( angajati );
        CitireFisier.getInstanta().citireCititori( cititori );
        //angajatiSiCititori.addAll(angajati);
        //angajatiSiCititori.addAll(cititori);


       // CitireFisier.getInstanta().citireImprumuturi(angajatiSiCititori, inventar);
        //for (int i = 0; i < angajatiSiCititori.size(); i++)
        //System.out.println(angajatiSiCititori.get(i).toString() + "\n");

        //ScriereFisier.getInstanta().scriereCalculator(calculatoare);
       // ScriereFisier.getInstanta().scriereAngajati(angajati);
        //ScriereFisier.getInstanta().scriereEditie(editii);
        //ScriereFisier.getInstanta().scriereCititor(cititori);
       // ScriereFisier.getInstanta().scriereImprumuturi(cititori);

        //Scriu toate informatiile extrase din fisierele .csv in baza de date.
       ScriereInBD scriereInBD = new ScriereInBD();
        for (int i = 0; i < cititori.size(); i++)
            scriereInBD.ScrieCititor(cititori.get(i));
        for (int i = 0; i < angajati.size(); i++)
            scriereInBD.ScrieAngajat(angajati.get(i));
        for (int i = 0; i < calculatoare.size(); i++)
            scriereInBD.ScrieCalculator(calculatoare.get(i));
        for (int i = 0; i < editii.size(); i++)
            scriereInBD.ScrieEditie(editii.get(i));
       //scriereInBD.ScrieCititor(cititori.get(5));
        //scriereInBD.ScrieAngajat(angajati.get(1));
        //scriereInBD.ScrieCalculator(calculatoare.get(1));
       // scriereInBD.ScrieEditie(editii.get(1));


            /////Exemplificare stergeri
        //StergeDinBD stergeDinBD = new StergeDinBD();
        //stergeDinBD.StergeCalculator(1);
        //stergeDinBD.stergeCititor(3);
        //stergeDinBD.sterge("editii", "categorie", "fictiune");
        //stergeDinBD.sterge("cititori", "cpn", "123");


        ////Exemplificare update-uri
        //UpdateInBD updateInBD = new UpdateInBD();
        //updateInBD.UpdateTabela("editii", "ideditie", 2, 100);
        //updateInBD.UpdateTabela("editii", "anAparitie", 2020, 5050);

        //updateInBD.UpdateTabela("editii", "numeAutor", "Wilde", "Marcel");
        //updateInBD.UpdateTabela("editii", "prenumeAutor", "editura", "Litera", "Mihaita");
        //updateInBD.UpdateTabelaToataColoana("calculatoare", "firma", "Cea mai buna");


            ///Salvarea datelor in aplicatie.
        ArrayList<Angajat> angajatiBD = new ArrayList<>();
        ArrayList<Cititor> cititoriBD = new ArrayList<>();
        ArrayList<Calculator> calculatoareBD = new ArrayList<>();
        ArrayList<Editie> editiiBD = new ArrayList<>();


        SalvareDinBD salvareDinBD = new SalvareDinBD();
        salvareDinBD.SalveazaAngajati(angajatiBD);
       /* System.out.println("\n\n\n\n\n\n\n");
        for (int i = 0; i < angajatiBD.size(); i++)
            System.out.println(angajatiBD.get(i).toString() + "\n"); */

        salvareDinBD.SalveazaCititori(cititoriBD);
        /*System.out.println("\n\n\n\n\n\n\n");
        for (int i = 0; i < cititoriBD.size(); i++)
            System.out.println(cititoriBD.get(i).toString() + "\n");*/

        salvareDinBD.SalveazaCalculatoare(calculatoareBD);
        /*System.out.println("\n\n\n\n\n\n\n");
        for (int i = 0; i < calculatoareBD.size(); i++)
            System.out.println(calculatoareBD.get(i).toString() + "\n");*/


        salvareDinBD.SalveazaEditii(editiiBD);
       /* System.out.println("\n\n\n\n\n\n\n");
        for (int i = 0; i < editiiBD.size(); i++)
            System.out.println(editiiBD.get(i).toString() + "\n");*/


            ///Exemplificarea operatiei de select
        //SelecteazaDinBD selecteazaDinBD = new SelecteazaDinBD();
        //selecteazaDinBD.SelecteazaAngajatii();
       // selecteazaDinBD.SelecteazaEditiile();
        //selecteazaDinBD.SelecteazaCalculatoarele();





                ////Cod etapa 1
       /* ServiceInventar sInventar = new ServiceInventar();
        List<Inventar> inventar = Arrays.asList(sInventar.getInventare());

        ServiceCarte sCarte = new ServiceCarte();
        Carte[] carti = sCarte.getCarti();

        ServiceCalculator sCalculatoar = new ServiceCalculator();
        Calculator[] calculatoare = sCalculatoar.getCalculatoare();

        for (int i = 0; i < inventar.size(); i++) {
            if (i < 20) inventar.set(i, carti[i]);
            else inventar.set(i, calculatoare[i - 20]);
        }

        ServiceCititor sCititor = new ServiceCititor(inventar);
        ServiceAngajat sAngajat = new ServiceAngajat(inventar);

        TreeSet<Persoana> persoane = new TreeSet<>(new CmpPersoane());
        persoane.addAll(Arrays.asList(sCititor.getCititori()));
        persoane.addAll((Arrays.asList(sAngajat.getAngajati())));

        Iterator<Persoana> persoanaIterator = persoane.iterator();
        while (persoanaIterator.hasNext()) {
            System.out.println(persoanaIterator.next());
            System.out.println("\n");
        }


        for (int i = 1; i <= angajati.length; i++) {
            System.out.print("ANGAJATI " + i + ". ");
            System.out.println(angajati[i-1].toString());
            System.out.println();
        }

        for (int i = 1; i <= cititori.length; i++) {
            System.out.print("CITITOR " + i + ". ");
            System.out.println(cititori[i-1].toString());
            System.out.println();
        }*/
    }
}