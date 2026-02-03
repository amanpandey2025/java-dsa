package Questions;

public class arraySortedOrNot {
    public boolean check(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }
        if (arr[index]> arr[index+1]){
            return false;
        }
        return check(arr,index+1);


    }
}
