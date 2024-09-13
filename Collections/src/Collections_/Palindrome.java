package Collections_;
public class Palindrome {
    public static void main(String[] args) {
        int n=101;
        String str=Integer.toString(n);
        int size=str.length();
        Palindrome p=new Palindrome();
        int rnum=p.reverse(n, size);
        System.out.println(rnum);
        if(rnum==n)
        {
            System.out.println(true);
        }
        else
        System.out.println(false);
    }

    public int reverse(int n,int size)
    {
        int rnum=0;
        for(int i=0;i<size;i++)
        {
           rnum=rnum*10 + n%10;
           n=n/10;
        }
        return rnum;
    }
}
