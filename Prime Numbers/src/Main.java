public class Main {

    public static boolean isItPrime(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void printPrime () {

        for (int i = 1; i <= 1000; i++) {
            if (isItPrime(i)){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        printPrime();

    }

}