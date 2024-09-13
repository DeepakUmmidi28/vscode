public class Solution {
    public static void main(String[] args) {
        print(3);
    }

    public static void print(int n){
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                for(int k=1;k<=i;k++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}

