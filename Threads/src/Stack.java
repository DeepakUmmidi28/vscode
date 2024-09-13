public class Stack {
    int arr[];
    int stackTop;
    //int obj;
    public Stack(int size)
    {
       arr= new int[size];
       stackTop=-1;
    }

    public synchronized boolean push(int num)
    {
        if(isFull()) 
            {
                System.out.println("Stack is full");
                return false;
            }
        else{
            stackTop++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            arr[stackTop]=num;
            return true;
            }
    }

    public boolean isFull()
    {
        return stackTop>arr.length-1;
    }
    public synchronized int pop()
    {
        if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
        else
            {
                int  obj=arr[stackTop];
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                arr[stackTop]=Integer.MIN_VALUE;
                stackTop--;
                return obj;
            }
    }
    public boolean isEmpty()
    {
        return stackTop==-1;
    }
}
