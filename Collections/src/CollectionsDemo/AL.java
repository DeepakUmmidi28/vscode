package CollectionsDemo;

import java.util.Arrays;

public class AL{
    private int[] data;
    private int size;
    private int default_size=10;

    AL(){
        data=new int[default_size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private boolean isFull(){
        return size==data.length;
    }

    private void resize(){
        int temp[]=new int[data.length * 2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public String toString(){
        return Arrays.toString(data);
    }
}
