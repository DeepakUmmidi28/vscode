package CollectionsDemo;

import java.util.Comparator;

public class DemoComparator implements Comparator<Integer>{
    public int compare(Integer i,Integer j){
        if(i%10>j%10)
        return 1;
        else 
        return -1;
    }
}
