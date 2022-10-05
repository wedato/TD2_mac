package facade;

import mare.Mare;
import poissons.comportements.ComportementDeplacementMort;
import poissons.Poisson;

import java.util.ArrayList;
import java.util.Collection;

public class Grenade {


    private int x;
    private int y;
    double rayon;

    public Grenade(int x, int y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }


    public Collection<Poisson> exploser(Mare mare) {
        Collection<Poisson> victimes = new ArrayList<>();
        for (Poisson poisson : mare.getPoissons()) {
            if ((Math.pow((poisson.getX()-this.x),2)+
                    Math.pow((poisson.getY()-this.y),2))<=
                    Math.pow(rayon,2)) {
                poisson.setComportementDeplacement(
                        new ComportementDeplacementMort());
                victimes.add(poisson);
            }
        }
        return victimes;
    }
}
