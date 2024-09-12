package Algorithms;
import java.util.*;

public class FindAllDupliactesInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void sort(int arr[]) {
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
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> list=findDuplicates(arr);
        System.out.println(list);
    }
}
