package com.deepak.learning;
import java.util.Scanner;

public class AOO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Store items[]=new Store[1];
        // for(int i=0;i<1;i++){
        //     System.out.print("Name: ");
        //     //String name = sc.next();
        //     System.out.print("Price: ");
        //     //float price = sc.nextFloat();
        //     System.out.print("Quantity: ");
        //     //int qty = sc.nextInt();
        //     items[i] = new Store(sc.next(), sc.nextFloat(), sc.nextInt());
        // }

        // for(Store x:items)
        // {
        //     x=new Store(sc.next(), sc.nextFloat(), sc.nextInt());
        // }
        for(Store y:items){
            System.out.println(y);
        }
        sc.close();
    }
}

class Store{
    String name;
    float price;
    int qty;
    Store(String name,float price,int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;
    }
}
