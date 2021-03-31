package servicii;

import clase.*;
import servicii.filtre.FiltruAngajat;

import java.util.Random;

public class ServiceAngajat {
    Angajat[] angajati = new Angajat[3];

    public ServiceAngajat(Inventar[] obiecte) {this.initAdresa(obiecte);}

    public Angajat[] getAngajati() {
        return angajati;
    }

    public Angajat[] filtreazaMaiMare(FiltruAngajat filtru, Object valoare) { return filtru.filtruMaiMare(angajati, valoare); }
    public Angajat[] filtreazaMaiMic(FiltruAngajat filtru, Object valoare) { return filtru.filtruEgal(angajati, valoare); }
    public Angajat[] filtreazaEgal(FiltruAngajat filtru, Object valoare) { return filtru.filtruEgal(angajati, valoare); }


    private void initAdresa(Inventar[] obiecte) {

        ServiceDate sDate = new ServiceDate();
        Data[] angajare = sDate.getDate();
        int[] salarii = {1200, 1500, 3000, 2400, 2750, 5000};
        ServiceCititor sCititor = new ServiceCititor(obiecte);
        Cititor[] cititori = sCititor.getCititori();

        Random random= new Random();
        for (int i = 0; i < angajati.length; i++) {
            int rand = random.nextInt(angajati.length);
            int k = i+2;
            Angajat angajat = new Angajat(cititori[k].getNume(), cititori[k].getPrenume(), cititori[k].getNastere(), cititori[k].getCnp(),
                                cititori[k].getMail(), cititori[k].getNrTelefon(), cititori[k].getAdresa(), cititori[k].getAbonament(),
                                cititori[k].getImprumuturi(), angajare[random.nextInt(angajare.length)], salarii[random.nextInt(salarii.length)]);
            angajati[i] = angajat;
        }
    }
}
