package servicii.validari;

import clase.Data;

public class ValidareImprumut {
    public boolean validareRestituire (Data imprumutare, Data restituire ) {
        ValidareData validDate = new ValidareData();
        return validDate.validareDate(imprumutare, restituire);
    }
}
