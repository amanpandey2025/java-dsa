package BAsics;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 0;
        while (number > 0) {
            long last_digit = number % 10;
            if (last_digit == 2){
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
