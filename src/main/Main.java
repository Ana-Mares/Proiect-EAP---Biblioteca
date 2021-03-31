package main;

import clase.*;
import servicii.*;

public class Main {
    public static void main(String[] args) {

        ServiceInventar sInventar = new ServiceInventar();
        Inventar[] inventar = sInventar.getInventare();

        ServiceCarte sCarte = new ServiceCarte();
        Carte[] carti = sCarte.getCarti();

        ServiceCalculator sCalculatoar = new ServiceCalculator();
        Calculator[] calculatoare = sCalculatoar.getCalculatoare();

        for (int i = 0; i < inventar.length; i++) {
            if (i < 20) inventar[i] = carti[i];
            else inventar[i] = calculatoare[i - 20];
        }

        ServiceCititor sCititor = new ServiceCititor(inventar);
        Cititor[] cititori = sCititor.getCititori();

        ServiceAngajat sAngajat = new ServiceAngajat(inventar);
        Angajat[] angajati = sAngajat.getAngajati();

        //System.out.println(cititori.toString());
        for (int i = 1; i <= cititori.length; i++) {
            System.out.print("CITITOR " + i + ". ");
            System.out.println(cititori[i-1].toString());
            System.out.println();
        }
    }
}