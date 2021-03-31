package servicii;

import clase.Autor;
import clase.Calculator;
import clase.Data;
import clase.Inventar;
import servicii.filtre.FiltruCarte;
import servicii.filtre.FiltruInventar;

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
        ServiceDate sDate = new ServiceDate();
        Data[] achizitie = sDate.getDate();
        Boolean[] disponibil = {Boolean.TRUE, Boolean.FALSE};

        Data[] istoricReparatii = null;
        String[] firma = {"Lenovo", "Asus", "HP", "Acer", "Myria"};
        Random random= new Random();
        for (int i = 0; i < calculatoare.length; i++) {
            Calculator calculator = new Calculator (achizitie[random.nextInt(achizitie.length)], disponibil[0], istoricReparatii, firma[random.nextInt(firma.length)] );
            calculatoare[i] = calculator;
        }
    }
}
