package com.deepak.learning;

public class CircularQueue<T> {
    protected Object data[];
    private static final int DEFAULT_SIZE=10;
    private int end;
    private int front;
    private int size;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }

    CircularQueue(int size){
        data=new Object[size];
        end=0;
        front=0;
        size=0;
    }

    public boolean isFull(){
        return size==data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(T item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }    
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public T remove() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");
        @SuppressWarnings("unchecked")
        T removed=(T)data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    public static void main(String[] args) throws Exception{
        CircularQueue<Integer> queue=new CircularQueue<>();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println(queue.remove());
        queue.insert(10);
        queue.insert(20);
    }

}
