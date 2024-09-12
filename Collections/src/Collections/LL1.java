package Collections;
// import java.util.LinkedList;
// import java.util.List;

public class LL1 {
    
    Node head;
    int size;
    LL1(){
        size=0;
    }
    class Node{
        Node next;
        int element;
        
        Node(int element){
            this.element=element;
            this.next=null;
            size++;
        }

        public Node() {
            //TODO Auto-generated constructor stub
        }
    }
    public static void main(String[] args) {
        // List<Integer> ll=new LinkedList<>(List.of(1, 5, 7, 3 , 8, 2, 3));
        // ll.indexOf(7);
        // for(int x:ll)
        // {
        //     if(x==7)
        //     System.out.println(ll.indexOf(x));
        // }
           
            // list.add(3);
            // list.add(8);
            // list.add(2);
            // list.add(3);

            // LL1 list=new LL1();
            // list.add(1);
            // list.add(2);
            // list.add(7);
            // list.printList(); 
            // System.out.println("Element at index : "+list.get(2)); 
            
            LL1 list=new LL1();
            list.add(4);
            list.add(2);
            list.add(1);
            list.add(3);
            list.printList();
            list.ReverseList(list);
            list.printList();
    }

    public void add(int element){
        Node newNode =new Node(element);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.element+"-> ");
            currNode=currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public int get(int index){
        if(size==0||index>size-1){
        return -1;
        }
        if(head==null){
            System.out.print("List is empty");
        }
        if(index==0){
            return head.element;
        }

        int currIndex=0;
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            if(++currIndex==index){
            return currNode.element;}
        }
        return 0;
    } 

    public LL1 sortList(LL1 list)
        {
            if(list.head==null){
                System.out.println("List is empty");
                return list;
            }
            Node temp=list.head;
            while(temp!=null)
            {
                Node current=temp.next;
                while(current!=null){
                    if(temp.element>current.element){
                        int x=temp.element;
                        temp.element=current.element;
                        current.element=x;
                    }
                    current=current.next;
                }
                temp=temp.next;
            }
            return list;
        }
    
        public  void ReverseList(LL1 list){
            
            Node prev=list.head;
            Node curr=prev.next;
            while(curr!=null){
                Node nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
            }
            head.next=null;
            head=prev;
        }   

}
