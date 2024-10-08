//little project to determine how many pizzas would be needed
// for however many people attend a function
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println creates a new line after printing
        System.out.println("How many people will attend the function?");
        //creates a scanner to receive input
        Scanner ask = new Scanner(System.in);
        //variable for the amount of people in function
        int people = ask.nextInt();


        //method call
        calcPizzaBoxes(people);
    }
    //method for the method call is needed
    public static void calcPizzaBoxes(int people) {
        //set a amount of slices per box
        final int pizzaSlices = 8;

        //calculate how many pizzas per person
        int numberOfBoxes = (int) Math.ceil((double) people / pizzaSlices);
        //print result
        System.out.println("There needs to be " + numberOfBoxes + " boxes for the function.");

    }

}
