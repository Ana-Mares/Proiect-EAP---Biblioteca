package servicii;

import clase.Calculator;
import clase.Data;
import clase.Inventar;
import servicii.filtre.FiltruInventar;

import java.util.List;
import java.util.Random;

public class ServiceCalculator {
    private Calculator[] calculatoare = new Calculator[5];

    public ServiceCalculator() { this.initCalculator(); }

    public Calculator[] getCalculatoare() {
        return calculatoare;
    }

    public Inventar[] filtreaza(FiltruInventar filtru, Object valoare) {
        return filtru.filtru(calculatoare, valoare);
    }

    private void initCalculator(){
        ServiceDate sDate = new ServiceDate(1);
        Data[] achizitie = sDate.getDate();
        Boolean[] disponibil = {Boolean.TRUE, Boolean.FALSE};

        List istoricReparatii = null;
        String[] firma = {"Lenovo", "Asus", "HP", "Acer", "Myria"};
        Random random= new Random();
        for (int i = 0; i < calculatoare.length; i++) {
            Calculator calculator = new Calculator (achizitie[random.nextInt(achizitie.length)], istoricReparatii, firma[random.nextInt(firma.length)] );
            calculatoare[i] = calculator;
        }
    }
}
