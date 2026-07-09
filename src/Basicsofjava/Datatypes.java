package Basicsofjava;

public class Datatypes
{
    public static void main(String[] args) {

        long value1=123456789;
        int value2=(int)value1;
        System.out.println(value2); //explicit type casting
        //Numeric data-type----short,byte,int,long
        byte num1=127;
        long newNum=num1;

        System.out.println("new Num:"+newNum); //implicit conversion
        System.out.println(num1);
        short num2=32767;
        System.out.println(num2);
        int num3=50000;
        long num4=432567893;
        System.out.println(num3);
        System.out.println(num4);

        //floating file
        float num5=1.24f;
        System.out.println(num5);

        double num6=987654324567890f;
        System.out.println(num6);

        //boolean
        boolean elligibletovote=true;
        System.out.println(elligibletovote);

        char firstCharacter='a';
        System.out.println("My first character is  :" +(char)firstCharacter);
    }
}
