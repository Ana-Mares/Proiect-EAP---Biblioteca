package main;

import clase.*;
import servicii.fisiere.CitireFisier;
import servicii.fisiere.ScriereFisier;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Inventar> inventar = new ArrayList<Inventar>();
        ArrayList<Calculator> calculatoare = new ArrayList<Calculator>();
        ArrayList<Editie> editii = new ArrayList<Editie>();

        ArrayList<Cititor> cititori = new ArrayList<Cititor>();
        ArrayList<Cititor> angajatiSiCititori = new ArrayList<Cititor>();
        ArrayList<Angajat> angajati = new ArrayList<Angajat>();


        CitireFisier.getInstanta().citireEditie(editii);
        CitireFisier.getInstanta().citireCalculator( calculatoare );
        inventar.addAll(editii);
        inventar.addAll(calculatoare);

        CitireFisier.getInstanta().citireAngajati( angajati );
        CitireFisier.getInstanta().citireCititori( cititori );
        angajatiSiCititori.addAll(angajati);
        angajatiSiCititori.addAll(cititori);


        CitireFisier.getInstanta().citireImprumuturi(angajatiSiCititori, inventar);
        for (int i = 0; i < angajatiSiCititori.size(); i++)
        System.out.println(angajatiSiCititori.get(i).toString() + "\n");

       ScriereFisier.getInstanta().scriereCalculator(calculatoare);
        ScriereFisier.getInstanta().scriereAngajati(angajati);
        ScriereFisier.getInstanta().scriereEditie(editii);
        ScriereFisier.getInstanta().scriereCititor(cititori);
        ScriereFisier.getInstanta().scriereImprumuturi(cititori);




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