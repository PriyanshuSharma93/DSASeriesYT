package Polymorphism;

public class Circle extends Shape {

    @Override
    public void draw(){
        System.out.println("circle drawing.....");
    }
    public void personal(){
        System.out.println("Personal method of circle....");
    }
}
