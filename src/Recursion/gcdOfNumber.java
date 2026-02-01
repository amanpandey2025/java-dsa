package Recursion;

import java.util.Scanner;

public class gcdOfNumber {
    static int gcd(int a , int b ){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("enter the first number");
            int a = input.nextInt();
            System.out.println("enter the second number");
            int b =  input.nextInt();
            int result = gcd(a,b);
            System.out.println("GCD of "+a+", "+b+"is :"+result);

            System.out.println("want to find more gcd ?(yes/no)");
            choice = input.next();



        }while (choice.equalsIgnoreCase("yes"));
        System.out.println("terminated the program ");
        input.close();
    }
}
