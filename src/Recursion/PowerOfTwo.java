package Recursion;

public class PowerOfTwo {
    public static int power_of_two(int num){
        if(num==0){
            return 1;
        }

        int ans=2*power_of_two(num-1);
        return ans;
    }
    public static void main(String[] args) {
        int ans =power_of_two(5);
        System.out.println(ans);
    }
}
