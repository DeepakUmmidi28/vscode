package com.deepak.learning;
public class BinarySearch {
    public static void main(String[] args) {
       //int arr[]={99,67,49,46,32,1};
       int arr[]={10,36,42,53,79,84,100};
       int tar=100;
       System.out.println(search(arr, tar));
    }

    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid= (start+end)/2;
            //mid=start+(start+end)/2;

            // //array sorted in ascending order
            // if(arr[mid]==target)
            // return mid;
            // else if(arr[mid]>target)
            // end=mid-1;
            // else
            // start=mid+1;

            // //array sorted in decsending order
            // if(arr[mid]==target)
            // return mid;
            // else if(arr[mid]>target)
            // start=mid+1;
            // else
            // end=mid-1;

            //order agnostic Binary Search
            if(arr[start]>arr[end]){
                mid= (start+end)/2;
                if(arr[mid]==target)
                return mid;
                else if(arr[mid]>target)
                start=mid+1;
                else
                end=mid-1;
            }

            else{
                mid= (start+end)/2;
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
}
