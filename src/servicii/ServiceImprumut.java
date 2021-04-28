package servicii;

import clase.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ServiceImprumut {
    Random random = new Random();

    private Imprumut[] imprumut = new Imprumut[4];


    public ServiceImprumut(Inventar[] obiecte) {
        this.initImprumut(Arrays.asList(obiecte));
    }

    public ServiceImprumut(List<Inventar> obiecte) {
        this.initImprumut(obiecte);
    }

    public Imprumut[] getImprumuturi() {
        return imprumut;
    }


    private void initImprumut(List<Inventar> obiecte) {
        Random random = new Random();
        int totalImprumuturi = random.nextInt(imprumut.length-1)+1;
        for (int nrImprumut = 0; nrImprumut < totalImprumuturi; nrImprumut++) {
            ServiceDate sDate = new ServiceDate(1);
            Data[] imprumutare = sDate.getDate();

            int nrObImprumutate = -1;
            while (nrObImprumutate < 1)
                nrObImprumutate = random.nextInt() % 5 + 1;

            int[] temp = new int[obiecte.size()];
            List<Inventar> ob = new LinkedList<Inventar>();


            for (int i = 0; i < nrObImprumutate; ) {
                int index = random.nextInt(obiecte.size());
                if (temp[index] == 0) {
                    ob.add(obiecte.get(index));
                    temp[index]++;
                    i++;
                }

            }

            Data dataImprumut = imprumutare[random.nextInt(imprumutare.length)];
            Data dataRestituire = sDate.adaugaSaptamani(dataImprumut, 2);

            Imprumut imprumut1 = new Imprumut(dataImprumut, dataRestituire, ob);
            imprumut[nrImprumut] = imprumut1;
        }
    }
}
