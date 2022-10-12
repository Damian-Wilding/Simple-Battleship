import java.util.Random;
import java.util.ArrayList;


public class Board {

    //constructor (not currently being used for anything)
    public Board() {
        
    }

    //creates a new board
    public String[][] NewBoard() {
        String[] line1 = {".", ".", ".", "."};
        String[] line2 = {".", ".", ".", "."};
        String[] line3 = {".", ".", ".", "."};
        String[] line4 = {".", ".", ".", "."};
        String[][] board = {line1, line2, line3, line4};
        return board;
    }

    //prints out the board with the row and column labels
    static public void PrintBoard(String[][] board) {
        System.out.println("   A  B  C  D");
        int count = 1;
        for (String[] line : board) {
            System.out.print(count + "  ");
            count += 1;
            for (String space : line) {
                System.out.print(space);
                System.out.print("  ");
            }
            System.out.print(" \n");
        }
    }

    //checks to see if the users input is a valid option
    static public boolean DoesBoardContain(String input) {

        //creates an Array of all the valid options
        String[] refrenceLine1 = {"A1", "A2", "A3", "A4"};
        String[] refrenceLine2 = {"B1", "B2", "B3", "B4"};
        String[] refrenceLine3 = {"C1", "C2", "C3", "C4"};
        String[] refrenceLine4 = {"D1", "D2", "D3", "D4"};
        String[][] refrence = {refrenceLine1, refrenceLine2, refrenceLine3, refrenceLine4};

        //checks to see if the input is in that Array
        for (String[] line : refrence) {
            for (String space : line) {
                if (space.equals(input) == true) {
                    return true;
                }
            }
        
        }
        return false;
    }

    //makes an Array of the 3 randomly chosen enemy spaces
    static public String[] ChooseEnemySpaces() {
        
        //initializing values
        Random random = new Random();
        ArrayList<String> numbersList = new ArrayList<String>();
        int value;
        boolean doesArrayContainNumber = false;
        String valueAsString;
        
        //generates 3 random spaces for the enemy ships to be at
        while (numbersList.size() < 3) {
            do {
                value = random.nextInt(16) + 1;
                valueAsString = String.valueOf(value);

                //checks to make sure the value hasn't already been generated
                for (String number : numbersList) {
                    if (number.equals(valueAsString) == true) {
                        doesArrayContainNumber = true;
                        break;
                    }
                    else {
                        doesArrayContainNumber = false;
                    }
                }
            }
            while (doesArrayContainNumber == true);

            //adds the generated int into an ArrayList
            doesArrayContainNumber = true;
            numbersList.add(valueAsString);

        }

        //prints out the items in the ArrayList (For troubleshooting)
        //for (String item : numbersList) {
        //    System.out.println(item);
        //}

        //sets the 3 values in the ArrayList to a String variable
        String firstSpace = numbersList.get(0);
        String secondSpace = numbersList.get(1);
        String thirdSpace = numbersList.get(2);

        //turns the String value into a string that represents the space that it will occcupy
        switch (firstSpace) {
            case "1":
                firstSpace = "A1";
                break;
            case "2":
                firstSpace = "A2";
                break;
            
            case "3":
                firstSpace = "A3";
                break;
            
            case "4":
                firstSpace = "A4";
                break;
            
            case "5":
                firstSpace = "B1";
                break;
            
            case "6":
                firstSpace = "B2";
                break;
            
            case "7":
                firstSpace = "B3";
                break;
            
            case "8":
                firstSpace = "B4";
                break;
        
            case "9":
                firstSpace = "C1";
                break;
            
            case "10":
                firstSpace = "C2";
                break;
            
            case "11":
                firstSpace = "C3";
                break;
            
            case "12":
                firstSpace = "C4";
                break;
            
            case "13":
                firstSpace = "D1";
                break;
            
            case "14":
                firstSpace = "D2";
                break;
            
            case "15":
                firstSpace = "D3";
                break;
            
            case "16":
                firstSpace = "D4";
                break;
        }

        switch (secondSpace) {
            case "1":
                secondSpace = "A1";
                break;
            case "2":
                secondSpace = "A2";
                break;
            
            case "3":
                secondSpace = "A3";
                break;
            
            case "4":
                secondSpace = "A4";
                break;
            
            case "5":
                secondSpace = "B1";
                break;
            
            case "6":
                secondSpace = "B2";
                break;
            
            case "7":
                secondSpace = "B3";
                break;
            
            case "8":
                secondSpace = "B4";
                break;
        
            case "9":
                secondSpace = "C1";
                break;
            
            case "10":
                secondSpace = "C2";
                break;
            
            case "11":
                secondSpace = "C3";
                break;
            
            case "12":
                secondSpace = "C4";
                break;
            
            case "13":
                secondSpace = "D1";
                break;
            
            case "14":
                secondSpace = "D2";
                break;
            
            case "15":
                secondSpace = "D3";
                break;
            
            case "16":
                secondSpace = "D4";
                break;
        }

        switch (thirdSpace) {
            case "1":
                thirdSpace = "A1";
                break;
            case "2":
                thirdSpace = "A2";
                break;
            
            case "3":
                thirdSpace = "A3";
                break;
            
            case "4":
                thirdSpace = "A4";
                break;
            
            case "5":
                thirdSpace = "B1";
                break;
            
            case "6":
                thirdSpace = "B2";
                break;
            
            case "7":
                thirdSpace = "B3";
                break;
            
            case "8":
                thirdSpace = "B4";
                break;
        
            case "9":
                thirdSpace = "C1";
                break;
            
            case "10":
                thirdSpace = "C2";
                break;
            
            case "11":
                thirdSpace = "C3";
                break;
            
            case "12":
                thirdSpace = "C4";
                break;
            
            case "13":
                thirdSpace = "D1";
                break;
            
            case "14":
                thirdSpace = "D2";
                break;
            
            case "15":
                thirdSpace = "D3";
                break;
            
            case "16":
                thirdSpace = "D4";
                break;
        }
    
        //makes a new Array that holds the 3 unique enemy space values
        String[] enemySpaces = {firstSpace, secondSpace, thirdSpace};

        //prints out the spaces that the enemy occupies (for troubleshooting)
        //for (String item : enemySpaces) {
        //    System.out.println(item);
        //}

        //returns that Array
        return enemySpaces;
		
    }

