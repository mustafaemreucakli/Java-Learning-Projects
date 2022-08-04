import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ATM atm = new ATM();
        Account account = new Account("admin", "12345", 2000);

        atm.run(account);
        System.out.println("Exiting the program... ");

    }

}