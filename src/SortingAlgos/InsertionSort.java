package SortingAlgos;

public class InsertionSort {
    public static void insertionsort(int arr[]){

        int n=arr.length;
        for(int i=0;i<n;i++){
           int  curr=i;
           int prev=i-1;
           int currValue=arr[i];

           while(prev>=0 && currValue<arr[prev]){
              arr[prev+1]=arr[prev];
              prev--;
           }
            arr[prev+1]=currValue;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,2,8,4};
        insertionsort(arr);
        System.out.println("Printing the Array: ");
        for(int value:arr){
            System.out.print(value + " " );
        }
    }
}
