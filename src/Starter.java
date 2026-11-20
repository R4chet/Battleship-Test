import java.util.Scanner;

public class Starter {
    
    public static void gameStart() {
        System.out.println("[[BOARD SETUP]]");
        // Prepare user board
        // Generate computer board
        // Begin turns
    }

    
    public static void boardGeneration() {

    }

    public static void shipPlacementMenu(int shipType, char[][] board) {
        System.out.println("Select placement orientation: \n(0) Vertical \n(1) Horizontal");
        try (Scanner input = new Scanner(System.in)) {
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    verticalShipPlacement(shipType, board);
                    break;
                case 1:
                    horizontalShipPlacement(shipType, board);
                    break;
                default:
                System.out.println("Invalid choice, try again.");
            }
        }
    }

    public static void verticalShipPlacement(int shipSize, char[][] array) {
        System.out.println("[[VERTICAL PLACEMENT]]");
        System.out.println("Enter valid coordinates below:");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X: ");
            int x = input.nextInt();
            System.out.print("Y: ");
            int y = input.nextInt();
            
            for (int i = y; i > y - shipSize; i--) {
                if ((y - shipSize < 0 || y > array.length - 1) || (x < 0 || x > array.length - 1)) {
                    System.out.println("Invalid position.");
                    break;
                } 
                array[i][x] = '#';
            }
            return;
        }
    }

    public static void horizontalShipPlacement(int shipSize, char[][] array) {
        System.out.println("[[HORIZONTAL PLACEMENT]]");
        System.out.println("Enter valid coordinates below:");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X: ");
            int x = input.nextInt();
            System.out.print("Y: ");
            int y = input.nextInt();
            
            for (int i = x; i < x + shipSize; i++) {
                if ((x < 0 || x + shipSize > array.length - 1) || (y < 0 || y > array.length - 1)) {
                    System.out.println("Invalid placement.");
                    break;
                }
                array[y][i] = '#';
            }
            return;
        }
    }

}
