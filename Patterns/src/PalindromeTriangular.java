public class PalindromeTriangular {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println("");
        }
    }
}
