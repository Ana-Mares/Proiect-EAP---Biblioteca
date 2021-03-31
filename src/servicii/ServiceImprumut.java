package servicii;

import clase.*;
import servicii.filtre.FiltruImprumut;

import java.util.Random;

public class ServiceImprumut {
    Random random = new Random();

    private Imprumut[] imprumut = new Imprumut[1];


    public ServiceImprumut(Inventar[] obiecte) {
        this.initImprumut(obiecte);
    }

    public Imprumut[] getImprumuturi() {
        return imprumut;
    }

    // public Imprumut[] filtreaza(FiltruImprumut filter, Object value) {
    //   return filter.filtru(imprumut, value);
    // }

    private void initImprumut(Inventar[] obiecte) {
        ServiceDate sDate = new ServiceDate();
        Data[] imprumutare = sDate.getDate();
        ServiceDate sDate2 = new ServiceDate();
        Data[] restituire = sDate2.getDate();


        Random random = new Random();
        Imprumut imprumut1 = new Imprumut(imprumutare[random.nextInt(imprumutare.length)], restituire[random.nextInt(restituire.length)], Boolean.FALSE, Boolean.FALSE, obiecte);
        imprumut[0] = imprumut1;
    }
}