    //takes the board and marks an "X" or "O" wherever the player chose to attack
    static public String[][] MarkThePlayersMove(String[][] boardArray, String input, String[] enemySpaces) {

        //intializes a boolean value that determines weather the space chosen was occupied by an enemy or not
        boolean isEnemySpace = false;

        //determines weather the boolean should be true or false (occupied by an enemy or not)
        for (String space : enemySpaces) {
            if (space.equals(input.toUpperCase())) {

                isEnemySpace = true;
                break;
            }
            else {
                isEnemySpace = false;
            }
        }

        //if the boolean is true, then the chosen space will be marked with an "X" on the board and the "HIT!" message will be displayed
        if (isEnemySpace == true) {
            System.out.println(" ");
            System.out.println("HIT!");
            switch(input.toUpperCase()) {
                case "A1":
                    boardArray[0][0] = "X";
                    break;
                case "A2":
                    boardArray[1][0] = "X";
                    break;
                case "A3":
                    boardArray[2][0] = "X";
                    break;
                case "A4":
                    boardArray[3][0] = "X";
                    break;
                case "B1":
                    boardArray[0][1] = "X";
                    break;
                case "B2":
                    boardArray[1][1] = "X";
                    break;
                case "B3":
                    boardArray[2][1] = "X";
                    break;
                case "B4":
                    boardArray[3][1] = "X";
                    break;
                case "C1":
                    boardArray[0][2] = "X";
                    break;
                case "C2":
                    boardArray[1][2] = "X";
                    break;
                case "C3":
                    boardArray[2][2] = "X";
                    break;
                case "C4":
                    boardArray[3][2] = "X";
                    break;
                case "D1":
                    boardArray[0][3] = "X";
                    break;
                case "D2":
                    boardArray[1][3] = "X";
                    break;
                case "D3":
                    boardArray[2][3] = "X";
                    break;
                case "D4":
                    boardArray[3][3] = "X";
                    break;
            }
        }

        //if the boolean is false (not occupied by an enemy), then the players guessed space will be changed to a "O" on the board and the "miss" message will be displayed
        else {
            System.out.println(" ");
            System.out.println("miss");
            switch(input.toUpperCase()) {
                case "A1":
                    boardArray[0][0] = "O";
                    break;
                case "A2":
                    boardArray[1][0] = "O";
                    break;
                case "A3":
                    boardArray[2][0] = "O";
                    break;
                case "A4":
                    boardArray[3][0] = "O";
                    break;
                case "B1":
                    boardArray[0][1] = "O";
                    break;
                case "B2":
                    boardArray[1][1] = "O";
                    break;
                case "B3":
                    boardArray[2][1] = "O";
                    break;
                case "B4":
                    boardArray[3][1] = "O";
                    break;
                case "C1":
                    boardArray[0][2] = "O";
                    break;
                case "C2":
                    boardArray[1][2] = "O";
                    break;
                case "C3":
                    boardArray[2][2] = "O";
                    break;
                case "C4":
                    boardArray[3][2] = "O";
                    break;
                case "D1":
                    boardArray[0][3] = "O";
                    break;
                case "D2":
                    boardArray[1][3] = "O";
                    break;
                case "D3":
                    boardArray[2][3] = "O";
                    break;
                case "D4":
                    boardArray[3][3] = "O";
                    break;
            }
        }
        
        //returns the updated Array
        return boardArray;

    }

    //checks to see if all the enemies ships have been hit (returns true if all the ships have been hit)
    static public boolean CheckForGameOver(String[] enemySpaces, String[][] boardArray) {

        //counts the number of times that "X" appears on the board
        int count = 0; 
        for (String[] line : boardArray) {
            for (String space : line) {
                if (space.equals("X")) {
                    count += 1;
                }
            }
        }
        
        //if the number of times is 3 or more, then the boolean true is returned
        if (count >= 3) {
            return true;
        }
        else {
            return false;
        }
    }
}
