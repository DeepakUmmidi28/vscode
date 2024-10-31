package com.deepak.learning;
import java.util.Arrays;

public class N_Double_Exists {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target=2*arr[i];
            int start=0,end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target && mid!=i)return true;
                else if(arr[mid]>target)end=mid-1;
                else start=mid+1;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int arr[]={10,2,5,3};
        System.out.println(N_Double_Exists.checkIfExist(arr));
    }
}



