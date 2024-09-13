public class Sum2 {
    public static void main(String[] args) {
        int n=2;
        int result=1;
        int i=1;
        int sum=0;
        // for(i=1;i<=10;i++)
        // {
        //     result=n*i;
        //     System.out.println(n+" "+"*"+" "+i+"="+result);

        // }

        while(i<=10)
        {
            result = n*i;
            sum=sum+result;
            System.out.println(n+" "+"*"+" "+i+"="+result);
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
}


//2 * 2 = 4