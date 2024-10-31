package com.deepak.learning;
public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int max=SlidingWindow(arr, 2);
        System.out.println(max);
    }

    public static int SlidingWindow(int arr[],int size){
        int i=0,j=0;
        int sum=0,max=0;
        while(j<arr.length){
            sum+=arr[j];
            if((j-i+1)<size){
                j++;
            } 
            else{
                max=Integer.max(max,sum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return max;
    } 
}
