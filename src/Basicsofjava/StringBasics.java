package Basicsofjava;


public class StringBasics {
    //        =======QUESTIONS PRACTICE============

    //        1.---------Print each character of the string -------------
    public static void printString(String str){
        int n= str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            System.out.println(ch);
        }

    }

    //    ----------2.count length of String without length()-----------

    static int getLengthOfString(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

//    ------------3.count vowels in a string------------
   public  static int getvowelscount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }

//----------4.Reverse a String--------------
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }
//    ----------5. String is Pallindrome or not ---------------
          static boolean isPallindrome(String str)
          {
              String original=str;
              String reverse =reverseString(original);
              for(int i=0;i<original.length();i++){
                  char ch1=original.charAt(i);
                  char ch2= reverse.charAt(i);
                      if(ch1!=ch2){
                          return false;
                      }
                  }

              return true;
          }
   public static void main(String[] args) {
        String str="PrrrrP";
//        printString(str);
//       System.out.println(getLengthOfString(str));
//       System.out.println(getvowelscount(str));
//       System.out.println(reverseString(str));
       System.out.println(isPallindrome(str));






//        String str=" ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        String name="   Priyanshu   ";
//        System.out.println(name.length());
//        name=name.trim();
//        System.out.println(name.length());
//        String name="priyanshu";
//        System.out.println(name.toUpperCase());
//        String str="PRIYANSHU";
//        System.out.println(name.toLowerCase());
//        String str="My name is Priyanshu sharma ";
//        System.out.println(str.substring(6,10));
//        System.out.println(str.contains("Priyanshu"));



//        String str="Priyanshu";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        String name="PRIYANSHU";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));


//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Provide the String Content: ");
//        String str1= sc.nextLine();
//        System.out.println("value of nextLine:" + str1);
//        System.out.println("Provide the String Content: ");
//        String str2= sc.next();
//        System.out.println("value of next :" + str2);


//        String name1="Priyanshu";
//        String name2="Priyanshu";
//
//        if(name1.equalsIgnoreCase(name2)){
//            System.out.println("Both Strings are equal");
//        } else{
//            System.out.println("Both Strings are not eqaul");
//        }

//        String firstname="Priyanshu";
//        String lastname="Sharma";
//        System.out.print(firstname);
//        System.out.println(" " +  lastname);
//        System.out.println(firstname.length());
//        System.out.println(firstname.charAt(0));

//        String name="Priyanshu";
//        name ="sharma";
//
//        System.out.println(name);



    }
}
