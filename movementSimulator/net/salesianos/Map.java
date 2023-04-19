package movementSimulator.net.salesianos;

import movementSimulator.net.salesianos.utils.MapGenerator;

public class Map {
    private int mapSize;
    String mapGrid[][];

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
        mapGrid = MapGenerator.mapGenerator(this.mapSize);
    }
}
