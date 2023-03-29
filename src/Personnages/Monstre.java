package Personnages;

import Randomizer.HeroValuesFactory;
import Randomizer.MonstreValuesFactory;
import objets.Armes;
import objets.Epee;
import objets.Gourdin;
import objets.Objet;

import java.util.ArrayList;
import java.util.List;

public class Monstre {

    int pointsDeVie ;
    String nom;
    Armes arme;
    List<Objet> inventaire;
    public Monstre() {
        super();
        this.pointsDeVie = 25;
        this.nom = MonstreValuesFactory.nommerMonstre();
        this.arme = new Gourdin();
        this.inventaire = new ArrayList<>();
        inventaire.add(this.arme);
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public Armes getArme() {
        return arme;
    }

    public List<Objet> getInventaire() {
        return inventaire;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setArme(Armes arme) {
        this.arme = arme;
    }

    public void setInventaire(List<Objet> inventaire) {
        this.inventaire = inventaire;
    }

    @Override
    public String toString() {
        return nom;
    }

    public void attaquerUnAdversaire (Hero hero){
        if (inventaire.contains(arme)){
            System.out.println(nom+" attaque "+ hero+" avec "+arme.getCategorie()+" '" +arme.getNomArme()+"' :");
            recevoirDesDegats(arme);
            System.out.println(hero.nom+" a perdu "+arme.getDegatArme()+"pv : Il lui reste "+hero.getPointsDeVie()+"pv.");
        } else {
            System.out.println(nom+" ne dispose pas d'arme !");
        }
    }
    private void recevoirDesDegats(Armes arme) {
        setPointsDeVie((getPointsDeVie())-(arme.getDegatArme()));
    }

}
