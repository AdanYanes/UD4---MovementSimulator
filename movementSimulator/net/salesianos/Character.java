package movementSimulator.net.salesianos;

public class Character {
    private String name;

    private int currentYPosition;
    private int currentXPosition;
    private int moveSpeed;

    private final int WALKING_SPEED = 1;
    private final int BIKE_SPEED = 2;


    public Character(String name){
        this.name = name;
        currentXPosition = 0;
        currentYPosition = 0;
        moveSpeed = WALKING_SPEED;
    }

    public int getBIKE_SPEED() {
        return BIKE_SPEED;
    }
    public int getWALKING_SPEED() {
        return WALKING_SPEED;
    }

    public int getCurrentXPosition() {
        return currentXPosition;
    }
    public void setCurrentXPosition(int currentXPosition) {
        this.currentXPosition = currentXPosition;
    }
    public int getCurrentYPosition() {
        return currentYPosition;
    }
    public void setCurrentYPosition(int currentYPosition) {
        this.currentYPosition = currentYPosition;
    }
    public int getMoveSpeed() {
        return moveSpeed;
    }
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
