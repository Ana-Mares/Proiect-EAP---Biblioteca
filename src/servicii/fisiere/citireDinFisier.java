package servicii.fisiere;

import clase.Imprumut;
import clase.Inventar;
import clase.Persoana;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class citireDinFisier {
    private List<Persoana> persoane = new ArrayList<>();
    private List<Inventar> inventar = new ArrayList<>();
    private List<Imprumut> imprumuturi = new ArrayList<>();

    public List<Persoana> getPersoane() {
        return persoane;
    }

    public void setPersoane(List<Persoana> persoane) {
        this.persoane = persoane;
    }

    public List<Inventar> getInventar() {
        return inventar;
    }

    public void setInventar(List<Inventar> inventar) {
        this.inventar = inventar;
    }

    public List<Imprumut> getImprumuturi() {
        return imprumuturi;
    }

    public void setImprumuturi(List<Imprumut> imprumuturi) {
        this.imprumuturi = imprumuturi;
    }

   // public void CitireCalculatoare() throws FileNotFoundException{
     //   SingletonR
   // }

}
