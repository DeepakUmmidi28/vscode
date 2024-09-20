package CollectionsDemo;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class GenericList<T> implements Iterable{
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    GenericList(){
        items=(T[])new Object[100];
        size=0;
    }

    public int getSize(){
        return size;
    }

    public void add(T item){
        items[size++]=item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }

    public Iterator<T> iterator(){
        return new GenericListIterator(this);
    }

    private class GenericListIterator implements Iterator<T>{
        GenericList<T> list;
        int index=0;

        GenericListIterator(GenericList<T> list){
            this.list=list;
        } 

        public boolean hasNext(){
            return index<list.size;
        }

        public T next(){
            return list.items[index++];
        }
    }
}
