import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        //welcomes the player and explains the game
        System.out.println("Welcome to battle ship!");
        System.out.println("The enemy has 3 (1x1) ships. If you hit one, it will be marked as an \"X\"");
        
        //sets everything up for the game to start
        Scanner scanner = new Scanner(System.in);
        boolean isGameOver = false;
        Board board = new Board();
        String[][] boardArray = board.NewBoard();
        Board.PrintBoard(boardArray);
        String[] enemySpaces = Board.ChooseEnemySpaces();

        //the game loop
        while (isGameOver == false) {
            
            //get an input from the user and check that it's a valid input
            System.out.println("Enter the space that you'd like to attack. Ex: A1, B4, C2, D3... etc");
            String input = scanner.nextLine();
            while (Board.DoesBoardContain(input.toUpperCase()) == false) {
                System.out.println("That's not a valid space. Try again");
                input = scanner.nextLine();
            }

            //what to do once a valid input is given..

            //marks the players move then prints out the board
            boardArray = Board.MarkThePlayersMove(boardArray, input, enemySpaces);
            Board.PrintBoard(boardArray);

            //checks to see if the player has hit all 3 of the enemy ships then updates isGameOver accordingly
            isGameOver = Board.CheckForGameOver(enemySpaces, boardArray);


            // for seeing the enemy spaces if you need to
            //for (String item : enemySpaces) {
            //    System.out.println(item);
            //}

            //code to start a new game if the game has ended
            if (isGameOver == true) {
                System.out.println(" ");
                System.out.println("You won!");
                CertificateCreator.CreateCertificate();
                System.out.println("Press ENTER to start a new game!");
                scanner.nextLine();
                System.out.println("Welcome to battle ship!");
                isGameOver = false;
                board = new Board();
                boardArray = board.NewBoard();
                Board.PrintBoard(boardArray);
                enemySpaces = Board.ChooseEnemySpaces();
            }   
        }
    }
}