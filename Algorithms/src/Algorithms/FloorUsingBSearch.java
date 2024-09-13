package Algorithms;

public class FloorUsingBSearch {
    public static void main(String[] args) {
        //int arr[]={99,67,49,46,32,1};
        int arr[]={10,36,42,53,79,84,100};
        int tar=42;
        System.out.println(search(arr, tar));
     }

     private static int search(int[] arr, int tar) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==tar)
            return mid;
            else if(arr[mid]<tar)
            start=mid+1;
            else
            end=mid-1;
        }
        return end;
    }
}
