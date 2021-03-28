package clase;

import java.util.Arrays;

public class Calculator extends Inventar {
    private Data[] istoricReparatii;

    public Calculator(Data achizitie, boolean disponibil, Data[] istoricReparatii) {
        super(achizitie, disponibil);
        this.istoricReparatii = istoricReparatii;
    }

    public Data[] getIstoricReparatii() {
        return istoricReparatii;
    }

    public void setIstoricReparatii(Data[] istoricReparatii) {
        this.istoricReparatii = istoricReparatii;
    }


    @Override
    public String toString() {
        return "Calculator: " + '\n' + super.toString() +
                "istoric reparatii:" + Arrays.toString(istoricReparatii);
    }
}
