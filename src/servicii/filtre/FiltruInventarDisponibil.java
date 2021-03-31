package servicii.filtre;

import clase.Inventar;

import java.util.Arrays;

public class FiltruInventarDisponibil implements FiltruInventar<Boolean> {
    @Override
    public Inventar[] filtru(Inventar[] arrayInventar, Boolean disponibil) {
        Inventar[] inventarFiltrat = new Inventar[0];
        for (Inventar inventar : arrayInventar) {
            if (inventar.isDisponibil() == disponibil) {
                inventarFiltrat = Arrays.copyOf(inventarFiltrat, inventarFiltrat.length + 1);
                inventarFiltrat[inventarFiltrat.length - 1] = inventar;
            }
        }
        return inventarFiltrat;
    }
}
