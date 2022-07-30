import java.util.Scanner;

public class Main {
    
    static int maxNumber (int a, int b, int c) {
        int number = 0;
        if (a >= b && a >= c) {
            number = a;
        } else if (b >= a && b >= c) {
            number = b;
        } else if (c >= a && c >= b) {
            number = c;
        }
        return number;
    }

    static int maxNumber2 (int a, int b, int c) {
        int bigNumber;
        bigNumber = Math.max(a, b);
        bigNumber = Math.max(bigNumber, c);

        return bigNumber;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Please enter the number 1: ");
        number1 = input.nextInt();
        System.out.print("Please enter the number 2: ");
        number2 = input.nextInt();
        System.out.print("Please enter the number 3: ");
        number3 = input.nextInt();

        System.out.println("Max number is " + maxNumber(number1, number2, number3));

        //It can also be written as follows in Java using the Math class and the max method.

        System.out.println("Max number is " + maxNumber2(number1, number2, number3));
    }

}
