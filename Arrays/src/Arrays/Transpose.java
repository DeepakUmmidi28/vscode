package Arrays;

public class Transpose {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        transpose(arr);
        reversePrint(arr);
        // for(int i=0;i<arr.length;i++) {
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }

    public static void transpose(int arr[][]) {
        for(int row=0;row<arr.length;row++) {
            for(int col=row;col<arr.length;col++) {
                int temp=arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
            }
        }
    } 
    
    public static void reversePrint(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
