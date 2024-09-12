package Arrays;
public class FirstAndLastOccurenceInSortedArray {
    public int[] searchRange(int[] nums, int target){
        if(nums.length<=0)return new int[]{-1,-1};
        int First=binarySearch(nums,target,true);
        int Second=binarySearch(nums,target,false);
        return new int[]{First,Second};
    }

    public int binarySearch(int nums[],int target,boolean isFirst){
        int start=0,end=nums.length-1,ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target)end=mid-1;
            else if(nums[mid]<target)start=mid+1;
            else{
                ans=mid;
                if(isFirst)end=mid-1;
                else start=mid+1;
            }
        }
        return ans;
    }
}
