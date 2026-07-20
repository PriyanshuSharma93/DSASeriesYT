package SortingAlgos;

public class SelectionSort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,9,5,8,2};
        selectionsort(arr);
        System.out.println("Printing the Array: ");
        for(int value:arr){
            System.out.print(value + " " );
        }
    }
}
