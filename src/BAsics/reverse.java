package BAsics;

public class reverse {
    public static void main(String[] args) {
        int number =  12367;
        int reverse = 0;

      while (number> 0){
          int last_digit = number % 10; //last digit
          reverse = reverse * 10 + last_digit;
          number = number / 10;
      }
        System.out.println(reverse);
    }

}
