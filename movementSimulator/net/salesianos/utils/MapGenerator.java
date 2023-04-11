package movementSimulator.net.salesianos.utils;

import java.util.Random;

public class MapGenerator {
    public static String[][] mapGenerator(int size){
        String[][] generatedMap = new String[size][size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();

            for (int j = 0; j < size; j++) { //This allow us to generate random collisions for the character
                int randomInt = random.nextInt(11 - 1) + 1;

                if (randomInt <= 5){
                    generatedMap[i][j] = "X";
                }else{
                    generatedMap[i][j] = "#";
                }
            }
        }

        for (int i = 0; i < size; i++) { //This part of the function allow us to create borders on the 2d array
            generatedMap[0][i] = "#";
            generatedMap[size-1][i] = "#";
            generatedMap[i][0] = "#";
            generatedMap[i][size-1] = "#";
        }
        return generatedMap;
    }

    public static String mapKey(){
        String msg = "# -> Borde del mapa (no accesible)";
        msg += "\nX -> Suelo del mapa (accesible)";

        return msg;
    }
}
