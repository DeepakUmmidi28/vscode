public class Sum1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=4;i!=0;i--)
        {
            if(i%2==0)
            sum=sum+i;
        }
        System.out.println(sum);
    }
}