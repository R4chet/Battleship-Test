import java.util.Scanner;
import java.util.Arrays;

public class MainGame {  
    public static void main(String[] args) {
        Ship carrier = new Ship(5);
        Ship battleship = new Ship(4);
        Ship destroyer = new Ship(3);
        Ship submarine = new Ship(3);
        Ship patrol = new Ship(2);
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

        horizontalShipPlacement(2, emptyBoard);
        printBoard(emptyBoard);
    }
    
    // INTERFACE COMPONENTS

    public static void mainMenu() {
        System.out.println("===========================================================================================");
        System.out.println(" ______   _______ __________________ _        _______  _______          _________ _______");
        System.out.println("(  ___ \\ (  ___  )\\__   __/\\__   __/( \\      (  ____ \\(  ____ \\|\\     /|\\__   __/(  ____ ) ");
        System.out.println("| (   ) )| (   ) |   ) (      ) (   | (      | (    \\/| (    \\/| )   ( |   ) (   | (    )|");
        System.out.println("| (__/ / | (___) |   | |      | |   | |      | (__    | (_____ | (___) |   | |   | (____)|");
        System.out.println("|  __ (  |  ___  |   | |      | |   | |      |  __)   (_____  )|  ___  |   | |   |  _____)");
        System.out.println("| (  \\ \\ | (   ) |   | |      | |   | |      | (            ) || (   ) |   | |   | (");
        System.out.println("| )___) )| )   ( |   | |      | |   | (____/\\| (____/\\/\\____) || )   ( |___) (___| )");
        System.out.println("|/ \\___/ |/     \\|   )_(      )_(   (_______/(_______/\\_______)|/     \\|\\_______/|/\n");
        
        System.out.println("===========================================================================================");
        System.out.println("Welcome to a modified version of BATTLESHIP!");
        System.out.println("(1) Start");
        System.out.println("(0) Exit");
        System.out.println("===========================================================================================");

        mainMenuLogic();
    }

    public static void printBoard(char[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
                if (j != array[0].length - 1)
                    continue;
                System.out.println("");
            }
        }
        return;
    }

    public static void gameStart() {
        System.out.println("[[BOARD SETUP]]");
    }

    // PROCESSING COMPONENTS

    public static void boardGeneration() {

    }

    public static void verticalShipPlacement(int shipSize, char[][] array) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X-Coordinate: ");
            int x = input.nextInt();
            System.out.print("Y-Coordinate: ");
            int y = input.nextInt();
            
            for (int i = y; i > y - shipSize; i--) {
                if ((y - shipSize < 0 || y > 9) || (x < 0 || x > 9)) {
                    System.out.println("Invalid placement.");
                    break;
                }
                array[i][x] = '#';
            }
            return;
        }
    }

    public static void horizontalShipPlacement(int shipSize, char[][] array) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X-Coordinate: ");
            int x = input.nextInt();
            System.out.print("Y-Coordinate: ");
            int y = input.nextInt();
            
            for (int i = x; i < x + shipSize; i++) {
                if ((x < 0 || x + shipSize > 9) || (y < 0 || y > 9)) {
                    System.out.println("Invalid placement.");
                    break;
                }
                array[y][i] = '#';
            }
            return;
        }
    }

    public static void mainMenuLogic() {
        try (Scanner input = new Scanner(System.in)) {
            int choice = -1;
            do {
                choice = input.nextInt();
                switch (choice) {
                case 0:
                    return;
                case 1:
                    gameStart();
                    return;
                default:
                    System.out.println("Invalid choice.");
                }
            } while (choice == -1 || choice < 0 || choice > 1);
        }
    }

    public static void targetSpace(int x, int y, char[][] trueBoard, char[][] displayBoard) {
        
    }
}
