package Questions;

public class linearUsingRecursion {
    static int check(int[] arr,int index , int target){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return check(arr,index+1,target);
    }
}
