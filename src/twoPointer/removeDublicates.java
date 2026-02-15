package twoPointer;

import java.util.Arrays;

public class removeDublicates {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,5};
        removeDublicates(nums);
        System.out.println(Arrays.toString(nums));

    }

    public  static int removeDublicates(int[] nums){

        if (nums.length == 0){
            return 0;
        }
        int i =0;
        for (int j = 1; j < nums.length ; j++) {
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }

        }
        return i+1;
    }
}
