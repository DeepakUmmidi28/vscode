package ThreadDemo;

public class Stack {
    int array[];
    int capacity;
    int stackTop;

    public Stack(int capacity){
        array=new int[capacity];
        stackTop=-1;
    }

    public boolean isFull(){
        return stackTop==array.length-1;
    }

    public boolean isEmpty(){
        return stackTop==-1;
    }

    public synchronized boolean push(int element) throws Exception{
        if(isFull()) return false;
        ++stackTop;
        Thread.sleep(1000);
        array[stackTop]=element;
        return true;
    }

    public synchronized int pop() throws Exception{
        if(isEmpty()) return Integer.MIN_VALUE;
        int element=array[stackTop];
        Thread.sleep(1000);
        array[stackTop]=Integer.MIN_VALUE;
        stackTop--;
        return  element;
    }
}
