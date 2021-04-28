package servicii.comparatori;

import clase.Persoana;

import java.util.Comparator;

public class CmpPersoane implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2) {
        Comparator cpDate = new ComparaDate();

        if (p1.getNume().compareToIgnoreCase(p2.getNume()) == 0) {
            if (p1.getPrenume().compareToIgnoreCase(p2.getPrenume()) == 0)
                return 0;
            else return p1.getPrenume().compareToIgnoreCase(p2.getPrenume());
        }
        else return p1.getNume().compareToIgnoreCase(p2.getNume());
    }
}
