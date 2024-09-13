public class Test {
  
}

class ex implements Runnable
{
    public void run()
    {
        Thread t1=new Thread(this,"ex");
        t1.start();
    }
    public static void main(String[] args) {
        
    }

}

class ex2 extends Thread{
    public void run()
    {
        System.out.println("Ex2 Run Method");
    }
}