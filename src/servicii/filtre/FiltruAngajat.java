package servicii.filtre;

import clase.Angajat;

public interface FiltruAngajat <T> {
    Angajat[] filtruMaiMare(Angajat[] arrayToFilter, T value);
    Angajat[] filtruMaiMic(Angajat[] arrayToFilter, T value);
    Angajat[] filtruEgal(Angajat[] arrayToFilter, T value);
}
