package objets;

public abstract class Armes extends Objet{

    protected String nomArme;
    protected int degatArme;
    protected int longueurArme;
    protected int poidsArme;
    protected String categorie;

    // Constructors
    public Armes(String nomArme, int degatArme, int longueurArme, int poidsArme) {
        this.nomArme = nomArme;
        this.degatArme = degatArme;
        this.longueurArme = longueurArme;
        this.poidsArme = poidsArme;
    }

    public Armes() {
        String nomArme;
        int degatArme;
        int longueurArme;
        int poidsArme;
    }

    //Getters
    public String getNomArme() {
        return nomArme;
    }
    public int getDegatArme() {
        return degatArme;
    }
    public int getLongueurArme() {
        return longueurArme;
    }
    public int getPoidsArme() {
        return poidsArme;
    }

    public String getCategorie() {
        return categorie;
    }
}
