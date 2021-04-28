package main;

import clase.*;
import servicii.*;
import servicii.comparatori.CmpPersoane;
import servicii.fisiere.citireFisier;

import java.util.*;

public class Main {
    public static void main(String[] args) {

       /* ServiceInventar sInventar = new ServiceInventar();
        List<Inventar> inventar = Arrays.asList(sInventar.getInventare());

        //DE AICI
        // /*
        ServiceCarte sCarte = new ServiceCarte();
        Carte[] carti = sCarte.getCarti();

        ServiceCalculator sCalculatoar = new ServiceCalculator();
        Calculator[] calculatoare = sCalculatoar.getCalculatoare();

        for (int i = 0; i < inventar.size(); i++) {
            if (i < 20) inventar.set(i, carti[i]);
            else inventar.set(i, calculatoare[i - 20]);
        }*/
//PANA AICI
        /*
        ServiceCititor sCititor = new ServiceCititor(inventar);
        ServiceAngajat sAngajat = new ServiceAngajat(inventar);

        TreeSet<Persoana> persoane = new TreeSet<>(new CmpPersoane());
        persoane.addAll(Arrays.asList(sCititor.getCititori()));
        persoane.addAll((Arrays.asList(sAngajat.getAngajati())));

        Iterator<Persoana> persoanaIterator = persoane.iterator();
        while (persoanaIterator.hasNext()) {
            System.out.println(persoanaIterator.next());
            System.out.println("\n");
        } */

/*
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


        ArrayList<Inventar> inventar = new ArrayList<Inventar>();
        ArrayList<Cititor> cititori = new ArrayList<Cititor>();

        citireFisier.getInstanta().citireEditie( inventar);
        citireFisier.getInstanta().citireCalculator(inventar);
        //for (int i = 0; i < inventar.size(); i++)
            //System.out.println(inventar.get(i).toString());


        citireFisier.getInstanta().citireAngajati( cititori );
        citireFisier.getInstanta().citireCititori( cititori );



        citireFisier.getInstanta().citireImprumuturi(cititori, inventar);
        for (int i = 0; i < cititori.size(); i++)
        System.out.println(cititori.get(i).toString() + "\n");


    }
}