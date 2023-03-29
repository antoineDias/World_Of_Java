package Personnages;

import java.util.ArrayList;
import java.util.List;

public class EquipeHeros extends Equipes{

    String nomTeamHero = "Equipe des Héros";
    List<Hero> listHeros = new ArrayList<>();
    public EquipeHeros() {
        super();
        this.nomTeamHero = nomTeamHero;
        this.listHeros = listHeros ;
    }

    public EquipeHeros(Integer taille) {
        super();
        this.tailleEquipe = taille;
        this.nomTeamHero = nomTeamHero;
        this.listHeros = listHeros ;
    }
    public String getNom() {
        return nomTeamHero;
    }

    public List<Hero> getListHeros() {
        return listHeros;
    }

    public void setListHeros(List<Hero> listHeros) {
        this.listHeros = listHeros;
    }
}
