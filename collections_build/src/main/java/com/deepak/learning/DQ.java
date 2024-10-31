package com.deepak.learning;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DQ {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(List.of(10,20,30,40,1,2,3,4));
        ArrayDeque<Integer> dq=new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6,7,8));
    //    dq.remove();
    //    System.out.println(dq);
    //    dq.removeFirst();
    //    System.out.println(dq);
    //    dq.remove(2);
    //    System.out.println(dq);
        // dq.push(10);
        // System.out.println(dq.peek());
        //dq.retainAll(al);
        Integer[] arr=dq.toArray(new Integer[dq.size()]);
        System.out.print(dq.retainAll(al)+" "+dq);
        System.out.println();
        System.out.print("[");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.print("]");
    }
}
