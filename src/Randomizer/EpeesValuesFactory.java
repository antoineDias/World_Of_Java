package Randomizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EpeesValuesFactory {

    // Définition d'une liste de nom d'épées
    private static ArrayList listNomsEpees = new ArrayList(Arrays.asList(
            "Couronne de l'aigle",
            "Lame du roi",
            "Tranchant de la foudre",
            "Destinée du guerrier",
            "Souffle de dragon",
            "Fléau du chaos",
            "Sang de la nuit",
            "Lueur de lune",
            "Éclair de feu",
            "Justice de la lame",
            "Ombre de la nuit",
            "Griffe du tigre",
            "Lame du loup",
            "Héritage de la guerre",
            "Grâce du cygne",
            "Fureur de la tempête",
            "Éclat de cristal",
            "Foudre des cieux",
            "Givre de l'hiver",
            "Esprit du phénix",
            "Crocs de la bête",
            "Cœur du lion",
            "lumière",
            "Âme du héros",
            "Furie de l'enfer",
            "Briseur de sort",
            "Malédiction de la mort",
            "Tranchant de la guerre",
            "la flamme éternelle",
            "Tempête de la mer",
            "Lame de l'oubli",
            "Colère du dragon",
            "démon",
            "Foudroyant",
            "Lame du crépuscule",
            "la vérité",
            "Lueur de l'aube",
            "Lame de la mort",
            "la vengeance",
            "Briseur d'os",
            "Glace éternelle",
            "Lame de cristal",
            "l'ange",
            "Fleur de lys",
            "Foudre des ténèbres",
            "Lame de la destruction",
            "la nuit",
            "Sceau de la paix",
            "Grondant",
            "Lame du désespoir"));

    // Définition d'une liste de valeurs de dégat des épées
    private static ArrayList listdegatsEpees = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    //Constructor
    private EpeesValuesFactory() {
    }

    //Getter
    public ArrayList getListNoms() {
        return listNomsEpees;
    }

    // Fonction permettant de retourner un nom aléatoirement de listNomsEpees
    public static String nommerEpee(){
        Random random = new Random();
        int nombreAleaEpee = random.nextInt(49);
        return (String) listNomsEpees.get(nombreAleaEpee);
    }

    // Fonction permettant de retourner un nombre aléatoirement de listDegatsEpees
    public static Integer definirDegatsEpee(){
        Random random = new Random();
        int nombreAleaEpee = random.nextInt(9);
        return (int) listdegatsEpees.get(nombreAleaEpee);
    }

}
