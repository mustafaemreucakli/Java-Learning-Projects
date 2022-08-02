import java.util.Scanner;

public class Main {

    public static int ebob(int number1, int number2) {

        int ebob = 1;

        for (int i = 1; (i <= number1) && (i <= number2); i++) {

            if ((number1 % i == 0) && (number2 % i == 0)) {

                ebob = i;

            }

        }

        return ebob;

    }

    public static int gettingValue() {
        int value;

        Scanner input = new Scanner(System.in);

        value = input.nextInt();

        return value;
    }

    public static void showEbob(int a) {
        System.out.println("Ebob = " + a);
    }

    public static void main(String[] args) {

        showEbob(ebob(gettingValue(), gettingValue()));

    }

}