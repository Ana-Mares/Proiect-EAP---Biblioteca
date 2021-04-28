package servicii;

import clase.*;

import java.util.*;

public class ServiceCititor {
    Cititor[] cititori = new Cititor[10];

    public ServiceCititor(List<Inventar> obiecte) {
        this.initCititor(obiecte);
    }

    public Cititor[] getCititori() {
        return cititori;
    }

    private void initCititor(List<Inventar> obiecte) {
        String[] nume = {"Ionescu", "Popescu", "Vasilescu", "Johnson", "McDaniel", "Muller", "Garcia", "Dinu", "Dobre", "Apostol"};
        String[] prenume = {"Marcel", "Daniel", "Gabriel", "John", "Damian", "Paul", "Luis", "Sofia", "Andreea", "Diana", "Maria", "Emma", "Sara", "Lucia"};
        //ServiceDate sDate = new ServiceDate();
        //Data[] nastere = sDate.getDate();

        Random random = new Random();
        String[] cnpF = {"2900607045166", "6010526091280", "2970122128344", "2860909050534", "2950330258499", "6030425157340", "2741030430028", "2990720123426", "2870217053629"};
        String[] cnpB = {"1900714447685", "1900714447685", "5020604302550", "1970907369880", "1911106012001", "1891023202108", "5000419210772", "1960226432859", "1780517052614"};
        Transformari transformare = new Transformari();

        String[] nrTel = new String[cititori.length];
        for (int i = 0; i < cititori.length; i++) {
            nrTel[i] = "07";
            for (int j = 2; j < 10; j++)
                nrTel[i] = nrTel[i] + random.nextInt(10);
        }
        ServiceAdresa sAdresa = new ServiceAdresa();
        Adresa[] adresa = sAdresa.getAdrese();
        ServiceAbonament sAbonament = new ServiceAbonament();
        Abonament [] abonamente = sAbonament.getAbonamente();;

        int f = 0; int b = 0;
        for (int i = 0; i < cititori.length; i++){
            String tempNume = nume[random.nextInt(nume.length)];
            int temp = random.nextInt(prenume.length);
            String tempPrenume = prenume[temp];
            String tempCnp;
            if (temp < 7) {
                tempCnp = cnpB[b];
                b++;}
            else {
                tempCnp = cnpF[f];
                f++;
            }
            String mail = transformare.scriereMinuscule(tempNume) + '.' + transformare.scriereMinuscule(tempPrenume) + "@gmail.com";
            ExtragereInfoCNP extrageInfo = new ExtragereInfoCNP(tempCnp);
            Data nastere = extrageInfo.extragereInfo(tempCnp);
            ServiceImprumut sImprumut = new ServiceImprumut(obiecte);
            List<Imprumut> imprumut = new ArrayList<>();
            imprumut.addAll(Arrays.asList(sImprumut.getImprumuturi()));
            //Imprumut[] imprumut = sImprumut.getImprumuturi();
            //System.out.println("Imprumutul A     ");
           /* int j = 0;

            while (imprumut[j].getImprumutare() != null)
            {
                System.out.println(j);
                System.out.println(imprumut[j].toString());
            System.out.println("\n");
            j++;}
*/
            Cititor cititor = new Cititor(tempNume, tempPrenume,nastere, tempCnp, mail, nrTel[i], adresa[i], abonamente[random.nextInt(abonamente.length)], imprumut);
            cititori[i] = cititor;
        }

    }
}



