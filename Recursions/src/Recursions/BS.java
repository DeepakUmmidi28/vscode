package Recursions;
public class BS {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=11;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int arr[],int target, int start, int end){
        int mid=(start+end)/2;
        if(start>end) return -1;

        if(arr[mid]==target) return mid;

        if(arr[mid]<target) return search(arr,target,mid+1,end);

        return search(arr,target,start,mid-1);
    }
}
