package programme;

import facade.FacadeMare;
import facade.Grenade;
import poissons.Poisson;

import java.util.Collection;

import static java.lang.Thread.sleep;


public class Programme {

    public static void main(String[] args) throws InterruptedException {


        FacadeMare facadeMare = new FacadeMare();
        facadeMare.creerMare(40,50,3);
        facadeMare.animerMare();
        sleep(1500);
        facadeMare.gelerMare();
        System.out.println("La mare\n---------------------");
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));
        facadeMare.animerMare();
        sleep(1500);
        facadeMare.gelerMare();

        System.out.println("La mare\n---------------------");
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));


        Grenade grenade = new Grenade(20,25,20);

        Collection<Poisson> morts = facadeMare.lancerGrenade(grenade);
        System.out.println("Nombres de morts : "+ morts.size());

    }
}
