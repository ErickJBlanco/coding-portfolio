import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    System.out.print("This program will focus on if-else statements\n");
    //scanner is used to gather user input
    Scanner input = new Scanner(System.in);
    System.out.print("Choose a number between 1-100 and if you're right you win if not you lose, 3 chances: \n");


    int answer;
    int chances = 3;

    //while loop ends game when chances are done
    while (chances > 0) {
        System.out.print("Enter your guess: ");

        //answer variable initiates scanner
        answer = input.nextInt();

        // else if loops are used to keep game going, and to end when guess is correct.

        if (answer < 51 && answer > 0) {
            System.out.print("You were so close, Choose a higher number.\n");
            chances -= 1;
            System.out.print("You have " + (chances) + " chances left.\n");

        }
        else if (answer == 52 ) {
            System.out.print("You did it! Congratulations you finished testing the program\n");
            System.out.print("You completed this with " + chances + " left.\n");
            //This means successful completion of program and ends it
            System.exit(0);
        }
        else if (answer > 52 && answer < 100) {
            System.out.print("You were so close, choose a lower number.\n");
            chances -= 1;
            System.out.print("You have " + (chances) + " chances left.\n");
        }
        else if (answer > 100) {
            System.out.print("Choose a number between 1-100 \n");
            System.out.print("No chances will be subtracted\n");
        }
        else if (answer < 0) {
            System.out.print("Choose a number between 1-100 \n");
            System.out.print("No chances will be subtracted\n");
        }
        if (chances == 0) {
            System.out.print("Game over.");
        }
    }
        }

    }
