Main.java is the hearth of the project. This is the file that we are going to execute for being able to run the project.

Here we can find a **while loop** controlled by an int variable called **option**. Once we start the loop, it will ask the player for an input that we will 
save in the same **option** variable and thanks to a **switch-case** we will run different actions depending on the **option** value.

In the first option, the character movement, our program will ask the player to make a new input to determinate where the player is going to be moved.
(Check the [GameMenu documentation](../docs/GameMenu.md) for and explanation about how this work)

For the second one, the player must make a new imput in case he want to force the character to mount or dissmount the bike, allowing him to 
move two (2) cells in case is in the bike. (Check the mountBike() method in [GameMenu documentation](../docs/GameMenu.md) for and explanation about how this work)

The third option is going to show the player the current map. (Check the [GameMenu documentation](../docs/GameMenu.md) for and explanation about how this work)

The fourth one is going to show the player le map key. (Check the [GameMenu documentation](../docs/GameMenu.md) for and explanation about how this work)

The fifth option closes the game.