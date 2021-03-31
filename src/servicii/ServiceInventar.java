package servicii;

import clase.Data;
import clase.Inventar;
import servicii.filtre.FiltruInventar;

import java.util.Random;

public class ServiceInventar {
    private Inventar[] inventare = new Inventar[25];

    public ServiceInventar() {
        this.initInventar();
    }

    public Inventar[] getInventare() {
        return inventare;
    }

    public Inventar[] filtreaza(FiltruInventar filtru, Object valoare) {
        return filtru.filtru(inventare, valoare);
    }

    private void initInventar(){}
        /*ServiceDate sDate = new ServiceDate();
        Data[] achizitie = sDate.getDate();
        Boolean[] disponibil = {Boolean.TRUE, Boolean.FALSE};
        Random random= new Random();
        for (int i = 0; i < inventare.length; i++) {
            Inventar inventar = new Inventar (achizitie[random.nextInt(achizitie.length)], disponibil[random.nextInt(disponibil.length)] );
            inventare[i] = inventar;
        }
    }*/
}
