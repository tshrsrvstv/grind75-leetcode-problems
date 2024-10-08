package com.leet.code.week.one;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TwoSum {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //brute force
            int[] ans = new int[2];
            // boolean found = false;
            // for(int i=0;i<nums.length; i++) {
            //     for(int j=i+1; j<nums.length; j++) {
            //         if(target-nums[i] == nums[j]){
            //             ans[0] = i;
            //             ans[1] = j;
            //             found = true;
            //             break;
            //         }
            //     }
            //     if (found) {
            //         break;
            //     }
            // }

            //better solution

            HashMap<Integer, Integer> numMap = new LinkedHashMap();
            for(int i=0; i<nums.length; i++) {
                if(numMap.get(target - nums[i]) != null) {
                    ans[0] = i;
                    ans[1] = numMap.get(target - nums[i]);
                    break;
                } else {
                    numMap.put(nums[i], i);
                }
            }

            return ans;
        }
    }
}
