import Personnages.Hero;
import Personnages.Monstre;
import Randomizer.EpeesValuesFactory;
import Randomizer.HeroValuesFactory;
import Randomizer.MonstreValuesFactory;
import objets.Armes;
import objets.Epee;
import objets.Gourdin;

public class Main {
    public static void main(String[] args) {

        Epee epee = new Epee();
        System.out.println(epee);
        System.out.println("----------");

        Gourdin gourd1 = new Gourdin();
        System.out.println(gourd1);
        System.out.println("----------");

        Hero hero1 = new Hero();
        System.out.println(hero1);
        System.out.println(hero1.getInventaire());
        System.out.println("----------");

        Monstre monstre1 = new Monstre();
        System.out.println(monstre1);
        System.out.println(monstre1.getInventaire());
        System.out.println("----------");

        hero1.attaquerUnAdversaire(monstre1);
        System.out.println("----------");

    }
}