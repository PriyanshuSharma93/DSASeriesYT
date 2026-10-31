package LinkedList;

public class Circular_Linked_List {


//    ========SINGLY CIRCULAR LINKED LIST===============

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    private Node head;
    private Node tail;
    private int size;

    Circular_Linked_List(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }


    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null ){
            head=newNode;
            tail=newNode;

            tail.next=head;
        }
        else {
            newNode.next=head;

            head=newNode;
            tail.next=head;
        }
        size++;
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head==null ){
            head=newNode;
            tail=newNode;
            tail.next=head;
        } else{

            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
        size++;
    }


    public void insertAtPosition(int position,int data){
        if(position<1 || position>size+1){
            System.out.println("Insertion is not possible at this position");
            return;
        }
        if(position==1){
            insertAtHead(data);
            return;
        }
        if (position==size+1){
            insertAtTail(data);
            return;
        }
        Node newNode = new Node(data);
        Node prevNode =head;

        for(int i=1;i<=position-2;i++){
            prevNode=prevNode.next;

        }
         Node currNode=newNode;
         Node nextNode=prevNode.next;

         prevNode.next=currNode;
         currNode.next=nextNode;

        size++;
    }


    public void printList() {
        if (head == null) {
            System.out.println("LL is empty, can  not print anything");
            return;
        }
        Node current = head;

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head) ;
            System.out.println("(Back to Head)");

    }

    public boolean searchLL(int target){
        if(head==null){
            System.out.println("No Nodes Inside LL");
            return false;
        }
        Node current =head;
        do{
            if(current.data==target){
                return true;
            }
            current=current.next;
        }
        while(current!=head);
        return false;
    }


    public void deleteHead(){
        if(head==null){
            System.out.println("LL is empty, cannot delete anything");
            return;
        }

        if(head==tail){
            head=null;
            tail=null;
            size =0;
            return;
        }

        Node temp=head;
        head=head.next;

        tail.next=head;

        temp.next=null;

        size--;
    }


    public void deleteTail() {
        if(head==null){
            System.out.println("LL is empty, cannot delete anything");
            return;
        }

        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }
        Node prevNode=head;
        for(int i=1;i<size-2;i++){
            prevNode=prevNode.next;
        }
        prevNode.next=head;
        tail.next=null;
        tail=prevNode;


        size--;
    }


    public void deleteAtPosition(int position) {

        if(position < 1 || position > size){
            System.out.println("Deletion is not possible at this position");
            return;
        }
        if(position == 1){
            deleteHead();
            return;
        }
        if(position == size){
            deleteTail();
            return;
        }
         Node prevNode=head;
         for(int i=0;i<=position-2;i++){
             prevNode=prevNode.next;
         }
         Node currNode=prevNode.next;
         Node nextNode=currNode.next;

         prevNode.next=nextNode;

         currNode.next=null;

        size--;
    }


    public static void main(String[] args) {
        Circular_Linked_List mylist=new Circular_Linked_List();


        mylist.insertAtHead(20);
        mylist.insertAtHead(10);
        mylist.insertAtTail(40);
        mylist.insertAtPosition(3,30);
        mylist.printList();

        System.out.println("Search 30:"+ mylist.searchLL(30));
        System.out.println("Search 30:"+ mylist.searchLL(100));

        mylist.deleteHead();
        mylist.printList();

        mylist.deleteTail();
        mylist.printList();

        mylist.deleteAtPosition(2);
        mylist.printList();

        mylist.insertAtTail(100);
        mylist.insertAtTail(200);
        mylist.insertAtTail(300);

        mylist.printList();









    }

}
