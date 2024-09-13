public class RightHalfPyramid {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
