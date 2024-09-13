//Square fill Pattern
class SquareFill
{
    public static void main(String[] args) {
        int n=6;
        SquareFill.fun1(n);
    }

    public static void fun1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}