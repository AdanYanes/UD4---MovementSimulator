package movementSimulator.net.salesianos;

public class GameMenu {
    private Character playableCharacter = new Character("default");
    public Map map = new Map();

    public boolean isInBike = false;

    public void mountBike(){
        if(isInBike){
            System.out.println("El jugador ya esta montado en la bicicleta");
        }else{
            isInBike = true;
            playableCharacter.setMoveSpeed(playableCharacter.getBIKE_SPEED());
        }
    }

    public void dissmountBike(){
        if(isInBike){
            isInBike = false;
            playableCharacter.setMoveSpeed(playableCharacter.getWALKING_SPEED());
        }else{
            System.out.println("El jugador ya esta caminando");
        }
    }

    public void moveCharacter(String coorValue){ //TODO: Refactor this
        if(coorValue.equals("S")){
            int movement = playableCharacter.getCurrentXPosition() + playableCharacter.getMoveSpeed();

            if (!ableToMoveX(movement)){
                System.out.println("No puede avanzar en esta direccion");
            }else if(ableToMoveX(movement)){
                playableCharacter.setCurrentXPosition(movement);
            }else{
                playableCharacter.setCurrentXPosition(movement - 1);
            }

        }else if(coorValue.equals("W")){
            int movement = playableCharacter.getCurrentXPosition() - playableCharacter.getMoveSpeed();

            if (!ableToMoveX(movement)){
                System.out.println("No puede avanzar en esta direccion");
            }else if(ableToMoveX(movement)){
                playableCharacter.setCurrentXPosition(movement);
            }else{
                playableCharacter.setCurrentXPosition(movement + 1);
            }

        }else if(coorValue.equals("D")){
            int movement = playableCharacter.getCurrentYPosition() + playableCharacter.getMoveSpeed();

            if (!ableToMoveY(movement)){
                System.out.println("No puede avanzar en esta direccion");
            }else if(ableToMoveY(movement)){
                playableCharacter.setCurrentYPosition(movement);
            }else{
                playableCharacter.setCurrentYPosition(movement - 1);
            }

        }else if(coorValue.equals("A")){
            int movement = playableCharacter.getCurrentYPosition() - playableCharacter.getMoveSpeed();

            if (!ableToMoveY(movement)){
                System.out.println("No puede avanzar en esta direccion");
            }else if(ableToMoveY(movement)){
                playableCharacter.setCurrentYPosition(movement);
            }else{
                playableCharacter.setCurrentYPosition(movement + 1);
            }
        }
    }

    private boolean ableToMoveX(int moveValue){ //TODO: Refactor this
        if (map.mapGrid[moveValue][playableCharacter.getCurrentYPosition()].toString().equals("#")){
            return false;
        }else{
            return true;
        }
    }

    private boolean ableToMoveY(int moveValue){ //TODO: Refactor this
        if (map.mapGrid[playableCharacter.getCurrentXPosition()][moveValue].toString().equals("#")){
            return false;
        }else{
            return true;
        }
    }

    public void setSpawnPoint(){
        int spawnCoords = Math.round(map.mapGrid.length/2);

        if (map.mapGrid[spawnCoords][spawnCoords].toString().equals("#")){
            map.mapGrid[spawnCoords][spawnCoords] = "X";
        }

        playableCharacter.setCurrentXPosition(spawnCoords);
        playableCharacter.setCurrentYPosition(spawnCoords);
    }

    public void showMap(){
        updateMap();

        for (int i = 0; i < updateMap().length; i++) {
            for (int j = 0; j < updateMap()[i].length; j++) {
                System.out.print(updateMap()[i][j]+ "   ");
            }
            System.out.println("\n");
        }
    }

    public void showMapKey(){
        System.out.println("# -> Colision del mapa (No accesible)");
        System.out.println("X -> Suelo del mapa (Accesible)");
        System.out.println("O -> Posición del personaje (Caminando)");
        System.out.println("X -> Posición del personaje (En bicicleta)");
    }

    private String[][] updateMap(){
        String[][] updatedMap = new String[map.mapGrid.length][map.mapGrid[0].length]; //I generate a "second map" to leave intact the original one
        for (int i = 0; i < map.mapGrid.length; i++) {
            for (int j = 0; j < map.mapGrid[i].length; j++) {
                updatedMap[i][j] = map.mapGrid[i][j];
            }
        }

        if(isInBike){
            updatedMap[playableCharacter.getCurrentXPosition()][playableCharacter.getCurrentYPosition()] = "8";
        }else{
            updatedMap[playableCharacter.getCurrentXPosition()][playableCharacter.getCurrentYPosition()] = "0";
        }

        return updatedMap;
    }
}