package Basicsofjava;

public class Methods {
     public static void print2katable (){
        for(int i=1;i<=10;i++){
            int ans=2*i;
            System.out.println("-> " +ans);
        }
    }
    public static void printsum(int x,int y){
        System.out.println("SUM :" + (x+y) );
    }
    public static void printmultiplication(int a,int b){
         int ans=a*b;
        System.out.println("Result :" + ans);
    }
    static int add(int p,int q){
         int sum=p+q;
        return sum;
     }
    static int add(int p,int q,int r){
         int ans=p+q+r;
         return ans;
    }
    public static void solve(int num){
        System.out.println("inside solve: " + num);
        num=num*10;
        System.out.println("inside solve: " + num);
    }
    static void printMultiples(){
         int value =20;
         for(int i=0;i<=10;i++){
             System.out.println(20*i);
         }
    }



    public static void main(String[] args) {
        printMultiples();
//         int num=5;
//        System.out.println("inside main :" + num);
//        solve(num);
//        System.out.println("inside main :" + num);
//         int ans1=add(1,2);
//         int ans2=add(1,2,3);
//        System.out.println("ans1:" + ans1);
//        System.out.println("ans2:" + ans2);
//         int result=add(10,20);
//        System.out.println("SUM is :" + result);
//         /printmultiplication(2,3);
//         printsum(5,10);
//        System.out.println("hi");
//        print2katable();
//        System.out.println("bye");
    }
}
