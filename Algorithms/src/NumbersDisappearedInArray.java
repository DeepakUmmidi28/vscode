import java.util.ArrayList;
import java.util.List;

public class NumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=i+1){
                ans.add(i+1);
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
        List<Integer> list=findDisappearedNumbers(arr);
        System.out.println(list);
    }
}