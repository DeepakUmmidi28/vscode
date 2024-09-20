package ThreadDemo;

public class MultiThreading {
    public static void main(String[] args) {
        Data d=new Data();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
}

class Data{
    int value;

    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        int x=value;
        return x;
    }
}

class Producer extends Thread{
    Data d;
    int value=0;
    Producer(Data d){
        this.d=d;
    }
    public synchronized void run(){
        while(true){
            d.setValue(value);
            System.out.println("Producer : "+value);
            try{Thread.sleep(100);}catch(Exception e){}
            value++;
        }
    }
}
class Consumer extends Thread{
    Data d;
    Consumer(Data d){
        this.d=d;
    }
    public synchronized void run(){
        while(true){
            int v=d.getValue();
            System.out.println("Consumer : "+v);
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}
