package Basicsofjava;

public class ArraysProblems {
    public static double getAverage(int[] arr){
        double sum=0;
        for(int i: arr){
            sum+=i;
        }
        int size=arr.length;
        double avg=sum/size;
        return avg;
    }



    public static int[] multiplyBy10(int[] arr){
        int size=arr.length;
        int newArray[]=new int[size];

        for(int i=0;i<size;i++){
            int element=arr[i];
            int newElement=element*10;
            newArray[i]= newElement;
        }
        return newArray;
    }

//    linear Search
    public static boolean findTarget(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }


    public static int getMaximum(int arr[]){
        int maxi=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    public static int[] printPNSum(int[] arr){
        int positivenumber=0;
        int negativenumber=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positivenumber=positivenumber+arr[i];
            }
            else{
                negativenumber=negativenumber+arr[i];
            }
        }
        int ans[]={positivenumber,negativenumber};
        return ans;
    }


    public static int[] getZeroOneCount(int arr[]){
        int zerocount=0;
        int onecount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zerocount++;
            }
            else{
                onecount++;
            }
        }
        int ans[]={zerocount,onecount};
        return ans;
    }

    public static int getUnsortedElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }








    public static void main(String[] args) {
        int arr[]={1,2,5,4,9};
        System.out.println(getUnsortedElement(arr));
//        int arr[]={1,0,1,1,0,1,1};
//        int ans[]=getZeroOneCount(arr);
//        System.out.println("Zerocount: " + ans[0]);
//        System.out.println("Onecount: " + ans[1]);
////        int arr[]={2,-3,-5,-7,9};
//        int ans[]=printPNSum(arr);
//        System.out.println("positive sum : " + ans[0]);
//        System.out.println("negative sum : " + ans[1]);
//        int arr[]={3,5,8,7,9};
//        boolean ans=findTarget(arr,9);
//        System.out.println(ans);
//        int arr[]={1,3,5,99,7,9};
//        System.out.println(getMaximum(arr));
//        int[] arr={1,2,3,4,5};
//        int ans[]=multiplyBy10(arr);
//        System.out.println("printing ans array: ");
//        for(int i: ans){
//            System.out.println(i);
//        }
//        int[] arr={1,2,3,4};
//        System.out.println( getAverage(arr));
    }


}
