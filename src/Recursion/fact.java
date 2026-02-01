package Recursion;

import java.util.Scanner;

public class fact {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            int result = factorial(n);
            System.out.println("Factorial = " + result);

            System.out.print("Want more factorial? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program terminated.");
        sc.close();
    }
}
