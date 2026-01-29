package sortingAlgos;

import java.util.Arrays;

public class selectionSortUsingRecursion {
    static void selectionSort(int[] arr, int i) {

        // Base case: poora array sort ho gaya
        if (i == arr.length - 1) {
            return;
        }

        // Find index of minimum element in remaining array
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap minimum element with current index
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;

        // Recursive call for next index
        selectionSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr, 0);

        System.out.println(Arrays.toString(arr));
    }
}
