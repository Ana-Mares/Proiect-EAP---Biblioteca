package servicii.filtre;
import clase.Autor;

import java.util.Arrays;

public class FiltruAutorTara implements FiltruAutor<String>{
    @Override
    public Autor[] filtru (Autor[] arrayAutori, String tara) {
        Autor[] autoriFiltrati = new Autor[0];
        for(Autor autor: arrayAutori) {
            if(autor.getTara().equals(tara)) {
                autoriFiltrati = Arrays.copyOf(autoriFiltrati, autoriFiltrati.length + 1);
                autoriFiltrati[autoriFiltrati.length -1] = autor;
            }
        }
        return autoriFiltrati;
    }
}
