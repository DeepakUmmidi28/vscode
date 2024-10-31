package com.deepak.learning;

public class CLL {
    Node head;
    Node tail;
    int size;

    CLL(){
        head=null;
        tail=null;
        size=0;
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }

        Node(){}
    }

    public void addFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
           size++;
        }
        else{
            node.next=head;
            head=node;
           tail.next=head;
           size++;
        }
    }

    public void addLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            size++;
        }
        else{
            tail.next=node;
            tail=node;
            tail.next=head;
            size++;
        }
    }

    public void printList(){
        Node temp=new Node();
        if(head==null){
            System.out.println("List is empty");
        }

        if(head==tail){
            System.out.print(head.value+" -> ");
        }
        else{
            temp=head;
            do{
            System.out.print(temp.value+" -> ");
            temp=temp.next;
            }while(temp!=head);
        }

        System.out.print("head");
    }
}
