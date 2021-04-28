package servicii;

import clase.Autor;
import clase.Data;
import clase.Persoana;
import servicii.filtre.FiltruAutor;
import servicii.filtre.FiltruPersoana;

import java.util.Random;

public class ServiceAutor {
    private Autor[] autori = new Autor[50];

    public ServiceAutor() {
        this.initAutori();
    }

    public Autor[] getAutori() {
        return autori;
    }

    public Autor[] filtreaza(FiltruAutor filtru, Object valoare) {
        return filtru.filtru(autori, valoare);
    }

    private void initAutori(){
        String[] nume = {"Ionescu", "Popescu", "Vasilescu", "Johnson", "McDaniel", "Muller", "Garcia", "Dinu", "Dobre", "Apostol"};
        String[] prenume = {"Marcel", "Diana", "Michael", "Gabriel", "John", "Damian", "Franz", "Maria", "Paul", "Luis", "Sofia", "Andreea", "Daniel"};
        ServiceDate sDate = new ServiceDate();
        Data[] nastere = sDate.getDate();

        String[] tari = {"Romania", "Statele Unite ale Americii", "Regatul Unit", "Franta", "Germania", "Spania"};
        ServiceDate sDate2 = new ServiceDate();
        Data[] deces = sDate2.getDate();
        String[] premii = {"-", "Nobel pentru Lieratura", "-", "Pulitzer", "-", "Goodreads Choice", "Academiei Romane", "-", "Uniunii Scriitorilor"};

        Random random= new Random();
        for (int i = 0; i < autori.length; i++) {
            Autor autor = new Autor (nume[random.nextInt(nume.length)], prenume[random.nextInt(prenume.length)],tari[random.nextInt(tari.length)], premii[random.nextInt(premii.length)] );
            autori[i] = autor;
        }

    }
}
