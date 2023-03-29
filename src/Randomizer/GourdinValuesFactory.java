package Randomizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GourdinValuesFactory {


    // Définition d'une liste de nom de Gourdin
    private static ArrayList listNomsGourdins = new ArrayList(Arrays.asList(
        "Gourdin de pierre",
        "Gourdin de crâne",
        "Gourdin de dent",
        "Gourdin de bois",
        "Gourdin de fer",
        "Gourdin d'épine",
        "Gourdin de magma",
        "Gourdin de glace",
        "Gourdin de foudre",
        "Gourdin de venin",
        "Gourdin d'os",
        "Gourdin de métal",
        "Gourdin de cristal",
        "Gourdin de marbre",
        "Gourdin de lave",
        "Gourdin de sang",
        "Gourdin de lumière",
        "Gourdin d'ombre",
        "Gourdin de démon",
        "Gourdin d'ange",
        "Gourdin de dragon",
        "Gourdin de griffe",
        "Gourdin de queue",
        "Gourdin de tentacule",
        "Gourdin de serre",
        "Gourdin de boue",
        "Gourdin de roche",
        "Gourdin de cendre",
        "Gourdin de vapeur",
        "Gourdin de tempête",
        "Gourdin de nuage",
        "Gourdin de météore",
        "Gourdin de vortex",
        "Gourdin de glacier",
        "Gourdin de typhon",
        "Gourdin de cataclysme",
        "Gourdin de séisme",
        "Gourdin de feu",
        "Gourdin de glouton",
        "Gourdin de croc",
        "Gourdin de griffe",
        "Gourdin de tentacule",
        "Gourdin de sang",
        "Gourdin de tonnerre",
        "Gourdin de gelée",
        "Gourdin de croc de dragon",
        "Gourdin de griffe de bête",
        "Gourdin de sceptre du chaos",
        "Gourdin de masse d'énergie",
        "Gourdin de la vengeance"));

    // Définition d'une liste de valeurs de dégat des Gourdins
    private static ArrayList listdegatsGourdins = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    //Constructor
    private GourdinValuesFactory() {
    }

    //Getter
    public ArrayList getListNoms() {
        return listNomsGourdins;
    }

    // Fonction permettant de retourner un nom aléatoirement de listNomsGourdins
    public static String nommerGourdin(){
        Random random = new Random();
        int nombreAleaGourdin = random.nextInt(49);
        return (String) listNomsGourdins.get(nombreAleaGourdin);
    }

    // Fonction permettant de retourner un nombre aléatoirement de listDegatsGourdin
    public static Integer definirDegatsGourdin(){
        Random random = new Random();
        int nombreAleaGourdin = random.nextInt(9);
        return (int) listdegatsGourdins.get(nombreAleaGourdin);
    }

}
