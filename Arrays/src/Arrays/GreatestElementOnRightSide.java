package Arrays;
public class GreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        if(arr.length==1){
            arr[0]=-1;
        }
        else{
            for(int i=0;i<arr.length-1;i++){
                int max=arr[i+1];
                int j;
                for(j=i+1;j<arr.length;j++){
                    max=Integer.max(max,arr[j]);
                }
                arr[i]=max;
            }
            arr[arr.length-1]=-1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
