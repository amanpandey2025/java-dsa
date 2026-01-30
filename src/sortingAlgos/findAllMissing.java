package sortingAlgos;

import java.util.ArrayList;
import java.util.List;

import static sortingAlgos.cyclickSort.swap;

public class findAllMissing {
    public List<Integer> findAllMissing(int[] nums){
        int i = 0;
        while (i< nums.length){
            int correctIndex = nums[i]-1;
            if (nums[i]< nums.length && nums[i]!= nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else {
                i++;
            }
        }
        //collecting missing number
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index+1){
                result.add(index+1);
            }

        }
        return result;
    }
}
