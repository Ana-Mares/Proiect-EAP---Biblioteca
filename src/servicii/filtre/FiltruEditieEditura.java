package servicii.filtre;
import clase.Editie;
import java.util.Arrays;

public class FiltruEditieEditura implements FiltruEditie<String>{
    @Override
    public Editie[] filtru (Editie[] arrayEditii, String editura) {
        Editie[] editiiFiltrate = new Editie[0];
        for(Editie editie: arrayEditii) {
            if(editie.getEditura().equals(editura)) {
                editiiFiltrate = Arrays.copyOf(editiiFiltrate, editiiFiltrate.length + 1);
                editiiFiltrate[editiiFiltrate.length -1] = editie;
            }
        }
        return editiiFiltrate;
    }
}
