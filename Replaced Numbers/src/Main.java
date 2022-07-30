import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, newNumber1;

        System.out.print("Please enter the number 1: ");
        number1 = input.nextInt();
        System.out.print("Please enter the number 2: ");
        number2 = input.nextInt();

        newNumber1 = number2;
        number2 = number1;

        System.out.println("The replaced numbers are as follows:\nNumber 1: " + newNumber1 + "\nNumber 2: " + number2);

    }

}
