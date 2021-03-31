package servicii.filtre;

import clase.Imprumut;

import java.util.Arrays;

public class FiltruImprumutIntarziere implements FiltruImprumut <Boolean> {
    @Override
    public Imprumut[] filtru(Imprumut[] arrayImprumuturi, Boolean intarziere) {
        Imprumut[] imprumuturiFiltrate = new Imprumut[0];
        for (Imprumut imprumut : arrayImprumuturi) {
            if (imprumut.isIntarziere() == intarziere) {
                imprumuturiFiltrate = Arrays.copyOf(imprumuturiFiltrate, imprumuturiFiltrate.length + 1);
                imprumuturiFiltrate[imprumuturiFiltrate.length - 1] = imprumut;
            }
        }
        return imprumuturiFiltrate;
    }
}
