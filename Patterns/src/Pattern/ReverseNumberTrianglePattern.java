package Pattern;
public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        for(int i=1;i<=n;i++)
        {
            //for(int j=1;j<i;j++)
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}
