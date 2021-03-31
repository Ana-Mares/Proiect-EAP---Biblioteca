package servicii.filtre;
import clase.Adresa;
import java.util.Arrays;

public class FiltruAdresaLocalitate  implements FiltruAdresa<String>{
    @Override
    public Adresa[] filtru (Adresa[] arrayAdrese, String localitate) {
        Adresa[] adreseFiltrate = new Adresa[0];
        for(Adresa adresa: arrayAdrese) {
            if(adresa.getJudet().equals(localitate)) {
                adreseFiltrate = Arrays.copyOf(adreseFiltrate, adreseFiltrate.length + 1);
                adreseFiltrate[adreseFiltrate.length -1] = adresa;
            }
        }
        return adreseFiltrate;
    }
}
