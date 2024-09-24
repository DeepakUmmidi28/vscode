package CollectionsDemo;

public class CustomStack<T> {
    protected Object data[];
    private static final int DEFAULT_SIZE=10;
    private int ptr;

    public CustomStack(int size){
        data=new Object[size];
        ptr=-1;
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(T item){
        if(isFull()){
            System.out.println("Stack is empty");
            return false;
        }
        data[++ptr]=item;
        return true;
    }

    @SuppressWarnings("unchecked")
    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        T returned=(T) data[ptr--];
        return returned;
    }

    @SuppressWarnings("unchecked")
    public T peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return (T) data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception{
        CustomStack<Integer> stack=new DynamicStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
