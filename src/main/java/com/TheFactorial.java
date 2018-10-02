package com;

import java.util.Scanner;

public class TheFactorial {
    public static void main(String[] args) {
        inverseFactorial();
    }

    private static void inverseFactorial() {
        System.out.println("Enter factorial value");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        string = check(scanner, string);
        int factorial = Integer.parseInt(string);
        int counter = 1;


        while (counter != factorial) {
            if (factorial % counter == 0) {
                factorial /= counter;
                counter++;

            } else {
                System.out.println("Error. Enter new number");
                counter=1;
                string = scanner.nextLine();
                string = check(scanner, string);
                factorial = Integer.parseInt(string);
            }
        }
        System.out.println("Reverse factorial value is " + counter);
    }

    private static String check(Scanner scanner, String string) {
        while (!Matches.isNumber(string)) {
            System.out.println("Enter the correct factorial value");
            string = scanner.nextLine();
        }
        return string;
    }

}









