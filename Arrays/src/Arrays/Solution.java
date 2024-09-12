package Arrays;
import java.util.*;

public class Solution {
    public static int thirdMax(int[] nums){
        // List<Integer> list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(list.indexOf(nums[i])==-1)list.add(nums[i]);
        // }
        // Integer max=null,secMax=null,thirMax=null;
        // for(int i=0;i<list.size();i++){
        //     if((Integer)max == null || list.get(i) > max){
        //         thirMax=secMax;
        //         secMax=max;
        //         max=list.get(i);
        //     }
        //     else if((Integer)secMax == null || list.get(i) > secMax){
        //         thirMax=secMax;
        //         secMax=list.get(i);
        //     }
        //     else if((Integer)thirMax == null || list.get(i) > thirMax){
        //         thirMax=list.get(i);
        //     }
        // }
        // if(list.size()<=2)return max;
        // return thirMax;

        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1};
        int count=Solution.thirdMax(arr);
        System.out.println(count);
    }
}
