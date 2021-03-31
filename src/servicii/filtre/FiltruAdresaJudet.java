package servicii.filtre;
import clase.Adresa;

import java.util.Arrays;

public class FiltruAdresaJudet implements FiltruAdresa<String>{
    @Override
    public Adresa[] filtru (Adresa[] arrayAdrese, String judet) {
        Adresa[] adreseFiltrate = new Adresa[0];
        for(Adresa adresa: arrayAdrese) {
            if(adresa.getJudet().equals(judet)) {
                adreseFiltrate = Arrays.copyOf(adreseFiltrate, adreseFiltrate.length + 1);
                adreseFiltrate[adreseFiltrate.length -1] = adresa;
            }
        }
        return adreseFiltrate;
    }
}
