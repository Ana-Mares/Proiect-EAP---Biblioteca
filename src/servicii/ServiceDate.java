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
    public ServiceDate(int i) {
        this.initDate(i);
    }
    public ServiceDate(String s) {
        this.initDate(s);
    }


    public Data[] getDate() {
        return date;
    }

    public Data[] filtreazaMaiMare(FiltruData filtru, Object valoare) {
        return filtru.filtruMaiMare(date, valoare);
    }

    public Data[] filtreazaMaiMic(FiltruData filtru, Object valoare) {
        return filtru.filtruEgal(date, valoare);
    }

    public Data[] filtreazaEgal(FiltruData filtru, Object valoare) {
        return filtru.filtruEgal(date, valoare);
    }

    private void initDate() { //carti
        Random random = new Random();
        for (int i = 0; i < date.length; i++) {
            Data data = new Data((random.nextInt(30) + 1), (random.nextInt(12) + 1), (random.nextInt(250) + 1771));
            date[i] = data;
        }
    }
    public Data adaugaSaptamani (Data data, int nrSaptamani) {
        Data dataModificata = new Data(data.getZi(), data.getLuna(), data.getAn());

        int zile = nrSaptamani*7;
        int saptamani = nrSaptamani;
        int luni = zile/30;
        int ani = luni/12;

        if (ani > 0 ) luni %= 12;
        if (luni > 0) zile %= 30;


        dataModificata.setZi(data.getZi()+zile);
        dataModificata.setLuna(data.getLuna()+luni);
        dataModificata.setAn(data.getAn()+ani);

        int nrZileLuni[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dataModificata.getZi() > nrZileLuni[dataModificata.getLuna()]){
            dataModificata.setLuna(dataModificata.getLuna() + dataModificata.getZi()/30);
            dataModificata.setZi(dataModificata.getZi()%30);
        }

        if (dataModificata.getLuna() > 12 ){
            dataModificata.setAn(dataModificata.getAn() + dataModificata.getLuna()/12);
            dataModificata.setLuna(dataModificata.getLuna()%12);
        }

        return dataModificata;

    }

    private void initDate(int a) { //imprumuturi, calculatoare, angajari...
        Random random = new Random();
        for (int i = 0; i < date.length; i++) {
            Data data = new Data((random.nextInt(30) + 1), (random.nextInt(12) + 1), (random.nextInt(3) + 2018));
            date[i] = data;
        }
    }

    private void initDate(String s) { //cititori
        Random random = new Random();
        for (int i = 0; i < date.length; i++) {
            Data data = new Data((random.nextInt(30) + 1), (random.nextInt(12) + 1), (random.nextInt(70) + 1952));
            date[i] = data;
        }
    }
}
