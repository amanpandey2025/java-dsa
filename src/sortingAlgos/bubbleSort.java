package sortingAlgos;

public class bubbleSort {
    static void bubble(int[] arr){
        //run the steps n-1 times
        boolean swapped;
        for (int i = 0; i <arr.length-1 ; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j] < arr[j-1]){
                    //swap algo
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }


        }
    }
}
