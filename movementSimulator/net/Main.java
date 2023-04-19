package movementSimulator.net;

import movementSimulator.net.salesianos.GameMenu;
import movementSimulator.net.salesianos.utils.StaticScanner;

public class Main{
    public static void main(String[] args) {

        int option = 1;

        GameMenu menu = new GameMenu();

        menu.map.setMapSize(10);

        menu.setSpawnPoint();

        System.out.println("Bienvenido, jugador");

        while(option != 0){
            System.out.println("Por favor, elija una de las siguientes opciones");
            System.out.println("1. Desplazar al personaje");
            System.out.println("2. Montar/Desmontar al personaje en la bicicleta");
            System.out.println("3. Mostrar el mapa");
            System.out.println("4. Mostrar la leyenda del mapa");
            System.out.println("5. Cerrar el juego");
            option = Integer.parseInt(StaticScanner.scanner.nextLine());

            switch(option){
                case 1:{
                    System.out.println("Por favor, elija una de las siguientes opciones:");
                    System.out.println("W. Avanzar hacia adelante");
                    System.out.println("S. Avanzar hacia atras");
                    System.out.println("D. Avanzar a la derecha");
                    System.out.println("A. Avanzar a la izquierda");
                    String input = StaticScanner.scanner.nextLine().toUpperCase();

                    menu.moveCharacter(input);
                    break;
                }
                case 2:{
                    System.out.println("Por favor, elija una de las siguientes opciones:");
                    System.out.println("1. Montar en la bicicleta");
                    System.out.println("2. Desmontar de la bicicleta");
                    int input = Integer.parseInt(StaticScanner.scanner.nextLine());

                    if(input == 1){
                        menu.mountBike();
                    }else{
                        menu.dissmountBike();
                    }
                    break;
                }
                case 3:{
                    menu.showMap();
                    break;
                }
                case 4:{
                    menu.showMapKey();
                    break;
                }
                case 5:{
                    System.out.println("Muchas gracias por haber jugado!");
                    break;
                }
            }
        }
    }
}