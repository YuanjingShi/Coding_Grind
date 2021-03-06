/* 1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.
*/

public class twoSum {
    
    public int[] twoSum(int[] nums, int target) {

        int index1 = 0;
        int index2 = 0;
        int sum = 0;
        int[] res = new int[2];
        for (int i = 0; i < nums.length ; i++){
            index1 = nums[i];
            for(int j = i+1; j < nums.length ;j++){
                index2 = nums[j];
                sum = index1 + index2;
                if(sum == target){
                        res[0] = i;
                        res[1] = j;
                        break;
                }
            }  
        }
    return res;
    }
}

