package servicii.filtre;

import clase.Data;

import java.util.Arrays;

public class FiltruDataZi implements FiltruData <Integer>{
    @Override
    public Data[] filtruMaiMare(Data[] arrayDate, Integer zi) {
        Data[] dateFiltrate = new Data[0];
        for (Data data : arrayDate) {
            if (data.getZi() > zi) {
                dateFiltrate = Arrays.copyOf(dateFiltrate, dateFiltrate.length + 1);
                dateFiltrate[dateFiltrate.length - 1] = data;
            }
        }
        return dateFiltrate;
    }

    @Override
    public Data[] filtruMaiMic(Data[] arrayDate, Integer zi) {
        Data[] dateFiltrate = new Data[0];
        for (Data data : arrayDate) {
            if (data.getZi() < zi) {
                dateFiltrate = Arrays.copyOf(dateFiltrate, dateFiltrate.length + 1);
                dateFiltrate[dateFiltrate.length - 1] = data;
            }
        }
        return dateFiltrate;
    }

    @Override
    public Data[] filtruEgal(Data[] arrayDate, Integer zi) {
        Data[] dateFiltrate = new Data[0];
        for (Data data : arrayDate) {
            if (data.getZi() == zi) {
                dateFiltrate = Arrays.copyOf(dateFiltrate, dateFiltrate.length + 1);
                dateFiltrate[dateFiltrate.length - 1] = data;
            }
        }
        return dateFiltrate;
    }
}
