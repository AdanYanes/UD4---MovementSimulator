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

    public void moveCharacter(int coordValue){
        if(coordValue == 1){
            int movement = playableCharacter.getCurrentXPosition() + playableCharacter.getMoveSpeed();
            if (ableToMoveX(movement)){
                playableCharacter.setCurrentXPosition(movement);
            }else if(ableToMoveX(movement - 1)){
                playableCharacter.setCurrentXPosition(movement - 1);
            }else{
                System.out.println("Ha llegado al borde y no puede avanzar mas");
            }

        }else if(coordValue == -1){
            int movement = playableCharacter.getCurrentXPosition() - playableCharacter.getMoveSpeed();
            if (ableToMoveX(movement)){
                playableCharacter.setCurrentXPosition(movement);
            }else if(ableToMoveX(movement + 1)){
                playableCharacter.setCurrentXPosition(movement + 1);
            }else{
                System.out.println("Ha llegado al borde y no puede avanzar mas");
            }

        }else if(coordValue == 2){
            int movement = playableCharacter.getCurrentYPosition() + playableCharacter.getMoveSpeed();
            if (ableToMoveY(movement)){
                playableCharacter.setCurrentYPosition(movement);
            }else if(ableToMoveY(movement - 1)){
                playableCharacter.setCurrentYPosition(movement - 1);
            }else{
                System.out.println("Ha llegado al borde y no puede avanzar mas");
            }

        }else if(coordValue == -2){
            int movement = playableCharacter.getCurrentYPosition() - playableCharacter.getMoveSpeed();
            if (ableToMoveY(movement)){
                playableCharacter.setCurrentYPosition(movement);
            }else if(ableToMoveY(movement + 1)){
                playableCharacter.setCurrentYPosition(movement + 1);
            }else{
                System.out.println("Ha llegado al borde y no puede avanzar mas");
            }
        }
    }

    private boolean ableToMoveX(int moveValue){
        if (map.mapGrid[moveValue][playableCharacter.getCurrentYPosition()].toString().equals("#")){
            return false;
        }else{
            return true;
        }
    }

    private boolean ableToMoveY(int moveValue){
        if (map.mapGrid[playableCharacter.getCurrentXPosition()][moveValue].toString().equals("#")){
            return false;
        }else{
            return true;
        }
    }

    public void setSpawnPoint(){
        int spawnCoords = Math.round(map.mapGrid.length/2);
        playableCharacter.setCurrentXPosition(spawnCoords);
        playableCharacter.setCurrentYPosition(spawnCoords);

        if (map.mapGrid[spawnCoords][spawnCoords].toString().equals("#")){
            map.mapGrid[spawnCoords][spawnCoords] = "X";
        }
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

    private String[][] updateMap(){
        String[][] updatedMap = map.mapGrid;

        if(isInBike){
            updatedMap[playableCharacter.getCurrentXPosition()][playableCharacter.getCurrentYPosition()] = "8";
        }else{
            updatedMap[playableCharacter.getCurrentXPosition()][playableCharacter.getCurrentYPosition()] = "0";
        }

        return updatedMap;
    }
}
