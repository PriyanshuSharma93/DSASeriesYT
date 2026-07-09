package Basicsofjava;

public class Arrays {
  public static void main(String[] args) {
//      -------------2D ARRAY---------------
      int[][] arr; //initialisation
      arr= new int[3][4]; //allocation
//      init
//      int[][] brr={
//              {1,2},
//              {2,3},
//              {3,4},
//              {4,5}
//      };


//jagged array
      int[][] brr={
              {1,2},
              {2,3,4,5},
              {3,4,5,6,7,8},
              {4}
      };
//      System.out.println(brr[0][0]);
      int rowLength=brr.length;
//      int columnLength=brr[0].length;

      for(int row=0;row<=rowLength-1;row++){
          int columnLength=brr[row].length;
          for(int column=0;column<=columnLength-1;column++){
              System.out.print(brr[row][column] + " ");
          }
          System.out.println();
      }











//      ------------------------1D ARRAY-----------------
//        -----------maximum number---------
//      int arr[]={3,2,-5,21,10};
//      int maxvalue=arr[0];
//
//
//      for(int i=0;i<=arr.length-1;i++){
//          if(arr[i]>maxvalue){
//              maxvalue=arr[i];
//          }
//      }
//      System.out.println(maxvalue);


//---------------SUM----------------------
//        int arr[]=new int[5];
//        Scanner sc= new Scanner(System.in);
//        int sum=0;
//        int n=arr.length;
//        for(int i=0;i<=n-1;i++){
//            System.out.println("Provide input for index: " + i);
//            arr[i]=sc.nextInt();
//            sum=sum+arr[i];
//
//        }
//        System.out.println("Sum is :" + sum);

//
////        -----------------MULTILPICATION---------------------
////        int arr[]={2,3,4,5};
////        int n=arr.length;
////        int multiplication=1;
////        for(int i=0;i<=n-1;i++){
////            multiplication=multiplication*arr[i];
////        }
////        System.out.println("MULTIPLICATION IS: " + multiplication );
//
//
//
//
//
////        int arr[]=new int[5];
////        Scanner sc= new Scanner(System.in);
////        int n=arr.length;
////        for(int i=0;i<=n-1;i++){
////            System.out.println("Provide input for index: " + i);
////            arr[i]=sc.nextInt();
////        }
//// print
////        System.out.println("Your Array contains: ");
////        for(int val:arr){
////            System.out.println(val);
////        }
////        int arr[]; //declaration
////        arr=new int[5]; //allocation
////        int brr[]={10,20,30};//init
//////        System.out.println(brr[1]);
////
////        int n=brr.length;
////
////        for(int val:brr){
////            System.out.println(val);
////        for(int index=0;index<=n-1;index++){
////            System.out.println(brr[index]);
////        }
//
    }
}
