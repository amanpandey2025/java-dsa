package sortingAlgos;

import java.util.Arrays;

public class bubbleSortUsingRecursion {
    static void bubbleRecursion(int[] arr, int n ){// here n is arr.length
        //base case
        if (n ==1){
            return;
        }
        //one pass of bubble sort
        for (int i = 0; i < n-1 ; i++) {
            if (arr[i]> arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        //recursive call for the remaining numbers
        bubbleRecursion(arr,n-1);

    }

    public static void main(String[] args) {
        int[] arr = {3,99,76,2,3,4};
        bubbleRecursion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
