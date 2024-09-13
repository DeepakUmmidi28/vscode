package Algorithms;

public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;
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
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
