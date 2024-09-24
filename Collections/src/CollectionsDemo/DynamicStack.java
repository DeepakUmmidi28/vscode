package CollectionsDemo;

public class DynamicStack<T> extends CustomStack<T>{
    DynamicStack(){
        super();
    }

    DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(T item){
        if(isFull()){
            Object temp[]=new Object[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data=temp;
        }
        super.push(item);
        return true;    
    }
}
