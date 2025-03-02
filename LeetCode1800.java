/*
Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.
 */

public class LeetCode1800 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50,50};
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums){

        int sum = nums[0];
        int maxSum = sum;
        int n = nums.length;

        for(int i = 1; i < n; i++){
            if(nums[i - 1] >= nums[i]) 
                sum = 0;
            
            sum +=nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
