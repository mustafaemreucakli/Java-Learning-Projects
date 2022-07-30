import java.util.Scanner;

public class Main {

    static double midtermGrade(double a) {
        return a * 0.3;
    }

    static double finalGrade(double a) {
        return a * 0.4;
    }

    static void lessonStatus(double a) {
        if (a >= 90) {
            System.out.println("AA letter grade.");
        } else if (a >= 85 && a < 90) {
            System.out.println("BA letter grade.");
        } else if (a >= 80 && a < 85) {
            System.out.println("BB letter grade.");
        } else if (a >= 75 && a < 80) {
            System.out.println("CB letter grade.");
        } else if (a >= 70 && a < 75) {
            System.out.println("CC letter grade.");
        } else if (a >= 65 && a < 70) {
            System.out.println("DC letter grade.");
        } else if (a >= 60 && a < 65) {
            System.out.println("DD letter grade.");
        } else if (a >= 55 && a < 60) {
            System.out.println("FD letter grade.");
        } else if (a < 55) {
            System.out.println("FF letter grade.");
        }
    }

    static void statusMessage(double a) {
        if (a >= 55) {
            System.out.print("You passed the course with an average of " + a + " points and an ");
            lessonStatus(a);
        } else if (a < 55) {
            System.out.print("You failed the course with an average of " + a + " points and a ");
            lessonStatus(a);
        }
    }

    static double gettingMidterm1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first midterm point: ");
        double midterm1 = input.nextDouble();

        return midterm1;
    }

    static double gettingMidterm2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the second midterm point: ");
        double midterm2 = input.nextDouble();

        return midterm2;
    }

    static double gettingFinalExam() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the final final exam point: ");
        double finalExam = input.nextDouble();

        return finalExam;
    }

    public static void main(String[] args) {

        double midterm1, midterm2, finalExam, result;

        midterm1 = gettingMidterm1();
        midterm2 = gettingMidterm2();
        finalExam = gettingFinalExam();

        result = midtermGrade(midterm1) + midtermGrade(midterm2) + finalGrade(finalExam);
        statusMessage(result);

    }

}