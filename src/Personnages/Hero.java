package Personnages;

import Interractions.Combattre;
import Randomizer.HeroValuesFactory;
import objets.Armes;
import objets.Epee;
import objets.Objet;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Hero extends EquipeHeros {

    int pointsDeVie ;
    String nom;
    Armes arme;
    List<Objet> inventaire;
    public Hero() {
        super();
        this.pointsDeVie = 30;
        this.nom = HeroValuesFactory.nommerHero();
        this.arme = new Epee();
        this.inventaire = new ArrayList<>();
        inventaire.add(this.arme);
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    @Override
    public String getNom() {
        return nom;
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

    private void recevoirDesDegats(Armes arme) {
        setPointsDeVie((getPointsDeVie())-(arme.getDegatArme()));
    }

    public void attaquerUnAdversaire(Monstre monstre) {
        if (inventaire.contains(arme)){
            System.out.println(nom+" attaque "+ monstre+" avec son "+arme.getCategorie()+" '"+arme.getNomArme()+"' :");
            recevoirDesDegats(arme);
            System.out.println(monstre.nom+" a perdu "+arme.getDegatArme()+"pv : Il lui reste "+monstre.getPointsDeVie()+"pv.");
        } else {
            System.out.println(nom+" ne dispose pas d'arme !");
        }

    }
}
