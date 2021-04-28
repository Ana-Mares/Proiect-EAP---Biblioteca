package servicii.comparatori;

import clase.Data;
import java.util.Comparator;

public class ComparaDate implements Comparator<Data> {
    @Override
    public int compare(Data d1, Data d2) {
        if (d1.getAn() != d2.getAn() ) return d1.getAn()-d2.getAn();
        else if (d1.getLuna() != d2.getLuna() ) return d1.getLuna()-d2.getLuna();
        else return d1.getZi()-d2.getZi();
    }

}
