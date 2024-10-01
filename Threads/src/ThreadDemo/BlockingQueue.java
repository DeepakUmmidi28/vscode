package ThreadDemo;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> queue;
    int capacity;
    int default_capacity=Integer.MIN_VALUE;
    BlockingQueue(int capacity){
        this.capacity=capacity;
        queue=new LinkedList<>();
    }

    BlockingQueue(){
        this.capacity=default_capacity;
    }

    public synchronized boolean add(int item) throws InterruptedException{
        while(queue.size()==capacity)
        wait();
        queue.add(item);
        notify();
        return true;
    }

    public synchronized int remove() throws InterruptedException{
        while(queue.peek()==null)
        wait();
        int element=queue.remove();
        notify();
        return element;
    }
}

class driver1{
    public static void main(String[] args) {
        BlockingQueue b=new BlockingQueue(10);
        new Thread(()->{
            int counter=0;
            while(++counter<10)
            {
                try {
                    System.out.println("Pushed : "+b.add(counter));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            int counter=0;
            while(++counter<10)
            {
                try {
                    System.out.println("Popped : "+b.remove());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
