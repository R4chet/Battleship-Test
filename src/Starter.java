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

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Place a carrier [size 5]: ");
            shipPlacementSelection(5, board);
            System.out.println("Place a battleship [size 4]: ");
            shipPlacementSelection(4, board);
            System.out.println("Place a cruiser [size 3]: ");
            shipPlacementSelection(3, board);
            System.out.println("Place a submarine [size 3]: ");
            shipPlacementSelection(3, board);
            System.out.println("Place a patrol boat [size 2]: ");
            shipPlacementSelection(2, board);
        }

    }

    public static void shipPlacementSelection(int shipType, char[][] board) {
        System.out.println("Select placement orientation:");
        System.out.println("(1) Vertical");
        System.out.println("(2) Horizontal");
        System.out.print  ("Enter a choice: ");
        try (Scanner input = new Scanner(System.in)) {
            int choice;
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                choice = 0;
            }
            switch (choice) {
                case 1:
                    verticalShipPlacement(shipType, board);
                    break;
                case 2:
                    horizontalShipPlacement(shipType, board);
                    break;
                default:
                System.out.println("Invalid choice, please try again.");
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
            if ((y - shipSize < -1 || y > array.length - 1) || (x < 0 || x > array.length - 1)) {
                    System.out.println("Invalid position.");
                    verticalShipPlacement(shipSize, array);
                } 
            
            for (int i = y; i > y - shipSize; i--) {
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
            if ((x < 0 || x + shipSize > array.length) || (y < 0 || y > array.length - 1)) {
                    System.out.println("Invalid placement.");
                    horizontalShipPlacement(shipSize, array);
                }
            
            for (int i = x; i < x + shipSize; i++) {
                array[y][i] = '#';
            }
            return;
        }
    }

}
