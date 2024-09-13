package Algorithms;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        sort(nums);
        int count=0;
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=i+1){
                ans[count++]=nums[i];
                ans[count]=i+1;
                break;
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
        int arr[]={1,2,2,4};
        int ans[]=findErrorNums(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
