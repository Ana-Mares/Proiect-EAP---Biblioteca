package servicii.filtre;

import clase.Imprumut;

import java.util.Arrays;

public class FiltruImprumutProblema implements FiltruImprumut<Boolean> {
    @Override
    public Imprumut[] filtru(Imprumut[] arrayImprumuturi, Boolean problema) {
        Imprumut[] imprumuturiFiltrate = new Imprumut[0];
        for (Imprumut imprumut : arrayImprumuturi) {
            if (imprumut.isProblema() == problema) {
                imprumuturiFiltrate = Arrays.copyOf(imprumuturiFiltrate, imprumuturiFiltrate.length + 1);
                imprumuturiFiltrate[imprumuturiFiltrate.length - 1] = imprumut;
            }
        }
        return imprumuturiFiltrate;
    }
}
