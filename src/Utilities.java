import java.util.Scanner;
import java.util.Arrays;

public class Utilities {
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
                    Starter.gameStart();
                    return;
                default:
                    System.out.println("Invalid choice.");
                }
            } while (choice == -1 || choice < 0 || choice > 1);
        }
    }


    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
                if (j != board[0].length - 1)
                    continue;
                System.out.println("");
            }
        }
        return;
    }

    public static void targetSpace(char[][] board) {
        
    }

    public static void detectRemainingShips() {
    }

    public static void hideShips() {
        
    }
}
