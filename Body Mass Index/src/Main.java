import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in meter: ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight: ");
        int weight = input.nextInt();

        double bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);
    }

}
