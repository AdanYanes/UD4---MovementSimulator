package movementSimulator.net;

import java.util.Arrays;

import movementSimulator.net.salesianos.utils.MapGenerator;

public class Main{
    public static void main(String[] args) {
    
        System.out.println(Arrays.deepToString(MapGenerator.mapGenerator(10)));
    }
}