package com.deepak.learning;
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int j=nums.length-1;
        for(int i=0;i<j;){
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if(nums[i]%2==0 && nums[j]%2==0){
                i++;
            }
            else if(nums[i]%2!=0 && nums[j]%2!=0){
                j--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={6,4,3,7};
        SortArrayByParity.sortArrayByParity(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
