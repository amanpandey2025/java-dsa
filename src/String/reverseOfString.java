package String;

import java.util.Arrays;

public class reverseOfString {

    public void reverseString(char[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c', 'd'};

        reverseOfString obj = new reverseOfString();
        obj.reverseString(chars);

        System.out.println(Arrays.toString(chars));
    }
}
