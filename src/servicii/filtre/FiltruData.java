package servicii.filtre;

import clase.Data;

public interface FiltruData<T> {
    Data[] filtruMaiMare (Data[] arrayToFilter, T value);
    Data[] filtruMaiMic (Data[] arrayToFilter, T value);
    Data[] filtruEgal (Data[] arrayToFilter, T value);
}
