package com;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        result();
    }

    private static void result() {
        System.out.println("Enter number of squares");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while (!isNumber(string)) {
            System.out.println("Enter a positive number of squares");
            string = scanner.nextLine();
        }
        int squares = Integer.parseInt(string);

        double lgth = Math.floor(Math.sqrt(squares));
        double width = Math.ceil(squares / lgth);
        int matches = (int) (2 * squares + lgth + width);
        System.out.println("The number of matches is " + matches);
    }

    public static boolean isNumber(String string) {
        if (string.isEmpty()) {
            System.out.println("You did not enter anything");
            return false;
        }
        if (string.charAt(0) == '-') {
            System.out.println("You entered a negative number");
            return false;
        }
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("You entered a string");
            return false;
        }
    }
}


