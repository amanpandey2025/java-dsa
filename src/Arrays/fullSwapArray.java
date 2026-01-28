package Arrays;

import java.util.Arrays;

public class fullSwapArray {
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr  = {12,34,56,33,67};
        System.out.println("original arr is "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("reversed array is :"+Arrays.toString(arr));
    }

}
