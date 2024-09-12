package Arrays;
public class MaximumOfEachSubArray {
    public static void max(int arr[],int k){
        int i=0,j=0,max=0;
        while(j<arr.length){
            max=Integer.max(max,arr[j]);
            if((j-i+1)<k){
                j++;
            }
            else{
                System.out.print(max+" ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,2,1,0,5,3,10,2};
        max(arr,3);
    }
}
