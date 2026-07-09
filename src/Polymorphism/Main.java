package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Calculator c=new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3,4));
//        System.out.println(c.add(2,3,4,5.0));

//        Runtime Polymorphism
//        Circle c= new Circle();
//        doDrawingstuff(c);
//
//        Rect r =  new Rect();
//        doDrawingstuff(r);
//
//        Shape s = new Shape();
//        doDrawingstuff(s);

        //downcasting
        Circle c= new Circle();
        doDrawingstuff(c);

//        Rect r = new Rect();
//        doDrawingstuff(r);
    }
    public static void doDrawingstuff(Shape s) {
        s.draw();
        Circle  c= new Circle();
        c.personal();
    }
}
