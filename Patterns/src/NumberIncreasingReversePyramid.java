public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
    }
}
