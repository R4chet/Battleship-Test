import java.util.Scanner;

public class Starter {
    
    public static void gameStart() {
        System.out.println("\n[[BOARD SETUP]]");
        // Prepare user board
        // Generate computer board
        // Begin turns
    }

    
    public static void boardGeneration() {

    }
    public static void shipPlacementMenu(char[][] board) {
        System.out.println("\n[[PREPARATION]]");
        System.out.println("Select the ship you would like to place: ");
        System.out.println("(1) Carrier [size 5] ");        
        System.out.println("(2) Battleship [size 4] ");     
        System.out.println("(3) Destroyer [size 3] ");      
        System.out.println("(4) Submarine [size 3] ");      
        System.out.println("(5) Patrol boat [size 2] ");    
        System.out.println("(0) Back ");
        System.out.print  ("Enter a choice: ");

        try (Scanner input = new Scanner(System.in)) {
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    shipPlacementSelection(5, board);
                    break;
                case 2:
                    shipPlacementSelection(4, board);
                    break;
                case 3:
                    shipPlacementSelection(3, board);
                    break;
                case 4:
                    shipPlacementSelection(3, board);
                    break;
                case 5:
                    shipPlacementSelection(2, board);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    shipPlacementMenu(board);
            }
        }

    }

    public static void shipPlacementSelection(int shipType, char[][] board) {
        System.out.println("Select placement orientation:");
        System.out.println("(1) Vertical");
        System.out.println("(2) Horizontal");
        System.out.println("(0) Cancel");
        System.out.print  ("Enter a choice: ");
        try (Scanner input = new Scanner(System.in)) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    verticalShipPlacement(shipType, board);
                    break;
                case 2:
                    horizontalShipPlacement(shipType, board);
                    break;
                case 0:
                    shipPlacementMenu(board);
                    break;
                default:
                System.out.println("Invalid choice, try again.");
                shipPlacementSelection(shipType, board);
            }
        }
    }

    public static void verticalShipPlacement(int shipSize, char[][] array) {
        System.out.println("\n[[VERTICAL PLACEMENT]]");
        System.out.println("Enter valid coordinates below:");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X: ");
            if (input.hasNextInt() == false) {
                System.out.println("Invalid coordinates, please try again.");
                verticalShipPlacement(shipSize, array);
            }
            int x = input.nextInt();
            System.out.print("Y: ");
            if (input.hasNextInt() == false) {
                System.out.println("Invalid coordinates, please try again.");
                verticalShipPlacement(shipSize, array);
            }
            int y = input.nextInt();
            
            for (int i = y; i > y - shipSize; i--) {
                if ((y - shipSize < -1 || y > array.length - 1) || (x < 0 || x > array.length - 1)) {
                    System.out.println("Invalid position.");
                    break;
                } 
                array[i][x] = '#';
            }
            return;
        }
    }

    public static void horizontalShipPlacement(int shipSize, char[][] array) {
        System.out.println("\n[[HORIZONTAL PLACEMENT]]");
        System.out.println("Enter valid coordinates below:");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X: ");
            if (input.hasNextInt() == false) {
                System.out.println("Invalid coordinates, please try again.");
                horizontalShipPlacement(shipSize, array);
            }
            int x = input.nextInt();
            System.out.print("Y: ");
            if (input.hasNextInt() == false) {
                System.out.println("Invalid coordinates, please try again.");
                horizontalShipPlacement(shipSize, array);
            }
            int y = input.nextInt();
            
            for (int i = x; i < x + shipSize; i++) {
                if ((x < 0 || x + shipSize > array.length) || (y < 0 || y > array.length - 1)) {
                    System.out.println("Invalid placement.");
                    break;
                }
                array[y][i] = '#';
            }
            return;
        }
    }

}
