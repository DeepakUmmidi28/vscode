package Arrays;
public class Valid_Mountain_Array {
    
    public static boolean validMountainArray(int[] arr){
        int Peak=Valid_Mountain_Array.peakInMountainArray(arr);
        if(arr[0]==Peak||arr[arr.length-1]==Peak||Peak == -1) return false;
        for(int i=0;i<Peak;i++){
            if(arr[i]>=arr[i+1]) return false;
        }
        for(int j=Peak+1;j<arr.length;j++){
            if(arr[j]>=arr[j-1]) return false;
        }
         return true;
    }

      public static  int peakInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end && arr.length>2){
            int mid=start + (end - start) / 2;
            if(arr[mid]>arr[mid+1])
            end=mid;

            else if(arr[mid]<arr[mid+1]){
                if(mid==0){
                    return end;
                }
                if(arr[mid] <= arr[mid - 1]){
                   return -1;
                }
                start=mid+1;
            }
            else{
                return -1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[]={3,5,5};
        //int arr[]={0,2,3,4,5,2,1,0};
        System.out.println(Valid_Mountain_Array.peakInMountainArray(arr));
        System.out.println(Valid_Mountain_Array.validMountainArray(arr));
    }
}
