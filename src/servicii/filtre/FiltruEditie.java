package servicii.filtre;

import clase.Editie;

public interface FiltruEditie<T> {
    Editie[] filtru(Editie[] arrayToFilter, T value);

}
