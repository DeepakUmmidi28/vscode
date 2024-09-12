package Arrays;
public class MaximumConsecutive1s {
    // public static int Consecutives(int arr[]){
    //     int count=0;
    //     if(arr.length<=1){
    //         if(arr[0]==1)return 1;
    //         else return 0;
    //     }
    //     for(int j=0;j<arr.length;j++){
    //         int i=j;
    //         while(arr[i]==1 && i<arr.length){
    //             if(i!=arr.length-1 && arr[i+1]==1){
    //                 count++;
    //                 i++;
    //             }
    //             else{
    //                 i++;
    //                 count=0;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxCount=Math.max(maxCount, count);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1};
        int count=MaximumConsecutive1s.findMaxConsecutiveOnes(arr);
        System.out.println(count);
    }
}
