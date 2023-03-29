package Personnages;

public class EquipeMonstres extends Equipes {

    String nomTeamMonstre = "Equipe des Monstres";
    //List<Hero> = new
    public EquipeMonstres() {
        super();
        this.nomTeamMonstre = nomTeamMonstre;
    }
    public EquipeMonstres(Integer taille) {
        super();
        this.tailleEquipe = taille;
        this.nomTeamMonstre = nomTeamMonstre;
    }

    public String getNom() {
        return nomTeamMonstre;
    }

}
