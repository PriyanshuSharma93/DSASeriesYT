//package AbstractDesign;
//
//import org.w3c.dom.ls.LSOutput;
//
//abstract class Bird{
//    abstract void fly();
//    abstract void eat();
//
//
//}
//
//class Sparrow extends  Bird{
//    @Override
//    void fly(){
//        System.out.println("Sparrow Flying");
//    }
//
//    @Override
//    void eat(){
//        System.out.println("Sparrow  eating");
//    }
//
//}
//
//class Crow extends  Bird{
//    @Override
//    void fly(){
//        System.out.println("crow Flying");
//    }
//
//    @Override
//    void eat(){
//        System.out.println("crow  eating");
//    }
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Bird b= new Sparrow();
//        b.eat();
//        b.fly();
//
//         b= new Crow();
//        b.eat();
//        b.fly();
//    }
//}



//interface
package AbstractDesign;


interface Bird{
    void fly();
    void eat();


}

class Sparrow implements  Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow Flying..");
    }

    @Override
   public void eat(){
        System.out.println("Sparrow  eating");
    }

}

class Crow implements   Bird{
    @Override
    public void fly(){
        System.out.println("crow Flying....  ");
    }

    @Override
    public void eat(){
        System.out.println("crow  eating");
    }

}

public class Main {
    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}
