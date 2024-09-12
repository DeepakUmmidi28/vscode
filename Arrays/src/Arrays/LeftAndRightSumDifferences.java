package Arrays;
public class LeftAndRightSumDifferences {
    public static int[] letfSumArray(int nums[]){
        int ans[]=new int[4];
        for(int i=nums.length-1;i>0;i--){
            int sum=leftSum(nums,i-1);
            ans[i]=sum;
        }
        ans[0]=0;
        
        return ans;
    }
    public static int leftSum(int nums[],int index){
        int temp=0;
        for(int i=index;i>=0;i--){
            temp+=nums[i];
        }
        return temp;
    }
    public static int[] rightSumArray(int nums[]){
        int ans[]=new int[4];
        for(int i=0;i<nums.length-1;i++){
            int sum=rightSum(nums, i+1);
            ans[i]=sum;
        }
        ans[nums.length-1]=0;
        
        return ans;
    }
    public static int rightSum(int nums[],int index){
        int temp=0;
        for(int i=index;i<nums.length;i++){
            temp+=nums[i];
        }
        return temp;
    }

    public static int[] leftRightDifference(int[] nums) {
        int leftAns[]=letfSumArray(nums);
        // for(int X:leftAns){
        //     System.out.println("Left sum Array "+X);
        // }
        int rightAns[]=rightSumArray(nums);
        // for(int X:rightAns){
        //     System.out.println("Right sum Array "+X);
        // }
        int finalAns[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            finalAns[i]=Math.abs(leftAns[i]-rightAns[i]);
        }
        return finalAns;
    }
    public static void main(String[] args) {
        int arr[]={10,4,8,3};
        int ans[]=leftRightDifference(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
