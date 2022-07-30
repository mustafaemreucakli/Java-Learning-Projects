import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double side1, side2, hypotenuse;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of side 1 of your right triangle: ");
        side1 = input.nextDouble();
        System.out.print("Please enter the length of side 2 of your right triangle: ");
        side2 = input.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("Hypotenuse: " + hypotenuse);

    }

}
