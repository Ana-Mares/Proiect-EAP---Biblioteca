package servicii;

import clase.Adresa;
import servicii.filtre.FiltruAdresa;

import java.util.Random;

public class ServiceAdresa {
    Adresa[] adrese = new Adresa[40];

    public ServiceAdresa() {this.initAdresa();}

    public Adresa[] getAdrese() {
            return adrese;
            }

    public Adresa[] filtreaza(FiltruAdresa filtru, Object valoare) {
            return filtru.filtru(adrese, valoare);
            }

    private void initAdresa() {
        String[] judete = {"Bucuresti", "Cluj", "Brasov", "Iasi", "Constanta"};
        String[] localitati = {"Bucuresti", "Cluj-Napoca", "Brasov", "Iasi", "Constanta"};
        String[] strazi = {"Unirii", "Independentei", "Florilor", "Paralela", "Mihai Eminescu", "Garii", "Zorilor"};
        Random random= new Random();
        for (int i = 0; i < adrese.length; i++) {
            int rand = random.nextInt(judete.length);
            Adresa adresa = new Adresa (judete[rand], localitati[rand], strazi[random.nextInt(strazi.length)], random.nextInt(100));
            adrese[i] = adresa;
        }
    }
}
