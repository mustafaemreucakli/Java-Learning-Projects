import java.util.Scanner;

public class Main {

    static int roundedPrice(double totalPrice) {
        int IntTotalPrice = (int)totalPrice;
        if(totalPrice - IntTotalPrice >= 0.5) {
            IntTotalPrice++;
        }
        return IntTotalPrice;
    }

    public static void main(String[] args) {

        double literPrice, literPer100Km, totalKm, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the liter price of the fuel ($): ");
        literPrice = input.nextDouble();
        System.out.print("Please enter how much fuel your vehicle consumes per 100 km: ");
        literPer100Km = input.nextDouble();
        System.out.print("Please enter how many kilometers you will travel: ");
        totalKm = input.nextDouble();

        totalPrice = ((totalKm / 100) * literPer100Km) * literPrice;

        System.out.println("Fuel cost for your trip is $" + roundedPrice(totalPrice) + ".");
        System.out.println("!!!ATTENTION!!!\nYour fuel cost is exactly $" + totalPrice + ". Rounded to $" + roundedPrice(totalPrice) + " for easy reading.");

    }

}
