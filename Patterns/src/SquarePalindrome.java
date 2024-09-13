public class SquarePalindrome {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        //for no. of rows
        for(int i=1;i<=n;i++)
        {
            //part-1
            for(int j=n;j>=1;j--)
            {
                System.out.print(j);
            }
            //part-2
            for(int k=2;k<=n;k++)
            {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}
