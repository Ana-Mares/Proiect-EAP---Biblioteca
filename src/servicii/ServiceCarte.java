package servicii;

import clase.Autor;
import clase.Carte;
import clase.Data;
import servicii.filtre.FiltruCarte;

import java.util.Random;

public class ServiceCarte {
    private Carte[] carti = new Carte[20];

    public ServiceCarte() { this.initCarte(); }

    public Carte[] getCarti() {
        return carti;
    }

    public Carte[] filtreaza(FiltruCarte filtru, Object valoare) {
        return filtru.filtru(carti, valoare);
    }

    private void initCarte(){
        ServiceDate sDate = new ServiceDate(1);
        Data[] achizitie = sDate.getDate();
        Boolean[] disponibil = {Boolean.TRUE, Boolean.FALSE};

        String[] titluri = {"Povestea mea", "O ceasca cu ceai rece", "Ochiul tigrului", "Semnul tacerii", "Vocea din intuneric", "Poarta", "Druid's Grave","Intelepciunile secolului", "Bufnita din oras", "Padurea despovarata", "The Crooked Earth","Saritura broastei", "Autorul vorbeste primul", "Dupa Soare", "Aripi de liliac", "White Stones", "Inger sedat", "Doua sute patruzeci si unu", "Cafea in asteptare", "How to Ace Your Java Project"};
        ServiceAutor sAutor = new ServiceAutor();
        Autor[] autori = sAutor.getAutori();
        String[] categorii = {"Beletristica", "Pentru copii", "Biografii, memorii", "Istorie", "Economie", "Psihologie", "Filosofie", "Religie", "Stiinte", "Arta", "Dictionare, enciclopedii"};
        Random random= new Random();
        for (int i = 0; i < carti.length; i++) {
            Carte carte = new Carte (achizitie[random.nextInt(achizitie.length)], titluri[i], autori[random.nextInt(autori.length)], categorii[random.nextInt(categorii.length)] );
            carti[i] = carte;
        }
    }
}
