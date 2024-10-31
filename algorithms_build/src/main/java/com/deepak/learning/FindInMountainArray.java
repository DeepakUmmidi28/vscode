package com.deepak.learning;

public class FindInMountainArray {
    public static  int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(start==end)
            return start;

            else if(arr[mid]>arr[mid+1])
            end=mid;

            else if(arr[mid]<arr[mid+1])
            start=mid+1;
        }
        return start;
    }

    public static int search(int nums[],int target) {
        //if(nums.length==1)return -1;
        int peak=peakIndexInMountainArray(nums);
        int FirstTry= OrderAgnosticBinarySerach(target,nums,0,peak);
        if(FirstTry!=-1)
        return FirstTry;
        else if(peak==0&&nums[peak]>nums[peak+1])
        return OrderAgnosticBinarySerach(target,nums,peak,nums.length-1);
        else if(peak==0&&nums.length==1)
        return OrderAgnosticBinarySerach(target,nums,0,0);
        else if(peak!=nums.length-1)
        return OrderAgnosticBinarySerach(target,nums,peak+1,nums.length-1);
        return -1;
    }

    public static  int OrderAgnosticBinarySerach(int target,int arr[],int start,int end){
        if(arr[start]>arr[end]){
           while (start<=end) {
            int  mid= (start+end)/2;
            if(arr[mid]==target)
            return mid;
            else if(arr[mid]>target)
            start=mid+1;
            else
            end=mid-1;
           }
        }

        else{
            while (start<=end) {
                int mid= (start+end)/2;
            if(arr[mid]==target)
            return mid;
            else if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;   
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={5,1,3};
        int target=3;
        System.out.println(search(arr, target));
    }
}
