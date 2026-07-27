package com.logics.numbers;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
//        int[] nums = {3,2,3};
        int[] nums ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for (int i:nums){
            if(map.containsKey(i)){
                map.put(i,count+1);
            }else {
                map.put(i,count);
            }

        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>n){
                return m.getKey();
            }
        }


        return 0;
    }


}
