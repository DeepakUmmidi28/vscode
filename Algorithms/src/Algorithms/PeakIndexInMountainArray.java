package Algorithms;

public class PeakIndexInMountainArray {
    public static  int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end - start) / 2;
            if(start==end)
            return arr[start];

            else if(arr[mid]>arr[mid+1])
            end=mid;

            else if(arr[mid]<arr[mid+1])
            start=mid+1;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int arr[]={5,1,3};
        System.out.println(PeakIndexInMountainArray.peakIndexInMountainArray(arr));
    }
}
