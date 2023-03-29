package objets;

import Randomizer.EpeesValuesFactory;
import Randomizer.GourdinValuesFactory;

public class Gourdin extends Armes{

    //Initialisation d'un compteur du nombre de gourdin créé
    int nombreGouridnGenere = 0;
    String categorie = "Gourdin";

    public Gourdin(String nomArme, int degatArme, int longueurArme, int poidsArme) {
        super(nomArme, degatArme, longueurArme, poidsArme);
        String categorie = "Gourdin";
        nombreGouridnGenere += 1;
    }
    public Gourdin() {
        super();
        this.categorie = categorie;
        nombreGouridnGenere += 1;
        nomArme = GourdinValuesFactory.nommerGourdin();
        degatArme = GourdinValuesFactory.definirDegatsGourdin();
        switch (this.degatArme){
            case 1 : longueurArme = 50; poidsArme = 500; break;
            case 2 : longueurArme = 60; poidsArme = 600; break;
            case 3 : longueurArme = 70; poidsArme = 700; break;
            case 4 : longueurArme = 80; poidsArme = 800; break;
            case 5 : longueurArme = 90; poidsArme = 900; break;
            case 6 : longueurArme = 100; poidsArme = 1000; break;
            case 7 : longueurArme = 125; poidsArme = 1100; break;
            case 8 : longueurArme = 150; poidsArme = 1200; break;
            case 9 : longueurArme = 175; poidsArme = 1300; break;
            case 10 : longueurArme = 200; poidsArme = 1400; break;
        }
    }

    public int getNombreGourdinGenere() {
        return nombreGouridnGenere;
    }

    public String getCategorie() {
        return categorie;
    }

    @Override
    public String toString() {
        return "'"+getNomArme()+
                "' : Dégats("+getDegatArme()+
                ") | Longueur("
                +getLongueurArme()+"cm) | Poids("
                +getPoidsArme()+"grammes)";
    }
}
