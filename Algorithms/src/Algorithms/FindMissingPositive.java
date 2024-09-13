package Algorithms;

public class FindMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=i+1)return i+1;
        }
        return nums.length+1;
    }

    public static void sort(int arr[]) {
        int i=0;
        while(i<arr.length){
            int newIndex=arr[i]-1;
            if(arr[i]<=arr.length && arr[i]>0 && arr[i]!=i+1 && arr[newIndex]!=arr[i]) {
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
        int arr[]={1,1};
        System.out.println(firstMissingPositive(arr));
    }
}
