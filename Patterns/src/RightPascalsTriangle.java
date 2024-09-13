public class RightPascalsTriangle {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        for(int k=1;k<=n-1;k++)
        {
            for(int l=1;l<=k;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
