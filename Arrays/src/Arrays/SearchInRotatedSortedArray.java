package Arrays;
public class SearchInRotatedSortedArray {
    public static int findPivot(int arr[]){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])return mid;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[start]>=arr[mid])end=mid-1;
            else start=mid+1;
        }
        return -1;
    }

    public static  int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target)start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

    public  static int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int pivot=findPivot(nums);
        if(pivot==-1)return binarySearch(nums, target, 0, nums.length-1);
        if(nums[pivot]==target)return pivot;
        if(nums[start]>target) return binarySearch(nums, target, pivot+1, end);
        else return binarySearch(nums, target, start, pivot);
    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,10,1,2,3};
        System.out.println(search(arr, 7));
    }
}
