import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double number1, number2, result = 0;
        int operations;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number you want to operations.");
        number1 = input.nextInt();
        System.out.println("Please enter the second number you want to operations.");
        number2 = input.nextInt();
        System.out.println("Please select the operations\n1. Summation\n2. Substruction\n3. Multiplication\n4. Division\n5. Mod");
        operations = input.nextInt();

        switch (operations) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
            case 5:
                result = number1 % number2;
                break;
            default:
                System.out.println("You have not entered a valid transaction type. Please enter a valid transaction type.");
        }

        System.out.println("Result : " + result);

    }

}
