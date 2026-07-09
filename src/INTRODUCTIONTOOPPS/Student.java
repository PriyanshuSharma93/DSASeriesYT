package INTRODUCTIONTOOPPS;

public class Student {
//    Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;


    public String  getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int a){
        this.age=a;
    }

//    default constructor
    public Student() {
        System.out.println("Students Default ctor Called");
    }
//    Parameterized constructor
   public Student(int id, int age,String name, int nos,String gf) {
      System.out.println("Students Parametrized ctor Called");
      this.id=id;
      this.age=age;
      this.name=name;
      this.nos=nos;
      this.gf=gf;
}
//copy constructor
    public Student(Student Sourceobj) {
        System.out.println("Students copy ctor Called");
        this.id=Sourceobj.id;
        this.age=Sourceobj.age;
        this.name=Sourceobj.name;
        this.nos=Sourceobj.nos;
    }

//    methods/Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunking");
    }

    private void gfchatting(){
        System.out.println(name + "Chatting");
    }
}
