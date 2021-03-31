package servicii.filtre;
import clase.Abonament;

public interface FiltruAbonament<T> {
    Abonament[] filtru(Abonament[] arrayToFilter, T value);
}
