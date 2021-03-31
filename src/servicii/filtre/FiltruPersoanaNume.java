package servicii.filtre;

import clase.Persoana;

import java.util.Arrays;

public class FiltruPersoanaNume implements FiltruPersoana<String>{
    @Override
    public Persoana[] filtru (Persoana[] arrayEditii, String nume) {
        Persoana[] persoaneFiltrate = new Persoana[0];
        for(Persoana persoana: arrayEditii) {
            if(persoana.getNume().equals(nume)) {
                persoaneFiltrate = Arrays.copyOf(persoaneFiltrate, persoaneFiltrate.length + 1);
                persoaneFiltrate[persoaneFiltrate.length -1] = persoana;
            }
        }
        return persoaneFiltrate;
    }
}
