package servicii.filtre;
import clase.Carte;

import java.util.Arrays;

public class FiltruCarteTitlu implements FiltruCarte<String>{
    @Override
    public Carte[] filtru (Carte[] arrayCarti, String titlu) {
        Carte[] cartiFiltrate = new Carte[0];
        for(Carte carte: arrayCarti) {
            if(carte.getTitlu().equals(titlu)) {
                cartiFiltrate = Arrays.copyOf(cartiFiltrate, cartiFiltrate.length + 1);
                cartiFiltrate[cartiFiltrate.length -1] = carte;
            }
        }
        return cartiFiltrate;
    }
}
