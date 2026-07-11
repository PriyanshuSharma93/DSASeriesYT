package Basicsofjava;

public class BitwiseOpeator {
    public static void main(String[] args) {

//        int a=5;
//        int b=6;
//
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(a^b);
//        System.out.println(~a);
//        System.out.println(a<<b);
//        System.out.println(a>>b);
//
//        int n=100;
//        for(int i=0;i<=10;i++){
//            n=n>>1;
//            System.out.println(n);
//            System.out.println();

        int n=786 ;
        int count=0;
        while (n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Set Bit Count : " + count);
    }
}
