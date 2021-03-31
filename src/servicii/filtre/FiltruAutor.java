package servicii.filtre;

import clase.Autor;

public interface FiltruAutor <T> {
    Autor[] filtru(Autor[] arrayToFilter, T value);
}
