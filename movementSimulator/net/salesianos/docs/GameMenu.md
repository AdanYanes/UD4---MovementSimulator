# GameMenu

This class serves as a link between the [character](../docs/Character.md) class and the [map](../docs/Map.md) one. We find several methods in here.

1. mountBike(): this one is and if-else statement checking if the player is already mounted on a bike. we are able to check this thanks to a 
bolean variable called **isInBike**. In case this boolean is true, the methods will print us an error, if not, boolean becomes true and the player 
move speed change.

2. dissmountBike(): Similar to previous one but, in this case, we check if the bolean is false. If !isInBike, it will print us an error, if not, boolean becomes false and the player move speed change.

3. moveCharacter(String input): This method will change the character current position

4. ableToMove(): checks if the character is able to move to the next cell.

5. setSpawnPoint(): It determinate the original X and Y value for the player.

6. showMap(): It print the player the map thanks to a for loop inside another for loop

7. updateMap(): This methods create a new 2d array based on the map we create in the [Map.java class](../docs/Map.md) and check for the player position and print it depending on the boolean isInBike. 
