class Demo01
{
    public static void main(String[] args) {
        // whileLoop w =new whileLoop();
        // w.loop();
        // ForLoop f=new ForLoop();
        // f.Deepak();
        // DoWhile d=new DoWhile();
        // d.loop();
        forEach f=new forEach();
        f.looop();
    }
}

// class whileLoop
// {
//     public void loop()
//     {
//         int i=0;
//         while(i<=10)
//         {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// class ForLoop
// {
//     public void Deepak()
//     {
//        for(int i=0;i<=10;i++)
//        {
//             System.out.println(i);
//        }
//     }
// }

// class DoWhile
// {
//     public void loop()
//     {
//         int i=10;
//         do{
//             System.out.println("Entered Do Condition"+ i);
//             i--;
//         }while(i>2);
//     }
// }

class forEach
{
    public void looop()
    {
        int arr[]={10,2,3,40,5,6,7,8,9};
        for(int i:arr)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}