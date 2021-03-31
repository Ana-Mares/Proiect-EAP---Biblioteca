package servicii;

import clase.Data;
import clase.Persoana;
import servicii.filtre.FiltruPersoana;

import java.util.Random;

public class ServicePersoana {
    private Persoana[] persoane = new Persoana[50];

    public ServicePersoana() {
        //this.initPersoane();
    }

    public Persoana[] getPersoane() {
        return persoane;
    }

    public Persoana[] filtreaza(FiltruPersoana filtru, Object valoare) {
        return filtru.filtru(persoane, valoare);
    }

   /* private void initPersoane(){
        String[] nume = {"Ionescu", "Popescu", "Vasilescu", "Johnson", "McDaniel", "Muller", "Garcia", "Dinu", "Dobre", "Apostol"};
        String[] prenume = {"Marcel", "Diana", "Michael", "Gabriel", "John", "Damian", "Franz", "Maria", "Paul", "Luis", "Sofia", "Andreea", "Daniel"};
        ServiceDate sDate = new ServiceDate();
        Data[] nastere = sDate.getDate();
        Random random= new Random();
        for (int i = 0; i < persoane.length; i++) {
            Persoana persoana = new Persoana (nume[random.nextInt(nume.length)], prenume[random.nextInt(prenume.length)], nastere[random.nextInt(nastere.length)] );
        }

    }?*/
}
