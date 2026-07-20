package SortingAlgos;

public class BubbleSort {
    public static void bubblesort(int arr[]){
        int n=arr.length;
       for(int i=0;i<n-1;i++){
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
    }
    public static void main(String[] args) {
        int arr[]={6,5,1,3};
        bubblesort(arr);
        System.out.println("Printing the Array: ");
        for(int value:arr){
            System.out.print(value + " " );
        }
    }
}
