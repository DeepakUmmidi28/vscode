package com.deepak.learning;

public class DLL {
    Node head;
    Node tail;
    int size;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value=value;
        }

        Node(int value, Node next, Node prev){
            this.next=next;
            this.prev=prev;
            this.value=value;
        }

        Node(){}
    }

    DLL(){
        size=0;
        head=null;
        tail=null;
    }

    public void addFirst(int value){
        Node node=new Node(value);
        if(head!=null){
            node.next=head;
            head.prev=node;
            head=node;
            size++;
        }
        else{
            head=node;
            tail=node;
            size++;
        }
    }

    public void printList(){
        if(head!=null){
            Node temp=new Node();
            temp=head;
            while(temp!=null){
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
            System.out.println();
        }
    }

    public void addLast(int value){
        Node node=new Node(value);
        node.prev=tail;
        tail.next=node;
        tail=node;
        size++;
    }
}
