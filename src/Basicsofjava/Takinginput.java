package Basicsofjava;

import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
//        int a=2;
//        int b=3;
//        System.out.println(a+b);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter firstnum");
        int firstnum=sc.nextInt();
        System.out.println("Enter secondnum");
        int secondnum=sc.nextInt();

        int ans =firstnum+secondnum;
        System.out.println("Answer is: " +ans);

        System.out.println("Enter the value for flag:");
        boolean flag=sc.nextBoolean();
        System.out.println("Enter the value for shortval:");
        short shortval=sc.nextShort();
        System.out.println("Enter the value for floatvalue:");
        float flaotvalue=sc.nextFloat();

        System.out.println("flag is: " +flag);
        System.out.println("shortval is: " +shortval);
        System.out.println("floatvalue is: " +flaotvalue);

        sc.close();


    }
}
