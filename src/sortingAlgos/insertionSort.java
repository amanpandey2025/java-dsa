package sortingAlgos;

import java.util.Arrays;

public class insertionSort {
    static void insertionSort(int[]arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int  j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,77,3,2,4,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
