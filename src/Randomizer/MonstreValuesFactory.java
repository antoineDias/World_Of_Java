package Randomizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MonstreValuesFactory {


    // Définition d'une liste de nom de Héro
    private static ArrayList listNomsMonstres = new ArrayList(Arrays.asList(
            "Grommash",
            "Grimgor",
            "Gorbad",
            "Skarr",
            "Nazûl",
            "Uzguk",
            "Krug",
            "Grukk",
            "Rokgar",
            "Uzguk",
            "Skarz",
            "Krogath",
            "Throg",
            "Grubdub",
            "Snagrod",
            "Gorfang",
            "Skarronk",
            "Hrogath",
            "Gorzak",
            "Uzgul",
            "Skarsnik",
            "Gorgutz",
            "Grimgnak",
            "Krukk",
            "Gorfaz",
            "Krogg",
            "Skarfang",
            "Gruzzak",
            "Uzgulak",
            "Snikch",
            "Gorm",
            "Groshnok",
            "Skulkrak",
            "Krugg",
            "Gorlak",
            "Gorglak",
            "Skargul",
            "Rokgarok",
            "Grokk",
            "Skarzag",
            "Grugg",
            "Uzgulash",
            "Gruumsh",
            "Skarlash",
            "Krugga",
            "Gorgu",
            "Skorvak",
            "Uzgutok",
            "Gruzznak",
            "Grimsnag"));

    //Constructor
    public MonstreValuesFactory() {
    }

    //Getter
    public static ArrayList getListNomsMonstres() {
        return listNomsMonstres;
    }

    // Fonction permettant de retourner un nom aléatoirement de listNomsHeros
    public static String nommerMonstre(){
        Random random = new Random();
        int nombreAleaMonstre = random.nextInt(49);
        return (String) listNomsMonstres.get(nombreAleaMonstre);
    }

}
