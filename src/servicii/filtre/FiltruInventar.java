package servicii.filtre;

import clase.Inventar;

public interface FiltruInventar  <T> {
    Inventar[] filtru(Inventar[] arrayToFilter, T value);
}
