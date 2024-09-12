package Collections;
public class LL {
         LL()
            {
              size=0;
            }

        Node head;
        int size;
    class Node
    {
        String data;
        Node next;
        Node(){};

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    } 

        public void addFirst(String data)
        {
            Node newNode=new Node(data);
            //System.out.println("Current size : "+size);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void printList()
        {
            if(head==null){
                System.out.println("List is empty");
            }
            Node currNode=head;
            while(currNode!=null)
            {
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("null");
        }

        public void addLast(String data)
        {
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode=head;
            while(currNode.next!=null)
            {
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }

        public void deleteFirst()
        {
            size--;
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head=head.next;
        }

        public void deleteLast()
        {
            size--;
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            if(head.next==null)
            {
                head=null;
                return;
            }
            Node secondLast=head;
            Node lastNode=head.next;
            while(lastNode.next!=null)
            {
                secondLast=secondLast.next;
                lastNode=lastNode.next;
            }
            secondLast.next=null;
        }

        public int getSize()
        {
            return size;
        }


        public static void main(String[] args) {
            LL list =new LL();
            list.addFirst("is");
            list.addFirst("This");
            list.addLast("list");
            list.deleteFirst();
            //list.deleteLast();
            list.printList();
            System.out.println(list.getSize());
        }
}
