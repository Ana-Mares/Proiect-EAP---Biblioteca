package clase;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Calculator extends Inventar {
    private List<Data> istoricReparatii;
    private String firma;

    public Calculator(Data achizitie, List<Data> istoricReparatii, String firma) {
        super(achizitie);
        this.istoricReparatii = istoricReparatii;
        this.firma = firma;
    }

    public Calculator(Data achizitie, String firma) {
        super(achizitie);
        this.firma = firma;
    }

    public List<Data> getIstoricReparatii() {
        return istoricReparatii;
    }

    public void setIstoricReparatii(List<Data> istoricReparatii) {
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
        return  "Calculator: " + firma + "; " + super.toString() +
                "; istoric reparatii: " + Arrays.toString(new List[]{istoricReparatii});
    }

    public String toString2() {
        return super.toString2() + "Calculator " + firma;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Calculator that = (Calculator) obj;
        return Objects.equals(istoricReparatii, that.istoricReparatii) && Objects.equals(firma, that.firma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(istoricReparatii, firma);
    }
}
