package validari;

import clase.Data;

public class ValidareData {
    public boolean validareAn(int an) {
        return an > 0 && an <= 2021;
    }

    public boolean validareDate (Data d1, Data d2){
        if ( d1.compareTo(d2) <= 0 ) return false;
        return true;
    }
}
