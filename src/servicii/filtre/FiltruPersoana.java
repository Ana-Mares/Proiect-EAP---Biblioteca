package servicii.filtre;

import clase.Persoana;

public interface FiltruPersoana<T> {
    Persoana[] filtru(Persoana[] arrayToFilter, T value);

}
