package servicii.filtre;
import clase.Abonament;
import java.util.Arrays;

public class FiltruAbonamentValabil implements FiltruAbonament<Boolean> {
    @Override
    public Abonament[] filtru(Abonament[] arrayAbonamente, Boolean valabilitate) {
        Abonament[] abonamenteFiltrate = new Abonament[0];
        for (Abonament abonament : arrayAbonamente) {
            if (abonament.iseValabil() == valabilitate) {
                abonamenteFiltrate = Arrays.copyOf(abonamenteFiltrate, abonamenteFiltrate.length + 1);
                abonamenteFiltrate[abonamenteFiltrate.length - 1] = abonament;
            }
        }
        return abonamenteFiltrate;
    }
}
