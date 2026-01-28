package linearSearch;

public class linearSearchUsingRecursion {
    static boolean search(int[] arr,int index , int target){
        if (arr.length == index){
            return false;
        }
        if (arr[index] == target){
            return  true;
        }
        return search(arr,index+1,target);
    }
}
