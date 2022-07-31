import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double balance = 1000, deposit, withrawMoney;
        String operations;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please select the action you want to take.\n1. Balance Inquiry\n2. Deposit\n3. Withraw Money\nYou can press the 'q' key to exit.");
            operations = input.nextLine();
            if (operations.equals("1")) {
                System.out.println("Your current balance: $" + balance);
                continue;
            } else if (operations.equals("2")) {
                System.out.print("Please enter the amount you wish to deposit: $");
                deposit = input.nextDouble();
                balance += deposit;
                System.out.println("Your current balance: $" + balance);
                continue;
            } else if (operations.equals("3")) {
                System.out.print("Please enter the amount you want to withdraw: $");
                withrawMoney = input.nextDouble();
                balance -= withrawMoney;
                System.out.println("Your current balance: $" + balance);
                continue;
            } else if (operations.equals("q")) {
                System.out.println("You have successfully logged out.");
                break;
            } else {
                System.out.println("The transaction type you entered is invalid. Please try again.");
                continue;
            }
        }

    }

}