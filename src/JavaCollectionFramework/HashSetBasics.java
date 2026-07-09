package JavaCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1= new Student(1,"Priyanshu");
        Student s2= new Student(1,"Priyanshu");
        Student s3= new Student(1,"Priyanshu");
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);




//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1);
//        System.out.println(set2);
//
//
//        System.out.println(set1.containsAll(set2));

//        Set<Integer> st= new LinkedHashSet<>();
//        Set<Integer> st= new TreeSet<>();
//        st.add(40);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        st.add(30);
//
//        System.out.println(st);

    }
}
