import java.util.Scanner;
import java.util.Arrays;

public class MainGame {  
    public static void main(String[] args) {
        Ship carrierShip = new Ship(5, "Carrier", 4);
        Ship battleShip = new Ship(4, "Battleship", 3);
        Ship destroyerShip = new Ship(3, "Destroyer", 2);
        Ship submarineShip = new Ship(3, "Submarine", 1);
        Ship patrolShip = new Ship(2, "Patrol Ship", 0);

        char[][] emptyBoard = {
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray(),
            "..........".toCharArray()
        };

    }
    
    // INTERFACE COMPONENTS


    // PROCESSING COMPONENTS
    public static void targetSpace(char[][] board) {
        
    }

    public static void detectRemainingShips() {
    }


}
