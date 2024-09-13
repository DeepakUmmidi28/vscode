public class Multithreading {
    public static void main(String[] args) {
       Stack s=new Stack(5);

        new Thread(()->{
            int counter=0;
            while(++counter<10)
            {
                System.out.println("Pushed : "+s.push(10));
            }
        }).start(); 

        new Thread(()->{
            int counter=0;
            while(++counter<10)
            {
                System.out.println("Popped : "+s.pop());
            }
        }).start();
        
        
        // Thread1 t1=new Thread1(s);
        // t1.start();
        // Thread2 t2=new Thread2(s);
        // t2.start();
    }

}

// class Thread1 extends Thread
// {
//     private Stack stack;
//     Thread1(Stack s)
//     {
//         this.stack=s;
//     }
//     public void run()
//     {
//         int i=0;
//         while(++i < 10)
//             {
//                 System.out.println("Pushed :"+i);
                
//             }
//     }
// }

// class Thread2 extends Thread
// {
//     private Stack stack;
//     Thread2(Stack s)
//     {
//         this.stack=s;
//     }
//     public void run()
//     {
//         int i=0;
//         while(++i < 10)
//             {
//                 System.out.println("Popped :"+i);
                
//             }
//     }
// }