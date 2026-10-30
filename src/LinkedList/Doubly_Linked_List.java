package LinkedList;

public class Doubly_Linked_List {

    static class Node{
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    Doubly_Linked_List(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }


    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
        size++;
    }

    public void insertAtTail(int data){
       Node newNode = new Node(data);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        } else{
            newNode.previous=tail;
            tail.next=newNode;
            tail=newNode;
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
        Node temp =head;
        for(int i=1;i<=position-2;i++){
           temp=temp.next;
        }
       Node prevNode=temp;
       Node nextNode=prevNode.next;
       Node currNode=new Node(data);

       currNode.previous=prevNode;
       prevNode.next=currNode;
       currNode.next=nextNode;
       nextNode.previous=currNode;
       size++;
    }
    public void printList(){
        if(head==null){
            System.out.println("LL is empty, can  not print anything");
            return;
        }
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public void printbackward(){
        Node temp=tail;
        while(temp!=null){
            System.out.print("<-" + temp.data );
            temp=temp.previous;

        }
        System.out.println();

    }

    public boolean searchLL(int target){
        if(head==null){
            System.out.println("No Nodes Inside LL");
            return false;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                return true;
            }
            else{
                temp=temp.next;
            }
        }
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
            size--;
            return;
        }

        head=head.next;
        head.previous=null;
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
            size--;
            return;
        }

        tail=tail.previous;
        tail.next=null;
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
        Node temp = head;
        for(int i = 1; i < position; i++){
            temp = temp.next;
        }
        Node prevNode = temp.previous;
        Node nextNode = temp.next;
        prevNode.next = nextNode;
        nextNode.previous = prevNode;
        size--;
    }


    public static void main(String[] args) {
        Doubly_Linked_List mylist=new Doubly_Linked_List();


          mylist.insertAtHead(10);
          mylist.printList();

          mylist.insertAtHead(20);
          mylist.printList();

          mylist.insertAtHead(30);
          mylist.printList();

          mylist.insertAtTail(100);
          mylist.printList();

          mylist.insertAtTail(110);
          mylist.printList();

          mylist.insertAtTail(120);
          mylist.printList();

        mylist.insertAtPosition(3,5000);
        mylist.printList();

//        mylist.printbackward();
//
//        System.out.println("Found or not :" +  mylist.searchLL(5000));

//        mylist.deleteHead();
//        mylist.printList();
//
//        mylist.deleteHead();
//        mylist.printList();
//
//        mylist.deleteHead();
//        mylist.printList();
//
//        mylist.deleteTail();
//        mylist.printList();
//
//        mylist.deleteTail();
//        mylist.printList();
//
//        mylist.deleteTail();
//        mylist.printList();
//
//        mylist.deleteTail();
//        mylist.printList();
//
//        mylist.deleteTail();
//        mylist.printList();
//
//        mylist.deleteTail();
//        mylist.printList();
//
//        mylist.deleteTail();
          mylist.printList();

        mylist.deleteAtPosition(3);
        mylist.printList();




    }

}
