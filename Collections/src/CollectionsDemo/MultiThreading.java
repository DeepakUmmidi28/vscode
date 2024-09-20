package CollectionsDemo;

import java.util.*;

public class MultiThreading {
    public static void main(String[] args) {
        Vector<Integer> list=new Vector<>();
        Producer p=new Producer(list);
        Consumer c=new Consumer(list);
        p.start();
        c.start();
    }
}

class Producer extends Thread{
    Vector<Integer> list;
    Producer(Vector<Integer> list){
        this.list=list;
    }
    public  void run(){
        int count=0;
        for(int i=0;i<20;i++){
            synchronized(list){
                if(!list.isEmpty()){
                    try {
                        list.wait();
                    } catch (Exception e) {                }
                }
                list.add(count);
                System.out.println("Pushing : "+count);
                count++;
                list.notify();
                try {
                    Thread.sleep(100);
                } catch (Exception e) {            }
            }
        }
    }
}

class Consumer extends Thread {
    Vector<Integer> list;
    Consumer(Vector<Integer> list) {
        this.list = list;
    }
    
    public void run() {
        synchronized(list){
            for (int i = 0; i < 20; i++) {
                if(list.isEmpty()){
                    try {
                        list.wait();
                    } catch (Exception e) {                }
                }
                int item=list.remove(0);
                System.out.println("Popping : "+item);
                list.notify();
                try {
                    Thread.sleep(100);
                } catch (Exception e) {            }
            }
        }
    }
}