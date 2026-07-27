package com.logics.numbers;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(nums.length);
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int majorityElement=nums.length/2;
        System.out.println(majorityElement);
        if(majorityElement>nums[0]){
            return nums[0];
        }
        return 0;
    }


}
