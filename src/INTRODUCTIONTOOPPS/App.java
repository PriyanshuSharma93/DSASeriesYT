package INTRODUCTIONTOOPPS;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello world!!!");
//    Student A= new Student();
//    A.id=1;
//    A.age=14;
//    A.name="Ranu";
//    A.nos=5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();
//        Parametrized ctor
//        Student A= new Student(1,12,"priyanshu",3);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

//        Student B=new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.sleep();

//        Encapsulation
         Student A= new Student(1,12,"Priyanshu",3, "Divya");
//        System.out.println(A.getName());
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
        //System.out.println(A.gf);

        System.out.println(A.getAge());
        A.setAge(67);
        System.out.println(A.getAge());

        A.bunk();
        A.study();
        A.sleep();
        //A.gfchatting();

     }

}
