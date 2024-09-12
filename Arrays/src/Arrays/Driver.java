package Arrays;
public class Driver {
    public static void main(String[] args) {
        int arr[]={7,4,2,8,9,4};
        //int n=Operations.LinearSearch(arr, 2);
        //int m=Operations.BinarySearch(arr, 4);
        int m[]=Operations.Delete(arr, 2);
        for (int i : m) {
            System.out.print(i+" ");
        }
    }
}
