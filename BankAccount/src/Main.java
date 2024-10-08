import java.util.Scanner;
import java.util.Random;


public class Main {


    public static void main(String[] args) {

        String name;
        String accountNumber;
        String choice;
        double amount;

        Random random = new Random();
        //create a new BankAccount instance
        BankAccount account1 = new BankAccount();

        //prepare input
        Scanner scan = new Scanner(System.in);

        //gather input from user for accountHolderName
        System.out.println("Who will be using this bank account?");
        name = scan.nextLine();
        System.out.println();
        account1.setAccountHolderName(name);
        System.out.println("Perfect, " + name + " ");

        //gives an account number
        System.out.print("Your account number will be: ");
        int randomAccountNum = random.nextInt(99999999) + 10000000;
        accountNumber = Integer.toString(randomAccountNum);
        account1.setAccountNumber(accountNumber);
        System.out.println(accountNumber);
        System.out.println();


        //test methods
        boolean Logout = false;

        while(!Logout) {
            Menu.open();
            choice = scan.nextLine();
            //test the deposit method
            if (choice.equalsIgnoreCase("A")) {
                System.out.print("Enter amount to deposit: ");
                amount = scan.nextDouble();
                scan.nextLine();
                Menu.optionA(account1, amount);
                System.out.println("You've deposited $" + amount);
            }
            //test the withdraw method
            if (choice.equalsIgnoreCase("B")) {
                System.out.print("Enter amount to withdraw: ");
                amount = scan.nextDouble();
                scan.nextLine();
                Menu.optionB(account1, amount);
                System.out.println("You've withdrawn $" + amount);
            }
            //test balance method
            else if (choice.equalsIgnoreCase("C")) {
                Menu.optionC(account1);
            }//ends program
            else if (choice.equalsIgnoreCase("D")) {
                System.out.println("Goodbye.");
                Logout = true;
            }
            System.out.println();
        }
            }

        }


