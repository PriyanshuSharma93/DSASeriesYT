package LinkedList;

public class SinglyLinkedLikst {

    static class Node{
        int data;
        Node next;


//        constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

//    constructor

    public SinglyLinkedLikst()
    {
        this.head=head;
        this.tail=tail;
        this.size=0;
    }


    public void insertAtHead(int data){
       Node newNode = new Node(data);
        if(head==null && tail==null){
        head=newNode;
        tail=newNode;
    }
    else {
        newNode.next=head;
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
         tail.next=newNode;
         tail=newNode;
     }
     size++;
    }

    public void insertAtPosition(int position,int data){
      if(position<1 && position>size+1){
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
      Node prevNode=head;
      for(int i=1;i<=position-2;i++){
          prevNode=prevNode.next;
      }
      Node newNode= new Node(data);
      newNode.next=prevNode.next;
      prevNode.next=newNode;
      size++;
    }

    public void printList(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }


    public int getHead(){
        if(head==null){
            return -1;
        } else {
            return head.data;
        }
    }

    public int getTail(){
        if(tail==null){
            return -1;
        } else {
            return tail.data;
        }
    }


    public boolean search(int target){
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

    public  int findPosition(int target){
        Node temp=head;
        int position=1;

        while(temp!=null){
            if(temp.data==target){
                return position;
            }
            else{
                temp=temp.next;
                position++;
            }
        }

      return -1;

    }


    public void updateAtPosition(int position,int newData){
        if(position<1 || position>size+1){
            System.out.println("Invalid Position given in the Input");
            return;
        }
        Node temp=head;
        for(int i=1;i<=position-1;i++){
            temp=temp.next;
        }
        temp.data=newData;
    }

    public boolean updateValue(int oldValue,int newValue){
        Node temp=head;
        while(temp!=null){
            if(temp.data==oldValue){
                temp.data=newValue;
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public void deleteHead(){
        if(head==null){
            System.out.println("LL is empty, cannot delete anything");
            return;
        }
        head=head.next;
        size--;

        if(head==null) {
            tail = null;
        }
    }

    public void deleteTail(){

        if(head==null){
            System.out.println("LL is Empty,cannot delete anything");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }
        Node temp=head;
        for(int i=1;i<=size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    public void  deleteAtPosition(int position){
        if(position<1 || position>size+1){
            System.out.println("Invalid Positions , can't delete node ");
            return;
        }
        if(position==1){
            deleteHead();
            return;
        }
        if (position==size){
            deleteTail();
            return;
        }
        Node prev=head;

        for(int i=1;i<=position-2;i++){
            prev=prev.next;
        }

        Node curr=prev.next;
        Node forward=curr.next;

        prev.next=forward;
        curr.next=null;
        size--;
    }

    public boolean deleteValue(int target){
       if(head==null){
           System.out.println("Deletion not possible, no nodes to delete");
           return false;
       }
       if(head.data==target){
           deleteHead();
           return true;
       }
       Node prev=head;
       Node curr=head.next;

       while(curr!=null){
           if(curr.data==target){
               Node forward=curr.next;

               prev.next=forward;
               curr.next=null;

               if(tail==curr){
                   tail=prev;
               }
               size--;
               return true;
           } else{
               prev=prev.next;
               curr=curr.next;
           }
       }
       return false;

    }


    public static void main(String args[]) {
    SinglyLinkedLikst mylist= new SinglyLinkedLikst();
    if(mylist.isEmpty()){
        System.out.println("List is Empty");
    }
        System.out.println("Size of LL: "+mylist.getSize());
        mylist.insertAtHead(10);
        mylist.printList();

        mylist.insertAtHead(20);
        mylist.printList();

        mylist.insertAtHead(30);
        mylist.printList();

        mylist.insertAtTail(100);
        mylist.printList();
//
//        mylist.insertAtTail(200);
//        mylist.printList();
//
//        mylist.insertAtTail(300);
//        mylist.printList();
//
//        mylist.insertAtPosition(1,22);
//        mylist.printList();
//
//        mylist.insertAtPosition(8,400);
//        mylist.printList();
//
//        mylist.insertAtPosition(5,500);
//        mylist.printList();
//
//         System.out.println("head data: " +mylist.getHead());
//         System.out.println("tail data:" +mylist.getTail());
//         System.out.println("Found or not: " +mylist.search(200));
//         System.out.println("Position of 200 is: " +mylist.findPosition(200));
//         mylist.updateAtPosition(19,1);
//         mylist.printList();
//         System.out.println("Updated or not : " +mylist.updateValue(500,5));
//         mylist.printList();
//
//         mylist.deleteHead();
//         mylist.printList();
//
//        mylist.deleteTail();
//        System.out.println("Size of LL: " +mylist.getSize());
//        mylist.printList();
//
//        mylist.deleteAtPosition(3);
//        mylist.printList();
//
//        mylist.deleteAtPosition(1);
//        mylist.printList();
//
//
//        mylist.deleteAtPosition(1);
//        mylist.printList();
//
//
//        mylist.deleteAtPosition(2);
//        mylist.printList();
//
//
//        mylist.deleteAtPosition(1);
//        mylist.printList();
//
//
//        mylist.deleteAtPosition(2);
//        mylist.printList();

        mylist.deleteValue(30);
        mylist.printList();

    }
}
