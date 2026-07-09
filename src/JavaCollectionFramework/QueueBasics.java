package JavaCollectionFramework;

import java.util.ArrayDeque;
import  java.util.Queue;
import java.util.LinkedList;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);
//        Add()---->I don't use add() here because if the task is successfull ,add() returns true , if not  it throws an excetpion
//        offer()----> use because if task is successfull , offer() returns true,if not it returns false.
//        add() and offer() both is used to add element in queue.

//        same is in the element() and poll().


        System.out.println("Removing :" +q.poll());
        System.out.println(q);

        System.out.println("peek element:" + q.peek());
    }
}
