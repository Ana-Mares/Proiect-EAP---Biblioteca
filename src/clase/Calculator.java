package clase;

import java.util.Arrays;

public class Calculator extends Inventar {
    private Data[] istoricReparatii;
    private String firma;

    public Calculator(Data achizitie, boolean disponibil, Data[] istoricReparatii, String firma) {
        super(achizitie, disponibil);
        this.istoricReparatii = istoricReparatii;
        this.firma = firma;
    }

    public Data[] getIstoricReparatii() {
        return istoricReparatii;
    }

    public void setIstoricReparatii(Data[] istoricReparatii) {
        this.istoricReparatii = istoricReparatii;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Calculator: " + firma + '\n' + super.toString() +
                "istoric reparatii:" + Arrays.toString(istoricReparatii);
    }
}
