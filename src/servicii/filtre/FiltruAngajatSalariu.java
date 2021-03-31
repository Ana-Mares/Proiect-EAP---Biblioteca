package servicii.filtre;
import clase.Angajat;
import java.util.Arrays;

public class FiltruAngajatSalariu implements FiltruAngajat<Integer>{
    @Override
    public Angajat[] filtruMaiMare(Angajat[] arrayAngajati, Integer salariu) {
        Angajat[] angajatiFiltrati = new Angajat[0];
        for (Angajat angajat : arrayAngajati) {
            if (angajat.getSalariu() > salariu) {
                angajatiFiltrati = Arrays.copyOf(angajatiFiltrati, angajatiFiltrati.length + 1);
                angajatiFiltrati[angajatiFiltrati.length - 1] = angajat;
            }
        }
        return angajatiFiltrati;
    }

    @Override
    public Angajat[] filtruMaiMic(Angajat[] arrayAngajati, Integer salariu) {
        Angajat[] angajatiFiltrati = new Angajat[0];
        for (Angajat angajat : arrayAngajati) {
            if (angajat.getSalariu() < salariu) {
                angajatiFiltrati = Arrays.copyOf(angajatiFiltrati, angajatiFiltrati.length + 1);
                angajatiFiltrati[angajatiFiltrati.length - 1] = angajat;
            }
        }
        return angajatiFiltrati;
    }

    @Override
    public Angajat[] filtruEgal(Angajat[] arrayAngajati, Integer salariu) {
        Angajat[] angajatiFiltrati = new Angajat[0];
        for (Angajat angajat : arrayAngajati) {
            if (angajat.getSalariu() == salariu) {
                angajatiFiltrati = Arrays.copyOf(angajatiFiltrati, angajatiFiltrati.length + 1);
                angajatiFiltrati[angajatiFiltrati.length - 1] = angajat;
            }
        }
        return angajatiFiltrati;
    }
}
