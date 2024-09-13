package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int end=arr.length-1;
            int smallest=GetMinIndex(arr,i,end);
            swap(arr,i,smallest);
        }
        return arr;
    }

    public static int GetMinIndex(int arr[],int start,int end){
        int smallest=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[smallest]>arr[i])
            smallest=i;
        }
        return smallest;
    }

    public static void swap(int arr[],int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
