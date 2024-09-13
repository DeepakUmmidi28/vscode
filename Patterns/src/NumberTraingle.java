public class NumberTraingle {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        for(int i=1;i<=n;i++)
        {
            //for(int j=n-1;j>=i;j--)
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
