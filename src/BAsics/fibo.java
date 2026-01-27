package BAsics;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number ");
        int n =  input.nextInt();
         int a = 0;  int b = 1;
        System.out.println("fibo series :");
        for (int i = 1; i <=n ; i++) {
            int c =  a + b;
            a = b;
            b = c;

        }
        input.close();
    }
public class  recursion{

}
}
