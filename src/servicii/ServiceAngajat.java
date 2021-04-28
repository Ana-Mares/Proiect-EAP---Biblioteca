package servicii;

import clase.*;
import servicii.filtre.FiltruAngajat;

import java.util.List;
import java.util.Random;

public class ServiceAngajat {
    Angajat[] angajati = new Angajat[5];

    public ServiceAngajat(List<Inventar>  obiecte) {this.initAdresa(obiecte);}

    public Angajat[] getAngajati() {
        return angajati;
    }

    public Angajat[] filtreazaMaiMare(FiltruAngajat filtru, Object valoare) { return filtru.filtruMaiMare(angajati, valoare); }
    public Angajat[] filtreazaMaiMic(FiltruAngajat filtru, Object valoare) { return filtru.filtruEgal(angajati, valoare); }
    public Angajat[] filtreazaEgal(FiltruAngajat filtru, Object valoare) { return filtru.filtruEgal(angajati, valoare); }


    private void initAdresa(List<Inventar> obiecte) {

        ServiceDate sDate = new ServiceDate(1);
        Data[] angajare = sDate.getDate();
        int[] salarii = {1200, 1500, 3000, 2400, 2750, 5000};
        ServiceCititor sCititor = new ServiceCititor(obiecte);
        Cititor[] cititori = sCititor.getCititori();

        Random random= new Random();
        for (int i = 0; i < angajati.length; i++) {
            int rand = random.nextInt(angajati.length);
            Angajat angajat = new Angajat(cititori[i].getNume(), cititori[i].getPrenume(), cititori[i].getNastere(), cititori[i].getCnp(),
                                cititori[i].getMail(), cititori[i].getNrTelefon(), cititori[i].getAdresa(), cititori[i].getAbonament(),
                                cititori[i].getImprumuturi(), angajare[random.nextInt(angajare.length)], salarii[random.nextInt(salarii.length)]);
            angajati[i] = angajat;
        }
    }
}
