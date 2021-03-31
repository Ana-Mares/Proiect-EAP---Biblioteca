package servicii.filtre;

import clase.Imprumut;

public interface FiltruImprumut <T> {
    Imprumut[] filtru(Imprumut[] arrayToFilter, T value);

}
