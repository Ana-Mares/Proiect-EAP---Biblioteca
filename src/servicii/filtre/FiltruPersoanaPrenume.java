package servicii.filtre;

import clase.Persoana;

import java.util.Arrays;

public class FiltruPersoanaPrenume implements FiltruPersoana<String> {
    @Override
    public Persoana[] filtru(Persoana[] arrayEditii, String prenume) {
        Persoana[] persoaneFiltrate = new Persoana[0];
        for (Persoana persoana : arrayEditii) {
            if (persoana.getPrenume().equals(prenume)) {
                persoaneFiltrate = Arrays.copyOf(persoaneFiltrate, persoaneFiltrate.length + 1);
                persoaneFiltrate[persoaneFiltrate.length - 1] = persoana;
            }
        }
        return persoaneFiltrate;
    }
}
