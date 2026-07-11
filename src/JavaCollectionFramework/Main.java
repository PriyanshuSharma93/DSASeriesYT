package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] arr ={5,1,7,2,8,4};
        Arrays.sort(arr,new ReverseCmp());
        for(int a:arr){
            System.out.println(a);
        }

//        List<Students> students=new ArrayList<>();
//        students.add(new Students(19,"Priyanshu",68));
//        students.add(new Students(20,"Dev",68));
//        students.add(new Students(20,"Aditya",68));
//        students.add(new Students(23,"Himank",68));
//
//
//        System.out.println(students);


//        Collections.sort(students,new WeightComparator());

//        Collections.sort(students,(o1,o2)->o1.weight-o2.weight);
//        System.out.println(students);
    }
//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);
//    }
}
