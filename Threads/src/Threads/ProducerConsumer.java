public class ProducerConsumer {
    public static void main(String[] args) {
        Utility u=new Utility();
        Producer p=new Producer(u);
        Consumer c= new Consumer(u);
        p.start();
        c.start();
    }
}

class Producer extends Thread
{
    int arr[]={1,2,3,4,5};
    Utility u=new Utility();
    Producer(Utility u)
    {
        this.u=u;
    }

    public void run()
    {
       for (int i : arr) 
       {
            u.write(i);
       }
    }
}

class Consumer extends Thread
{
    Utility u;
    Consumer(Utility u)
    {
        this.u=u;
    }
    public void run()
    {
       
        for(int i=0;i<=5;i++)
       {
        int var=u.read();
        System.out.println("Reading :"+" "+var);
       }
       
    }
}

class Utility
{
    //private int num;
    private int var;
    private boolean flag=true;
    public synchronized void write(int num) 
    {
       while(flag!=true)
        try {
            wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Writing :"+" "+num);
        var=num;
        flag=false;
        notify();
    }

    public synchronized int read() 
    {
        int x=0;
        while(flag!=false)
        try {
            wait();Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         x=var;
        flag=true;
        notify();
        return x;
    }
}