package servicii;

import clase.Abonament;
import clase.Data;
import servicii.filtre.FiltruAbonament;

import java.util.Random;

public class ServiceAbonament {

    Abonament[] abonamente = new Abonament[10];

    public ServiceAbonament() {this.initAbonamente();}

    public Abonament[] getAbonamente() {
        return abonamente;
    }

    public Abonament[] filtreaza(FiltruAbonament filtru, Object valoare) {
        return filtru.filtru(abonamente, valoare);
    }

    private void initAbonamente() {
        ServiceDate sDate = new ServiceDate();
        ServiceDate sDate2 = new ServiceDate();
        Data[] inceput = sDate.getDate();
        Data[] sfarsit = sDate2.getDate();
        Random random= new Random();
        for (int i = 0; i < abonamente.length; i++) {
            Abonament abonament = new Abonament (inceput[random.nextInt(inceput.length)], sfarsit[random.nextInt(sfarsit.length)], Boolean.TRUE );
            abonamente[i] = abonament;
        }
    }
}
