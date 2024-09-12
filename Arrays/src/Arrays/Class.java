package Arrays;

import java.util.ArrayList;

public class Class <E>{
    private E attribute;
    
    public void set (E value){
        this.attribute = value;
    }
    
    public E get(){
        return attribute;
    }

    public  String method (Class<E> c, E e){
        c.set(e);
        return c.get().toString();
    }
    public static void main (String[] args){
        Class<Integer> myClass = new Class<Integer>();
        Class<String> yourClass = new Class<String>();
        System.out.println(myClass.method(yourClass, 0) + yourClass.method(myClass, "0"));
    }
}