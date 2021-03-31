package servicii;

import clase.Data;
import clase.Persoana;
import servicii.filtre.FiltruData;
import servicii.filtre.FiltruPersoana;

import java.util.Random;

public class ServiceDate {
    private Data[] date = new Data[30];

    public ServiceDate() {
        this.initDate();
    }

    public Data[] getDate() {
        return date;
    }

    public Data[] filtreazaMaiMare(FiltruData filtru, Object valoare) {
        return filtru.filtruMaiMare(date, valoare);
    }
    public Data[] filtreazaMaiMic(FiltruData filtru, Object valoare) { return filtru.filtruEgal(date, valoare); }
    public Data[] filtreazaEgal(FiltruData filtru, Object valoare) { return filtru.filtruEgal(date, valoare); }

    private void initDate() {
        Random random = new Random();
        for (int i = 0; i < date.length; i++) {
            Data data = new Data(random.nextInt() % 30 + 1, random.nextInt() % 12 + 1, random.nextInt() % 2021 + 1);
            date[i] = data;
        }
    }
}
