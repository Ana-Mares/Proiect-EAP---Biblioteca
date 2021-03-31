package servicii;

import clase.Carte;
import clase.Editie;
import servicii.filtre.FiltruEditie;

import java.util.Random;

public class ServiceEditie {
    Editie[] editii = new Editie[40];

    public ServiceEditie() {this.initEditie();}

    public Editie[] getEditii() {
        return editii;
    }

    public Editie[] filtreaza(FiltruEditie filtru, Object valoare) {
        return filtru.filtru(editii, valoare);
    }

    private void initEditie() {
        String[] edituri = {"Humanitas", "Oxford", "Curtea Veche", "Litera"};
        ServiceCarte sCarte = new ServiceCarte();
        Carte[] carti = sCarte.getCarti();
        Random random= new Random();
        int rand;

        for (int i = 0; i < editii.length; i++) {
            rand = random.nextInt(carti.length);
            Editie editie = new Editie (carti[rand].getAchizitie(), carti[rand].isDisponibil(), carti[rand].getTitlu(), carti[rand].getAutor(), carti[rand].getCategorie(), edituri[random.nextInt(edituri.length)], random.nextInt(62)+1960, random.nextInt(1480)+20);
            editii[i] = editie;
        }
    }
}

