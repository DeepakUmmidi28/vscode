package ThreadDemo;

public class MultiThreading2 {
    public static void main(String[] args) {
        Resource r=new Resource();
        Thread3 p=new Thread3(r);
        Thread4 c=new Thread4(r);
        p.start();
        c.start();
    }
}

class Resource{
    public synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

class Thread3 extends Thread{
    Resource r;
    Thread3(Resource r){
        this.r=r;
    }
    public  void run(){
        String str="Deepak is learning JAVA";
        r.display(str);
    }
}

class Thread4 extends Thread{
    Resource r;
    Thread4(Resource r){
        this.r=r;
    }
    public  void run(){
        String str="Hemanth is learning Python";
        r.display(str);
    }
}

