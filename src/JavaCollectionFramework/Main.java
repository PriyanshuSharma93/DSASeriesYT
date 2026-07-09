package JavaCollectionFramework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // List or collection--->interface

        //ArrayList -----> concrete class

//        List<Integer> list= new LinkedList<>();


        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//        //remove
//        list.remove(0);
//        System.out.println(list);
//
//        //addAll
//        List<Integer> list2=new LinkedList<>();
//        list2.add(101);
//        list2.add(102);
//
//        list.addAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        System.out.println("Printing list 2: " + list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("Element : " + iterator.next());
//        }
//
//
//        List<Integer> list3= new ArrayList<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(13);
//        list3.add(14);
//        System.out.println(list3.get(2));
//
//        System.out.println("before set:"+list3);
//        list3.set(0,100);
//        System.out.println("after set:" +list3);
//
//        //toArray
//        Object[] arr=list3.toArray();
//        for(Object obj:arr){
//            System.out.println(obj);
//        }
//
////        contains
//        System.out.println(list3.contains(10009));
//
//        list.add(12);
//        list.add(6);
//        System.out.println("Printing Entire list: " +list);
//
//        //sort an array
//        Collections.sort(list);
//        System.out.println("Printing Entire List in Ascending order: " +list);
//
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println("Revesre Order List: " +list);
//
////        LinkedList<Integer> newlist = (LinkedList<Integer>) list.clone();
////        System.out.println("Printing Entire newlist :" +newlist);
//
//        ArrayList<Integer> marks=new ArrayList<>();
//        marks.ensureCapacity(100);
//        System.out.println(marks.isEmpty());
//
//
//        list.add(30);
//        list.add(40);
//        list.add(30);
//        System.out.println("Printing Original List:" +list);
//        System.out.println(list.indexOf(40));
//        System.out.println(list.lastIndexOf(30));
//
//
//        //add first and add last
//        System.out.println("Printing Original List:" +list);
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        System.out.println("Printing Original List:" +list);
//
//
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(10);
//        System.out.println(ll);
//        ll.addFirst(1);
//        System.out.println(ll);
//        ll.addLast(101);
//        System.out.println(ll);
//
////        ll.removeFirst();
////        System.out.println(ll);
////
////        ll.removeLast();
////        System.out.println(ll);
//
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        System.out.println(ll.peek());
//        System.out.println("before:" + ll);
//        System.out.println("Polling:" +ll.poll());
//        System.out.println("after : " + ll);

        Stack<Integer> st = new Stack();
        st.push(10);
        System.out.println(st);

        st.push(20);
        System.out.println(st);

        st.push(30);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(20));

        System.out.println(st.empty());


    }

}
