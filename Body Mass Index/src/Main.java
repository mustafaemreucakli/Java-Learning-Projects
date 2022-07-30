import java.util.Scanner;

public class Main {

    static void bmiMethod(double a) {
        if (a < 18.5) {
            System.out.println("Underweight");
        } else if (a >= 18.5 && a < 25) {
            System.out.println("Normal");
        } else if (a >= 25 && a < 30) {
            System.out.println("Overweight");
        } else if (a >= 30 && a < 35) {
            System.out.println("Obese");
        } else {
            System.out.println("Extremely Obese");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in meter: ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight: ");
        int weight = input.nextInt();

        double bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);
        bmiMethod(bmi);
    }

}
