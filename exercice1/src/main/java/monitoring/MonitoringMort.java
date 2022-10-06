package monitoring;

import lombok.Getter;

@Getter
public class MonitoringMort implements Observer{

    private int nombrePoissonEnVie;
    private int nombrePoissonMortMortDerniereGrenade;

    public MonitoringMort(int nombrePoissonEnVie) {
        this.nombrePoissonEnVie = nombrePoissonEnVie;
        nombrePoissonMortMortDerniereGrenade =0;
    }

    @Override
    public void update(TypeEvenement typeEvenement) {
        if (typeEvenement.equals(TypeEvenement.MORT)) {
            nombrePoissonMortMortDerniereGrenade++;
            nombrePoissonEnVie--;
            System.out.println("oulala le mort");
        }
    }
    public void display(){
        System.out.println("MORT LORS DE LA DERNIERE GRENADE : " + nombrePoissonMortMortDerniereGrenade);
        System.out.println("POISSONS ENCORE EN VIE : " + nombrePoissonEnVie);
    }
}
