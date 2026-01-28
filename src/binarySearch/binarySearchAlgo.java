package binarySearch;

public class binarySearchAlgo {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            } else {
                return mid; // target found
            }
        }
        return -1; // target not found
    }
}
