package Arrays;
import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static int BinarySearch(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>target)end=mid-1;
            else if(nums[mid]<target)start=mid+1;
        }
        return -1;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean arr[]=new boolean[nums.length+1];
        for(int j=0;j<nums.length;j++){
            arr[nums[j]]=true;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!arr[i])
            ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,2,4,4};
        List<Integer> list=new ArrayList<>();
        list=FindAllNumbersDisappearedinanArray.findDisappearedNumbers(nums);
        for(int x:list){
            System.out.print(x+" ");
        }
    }
}
