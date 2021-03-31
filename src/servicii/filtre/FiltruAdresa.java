package servicii.filtre;

import clase.Adresa;

public interface FiltruAdresa <T> {
    Adresa[] filtru(Adresa[] arrayToFilter, T value);
}
