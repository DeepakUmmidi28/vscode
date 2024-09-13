public class Problem {
    public static void main(String[] args) {
        WhiteBoard w=new WhiteBoard();
        Student s1=new Student(w);
        Student s2=new Student(w);
        Student s3=new Student(w);
        Student s4=new Student(w);
        Teacher t=new Teacher(w);
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        t.start();
    }
}

class WhiteBoard
{
    private String text;
    private int count=0;
    int num=0;
    
    public synchronized void write(String msg)
    {
        if(count!=0)
        try { wait();Thread.sleep(1000); } catch (Exception e) {System.out.println(e);}
        System.out.println("Teacher is writing "+msg);
        System.out.flush();
        text=msg;
        count=num;
        notifyAll();
    }
    public synchronized String read()
    {
        if(count==0)
        try { wait();Thread.sleep(1000); } catch (Exception e) {System.out.println(e);}
        String t=text;
        count--;
        if(count==0)notify();
        return t;
    }
    public void attendance()
    {
        num++;
    }
}
class Student extends Thread
{
    String str;
    private WhiteBoard w; 
    Student(WhiteBoard w)
    {
        this.w=w;
        w.attendance();
    }
    public  void run()
    {
        do{
            str=w.read();
            System.out.println("Reading : "+str);
        }while(!str.equals("Rakesh"));
        
    }
}

class Teacher extends Thread
{
    private WhiteBoard w; 
    Teacher(WhiteBoard w)
    {
        this.w=w;
    }
    String arr[]={"Deepak","ramya","Anil","John","Rakesh"};
    public  void run()
    {
       for(int i=0;i<arr.length;i++)
       {
            w.write(arr[i]);
       }
    }
}
