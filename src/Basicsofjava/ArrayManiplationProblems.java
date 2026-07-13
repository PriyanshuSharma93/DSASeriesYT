package Basicsofjava;



//============ 1.Reverse An Array=============================

import java.util.HashMap;

public class ArrayManiplationProblems {
    public static void  reverseArray(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<=j){
//            swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
             i++;
             j--;
        }
        for(int k:arr){
            System.out.print(" " + k);
        }
    }

//===============2.Shift array elements by 1 position=================================

       static void shiftBy1(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
       }


//===================3.Print Extreme Elements in an alternative manner==========================
    public static void printAlternate(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }
//================4.Mode of an Array===========================================

     public static int getMode(int arr[]) {
         HashMap<Integer, Integer> freq = new HashMap<>();

         for (int num : arr) {
             freq.put(num, freq.getOrDefault(num, 0) + 1);
         }
//         for(int i:freq.keySet()){
//             System.out.println(i +" -> " + freq.get(i));
//         }


         int maxfreq = -1;
         int maxFreqWalikey = -1;


         for (int key : freq.keySet()) {
             int currentKey = key;
             int currentKeyKiFrequency = freq.get(key);
             if (currentKeyKiFrequency > maxfreq) {
                 maxfreq = currentKeyKiFrequency;
                 maxFreqWalikey = currentKey;
             }
         }
         return maxFreqWalikey;

     }

//==============5.highest nad lowest frequency===========================================

    public static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum=-1;
        for(int key:freq.keySet()){
            int currentkey=key;
            int currentfreq=freq.get(key);
            if(currentfreq>highestFreq){
                highestFreq=currentfreq;
                highestNum=currentkey;
            }
        }
        int lowestFreq=Integer.MAX_VALUE;
        int lowestNum=-1;
        for(int key:freq.keySet()){
            int currentKey=key;
            int currentFreq=freq.get(key);
            if(currentFreq<lowestFreq){
                lowestFreq=currentFreq;;
                lowestNum=currentKey;
            }
        }
        int ans[] ={highestNum,lowestNum};
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,5,5,5,5,5,5};
        int ans[]=getHighestLowestFreqElement(arr);
        System.out.println("highest freq wala  num -> " +ans[0]);
        System.out.println("lowest freq wala num -> " +ans[1]);
//        int ans =getMode(arr);
//        System.out.println(ans);
//      int arr[]={1,2,3,4,5};
//      printAlternate(arr);
      // reverseArray(arr);
//      shiftBy1(arr);
//      for(int a:arr){
//          System.out.println(a + " ");
//      }
//
//        System.out.println();
    }
}
