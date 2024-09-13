public class ReverseHollowTriangle {
    public static void main(String[] args) {
        int n=4;
        fun(n);
    }

    private static void fun(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
           
            for(int k=i;k<=n;k++)
            {
                if(k==1||k==n||i==1||k==i)
                {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
                //System.out.print("*"+" ");
            }
 
            System.out.println("");
        }

        }
    }

