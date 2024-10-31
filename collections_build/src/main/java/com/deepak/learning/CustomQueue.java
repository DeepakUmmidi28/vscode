package com.deepak.learning;

public class CustomQueue<T> {
    protected Object data[];
    private static final int DEFAULT_SIZE=10;
    private int end;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size){
        data=new Object[size];
        end=0;
    }

    public boolean insert(T item) throws Exception{
        if(isFull()){
           throw new Exception("Queue is full");
        } 
        data[end++]=item;
        return true;
    }

    public boolean isFull(){
        return end==data.length;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public T remove() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");
        @SuppressWarnings("unchecked")
        T removed=(T)data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T front() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");
        return (T) data[0];
    }

    public void display() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
    }

    public static void main(String[] args) throws Exception{
        CustomQueue<Integer> queue=new CustomQueue<>();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.remove();

        queue.display();
    }
}
