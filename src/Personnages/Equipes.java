package Personnages;

public abstract class Equipes {

    int tailleEquipe;

    public Equipes() {
        this.tailleEquipe = tailleEquipe;
    }
    public int getTailleEquipe() {
        return tailleEquipe;
    }

    @Override
    public String toString() {
        return "Equipes{" +
                "tailleEquipe=" + tailleEquipe +
                '}';
    }
}
