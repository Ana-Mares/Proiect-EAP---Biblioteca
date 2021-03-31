package servicii.filtre;
import clase.Carte;
import java.util.Arrays;

public class FiltruCarteCategorie implements FiltruCarte<String> {
    @Override
    public Carte[] filtru(Carte[] arrayCarti, String categorie) {
        Carte[] cartiFiltrate = new Carte[0];
        for (Carte carte : arrayCarti) {
            if (carte.getCategorie().equals(categorie)) {
                cartiFiltrate = Arrays.copyOf(cartiFiltrate, cartiFiltrate.length + 1);
                cartiFiltrate[cartiFiltrate.length - 1] = carte;
            }
        }
        return cartiFiltrate;
    }

}
