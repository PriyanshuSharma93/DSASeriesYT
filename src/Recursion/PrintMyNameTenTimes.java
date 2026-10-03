package Recursion;




public class PrintMyNameTenTimes {

//    public static void printmyName(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println("Priyanshu");
//        printmyName(n-1);
//    }
//    public static void main(String args[]) {
//        printmyName(10);
//    }

//    public static void print1ToN(int n, int count){
//        if(count>n){
//            return ;
//        }
//        System.out.println(count); // if want to print reverse then move this line to next to next
//
//        print1ToN(n,count+1);
//    }

//        public static void print_Array(int arr[],int i){
//            if(i>=arr.length){
//                return;
//            }
//            System.out.println(arr[i]);
//            print_Array(arr,i+1);
//        }

//    public static void max_array(int arr[], int i, int maxi) {
//        if (i >= arr.length) {
//            System.out.println("Max Value:" + maxi);
//            return;
//        }
//        if (arr[i] >= maxi) {
//            maxi = arr[i];
//        }
//        max_array(arr, i + 1, maxi);
//    }

//    public static void min_array(int arr[], int i, int mini) {
//        if (i >= arr.length) {
//            System.out.println("Min Value:" + mini);
//            return;
//        }
//        if (arr[i] < mini) {
//            mini = arr[i];
//        }
//        min_array(arr, i + 1, mini);
//    }


//    public static int find_Target(int arr[],int i,int target){
//        if(i>=arr.length){
//            return -1;
//        }
//        if(arr[i]==target)
//
//        return i;
//       int  ans=find_Target(arr,i+1,target);
//        return ans;
//    }

//    public static void count_target(int arr[],int i,int target,int count){
//        if(i>=arr.length){
//            System.out.println("Count:" + count);
//            return ;
//        }
//        if(arr[i]==target){
//            count++;
//        }
//        count_target(arr, i+1, target, count);
//    }

    public static void print_digits_by_recursion(int num){
        if(num==0){
            return;
        }
        int digit=num%10;

        num=num/10;

        print_digits_by_recursion(num);
        System.out.println(digit);

    }
    public static void main(String[] args) {
//        int arr[] = {10, 10, 10, 40, 10};
//        int i = 0;
//        int maxi = Integer.MIN_VALUE;
//        int mini = Integer.MAX_VALUE;
//        min_array(arr, i, mini);
//        int target=40;
//        int ans= find_Target(arr,i,target);
//        int count=0;
//        int target=10;
        print_digits_by_recursion(137);
//        count_target(arr,i,target,count);
//        System.out.println("Found at index:" +ans);
    }
}
