package Arrays;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr =  new int[size];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < args.length ; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
}
