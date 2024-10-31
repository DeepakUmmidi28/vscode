package com.deepak.learning;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j-i]+nums[j]==target){
                return new int[]{j,j-i};
                }
           }
        }
        return new int[]{};
        
    }

    public static void main(String[] args) {
        //int arr[]={3,2,3};
        //int answer[]=TwoSum.twoSum(arr, 6);
    }
}
