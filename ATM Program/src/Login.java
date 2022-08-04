import java.util.Scanner;

public class Login {

    public boolean login(Account account) {
        Scanner input = new Scanner(System.in);
        String userName;
        String password;

        System.out.print("Please enter your user name: ");
        userName = input.nextLine();
        System.out.print("Please enter your password: ");
        password = input.nextLine();

        if (account.getUserName().equals(userName) && account.getPassword().equals(password)) {
            return true;
        }
        else {
            return false;
        }

    }

}
