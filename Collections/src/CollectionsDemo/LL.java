package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class LL {
    private Node head;
    private Node tail;
    @SuppressWarnings("unused")
    private int size;
    LL(){
        head=null;
        tail=null;
        size=0;
    }
    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }
        Node(){}
    }

    public void addFirst(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;

        if(tail==null) tail=head;
        size+=1;
    }

    public void addLast(int value){
        if(head!=null){
            Node addNode=new Node(value);
            Node newNode=new Node();
            newNode=head;
            while(newNode.next!=null){
                newNode=newNode.next;
            }
            newNode.next=addNode;
            tail=addNode;
            size+=1;
        }
        else{
            Node addNode=new Node(value);
            head=addNode;
            tail=addNode;
            size+=1;
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
            System.out.print("null");
            System.out.println();
        }else{System.out.println("List is empty");}
    }

    public void printHT(){
        System.out.println("Head : "+head.value);
        System.out.println("Tail : "+tail.value);
    }

    public void addElementAtIndex(int index,int value) throws IndexInvalidException{
        Node node=new Node(value);
        int count=0;
        if(index==0 & head!=null){
            node.next=head;
            head=node;
            return;
        }
        if(head!=null){
            Node temp=new Node();
            Node prev=new Node();
            temp=head;
            while(count!=index & temp.next!=null){
                prev=temp;
                temp=temp.next;
                count++;
            }
            if(temp.next==null) temp.next=node;
            else{
                prev.next=node;
                node.next=temp;
            }
        }else{throw new IndexInvalidException();}

    }

    public void deleteFirst(){
        head=head.next;
    }

    public void deleteLast(){
        if(head!=null){
            size--;
            Node temp=new Node();
            Node prev=new Node();
            temp=head;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            tail=prev;
        }    
    }

    public void deleteIndex(int index){
        if(head!=null){
            size--;
            Node temp=new Node();
            Node prev=new Node();
            int i=0;
            temp=head;
            while(i < index){
                prev=temp;
                temp=temp.next;
                i++;
            }
            prev.next=temp.next;
        }
    }

    public void reverse(){
        List<Integer> list=new ArrayList<>();
        Node temp=new Node();
        temp=head;
        while(temp!=null){
            list.add(temp.value);
            temp=temp.next;
        }
        
    }
}
