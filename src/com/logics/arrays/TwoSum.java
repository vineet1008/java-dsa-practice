package com.logics.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=17;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){ //using the brute force check every possible pair of numbers
           for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
           }
        }
        return new int[]{};

    }
}
