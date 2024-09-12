package Algorithms;
import java.util.Arrays;

public class CyclicSort {
    public static int[] sort(int arr[]) {
        //No duplicates
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int newIndex=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[newIndex];
                arr[newIndex]=temp;
            }
            else{
                i++;
            }
        }
        return arr;

        /* Duplicates 
          
         int i=0;
        while(i<arr.length){
            int newIndex=arr[i]-1;
            if(arr[i]!=i+1 && arr[newIndex]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[newIndex];
                arr[newIndex]=temp;
            }
            else{
                i++;
            }
        }
         
        */
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
