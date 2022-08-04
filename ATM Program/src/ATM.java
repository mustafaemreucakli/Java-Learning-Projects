import java.util.Scanner;

public class ATM {

    public void run(Account account) {

        int entryRight = 3;

        Login login = new Login();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome the ATM.");
        System.out.println("****************************************");
        System.out.println("User Login");
        System.out.println("****************************************");

        while (true) {
            if (login.login(account)) {
                System.out.println("Signed In Successfully.");
                break;
            }
            else {
                entryRight--;
                System.out.println("Login Failed\nYour Remaining Entry Rights: " + entryRight);
            }
            if (entryRight == 0) {
                System.out.println("You Have No More Attempt To Log In.\nPlease Contact Your Customer Representative.");
                return;
            }
        }

        System.out.println("****************************************");
        String operations = "1. Show Balance\n2. Deposit\n3. Withraw Money\nYou can press the 'q' key to exit.";
        System.out.println(operations);
        System.out.println("****************************************");

        while (true) {
            System.out.println("Select The Operation: ");
            String operation = input.nextLine();

            if (operation.equals("q")) {
                return;
            } else if (operation.equals("1")) {
                System.out.println("Your Current Balance: " + account.getBalance());
            } else if (operation.equals("2")) {
                System.out.print("Please enter the amount you want to deposit: ");
                double depositValue = input.nextDouble();
                input.nextLine();
                account.deposit(depositValue);
            } else if (operation.equals("3")) {
                System.out.print("Please enter the amount you want to withdraw:");
                double withdrawMoneyValue = input.nextDouble();
                input.nextLine();
                account.withdrawMoney(withdrawMoneyValue);
            }
            else {
                System.out.println("Invalid Transaction...");
            }
        }

    }

}
