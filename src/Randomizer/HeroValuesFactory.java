package Randomizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HeroValuesFactory {

    // Définition d'une liste de nom de Héro
    private static ArrayList listNomsHeros = new ArrayList(Arrays.asList(
            "Eryndor",
            "Thalassia",
            "Kaelar",
            "Drathir",
            "Elvandar",
            "Galadrim",
            "Naiad",
            "Myrlin",
            "Belarion",
            "Tareldar",
            "Arwynn",
            "Ariastrae",
            "Eldorin",
            "Faerindor",
            "Ithildin",
            "Alatar",
            "Aredhel",
            "Calandil",
            "Cirdan",
            "Daelin",
            "Drogathar",
            "Elerion",
            "Elladan",
            "Elrondir",
            "Faelivrin",
            "Fendrel",
            "Galathil",
            "Glanduin",
            "Haladan",
            "Idhreniel",
            "Isilme",
            "Kethril",
            "Lairelosse",
            "Lorindar",
            "Melian",
            "Merilwen",
            "Nalatharion",
            "Nimrodel",
            "Orodreth",
            "Rhaegal",
            "Sildarion",
            "Talindor",
            "Tathariel",
            "Thaloril",
            "Tharandil",
            "Uldorin",
            "Valandil",
            "Vardaen",
            "Yavanna",
            "Zephyrion"));

    //Constructor
    public HeroValuesFactory() {
    }

    //Getter
    public static ArrayList getListNomsHeros() {
        return listNomsHeros;
    }

    // Fonction permettant de retourner un nom aléatoirement de listNomsHeros
    public static String nommerHero(){
        Random random = new Random();
        int nombreAleaHero = random.nextInt(49);
        return (String) listNomsHeros.get(nombreAleaHero);
    }

}
