package Algorithms;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        sort(nums);
        int missing=nums.length;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=i){
                missing=i;
                break;
            }
        }
        return missing;
    }

    public static void sort(int arr[]) {
        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]!=i){
                int newIndex=arr[i];
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
        int arr[]={0,1};
        System.out.println(missingNumber(arr));
    }
}


