package Recursion;

public class FactorialOfaNumber {
    public static long factorial(int num){
       if(num==0) {
           return 1;
       }


       long ans=num*factorial(num-1);

        return ans;
    }
    public static void main(String[] args) {

        long ans=factorial(5);
        System.out.println(ans);

    }
}
