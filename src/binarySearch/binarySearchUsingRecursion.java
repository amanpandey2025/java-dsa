package binarySearch;

public class binarySearchUsingRecursion {
    static int binarySearchUsingRecursion(int[] arr,int target, int start,int end ){
        //base case
        if (start> end){
            return -1;
        }
        int  mid = start+ (end-start)/2;

        if (arr[mid] == target){
            return mid;
        } else if (arr[mid]> target) {
            return binarySearchUsingRecursion(arr,target,start,mid-1);
        }else {
            return binarySearchUsingRecursion(arr,target,mid+1,end);
        }
    }
}
