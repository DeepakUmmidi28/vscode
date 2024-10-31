package com.deepak.learning;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public int missingInteger(int[] nums) {
        int sum=nums[0],i;
        for(i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]-1){
                sum=sum+nums[i];
            }
            else break;
        }
        int j=i,poss=nums[j];
        while(j<nums.length){
            if(nums[j]!=poss && poss<sum)
            poss++;
        }
        //return max+1;
        return 1;
    }
}


/*else{
                max=Integer.max(max, nums[i]);
                if(max>sum)return max;
            } */