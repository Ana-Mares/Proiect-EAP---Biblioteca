package servicii.filtre;
import clase.Carte;

public interface FiltruCarte<T> {
    Carte[] filtru(Carte[] arrayToFilter, T value);
}
