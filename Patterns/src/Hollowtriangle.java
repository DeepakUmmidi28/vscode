public class Hollowtriangle {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }

    private static void fun(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
           
            for(int k=1;k<=i;k++)
            {
                if(k==1||k==i||i==n)
                {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
 
            System.out.println("");
        }

        }
    }

