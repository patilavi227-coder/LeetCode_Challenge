package com.leetcode.problems;

import java.util.Map;
import java.util.HashMap;

public class TwoSumProblem_01 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static  int[] twoSum(int[] num, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length; i++){
            int diff = target - num[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(num[i], i);
        }
        return new int[]{};
    }

}

