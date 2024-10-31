package com.deepak.learning;
import java.util.*;
public class Alist {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        // List<Integer> l=new ArrayList<>(Arrays.asList(1,2,3));
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(1,10);
        //String[] str=l1.toArray(new String[l1.size()]);
        // Iterator<Integer> it=l1.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for(Iterator<Integer> it=l1.iterator();it.hasNext();)
        // {
        //     System.out.println(it.next());
        // }

        //l1.forEach((n->System.out.println(n)));

       // l1.forEach(System.out::println);
        // for(Object x: str)
        // {
        //     System.out.println(x);
        // }
    }
}
