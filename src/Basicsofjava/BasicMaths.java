package Basicsofjava;

public class BasicMaths {
    static void printdigit(int num){
        while(num!=0){
            int count=0;
            int digit=num%10;
            System.out.println(digit);
            num=num/10;

        }
    }

    static int countdigit(int num){
        int count=0;
        while(num!=0){
            int digit=num%10;
            count++;

            num=num/10;

        }
        return count;
    }


    static int  sumofdigit(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;

        }
        return sum;
    }

//    ======REVERSE OF  A NUMBER=========

    static int ReverseOfaNumber(int num){
        int revNum=0;
        while(num!=0){
            int digit=num%10;
            revNum=revNum*10+digit;
            num=num/10;
        }
       return revNum;
    }

//    ===========PALLINDROME NUMBER==========

    static boolean isPallindrome(int num){
        int originalNum=num;
        int reversedNum = ReverseOfaNumber(num);
        if(originalNum==reversedNum){
            System.out.println("It is a Pallindrome Number ");
            return true;
        }
        else{
            System.out.println("It is not a pallindrome number");
        }
        return false;
    }


//    ==========GCD/HCF of a number============

    static int GetGCD(int a, int b){
//        gcd(a,b)=gcd(b,a%b);
        while(b!=0){
            int oldvalueofb=b;
            b=a%b;
            a=oldvalueofb;
        }
        int ans=a;
        return ans;
    }

//    =============LCM of a Number==========

    public static int getLCM(int a ,int b){
        int gcd=GetGCD(a,b);
        int prod=a*b;
        int lcm=prod/gcd;
        return lcm;
    }

//========ARMSTRONG NUMBER==========================
    public static boolean armstrng(int n){
        int sum=0;
        int originalnumber=n;

        while(n!=0){
            int digit=n%10;
            int ans=digit*digit*digit;
            sum=sum+ans;

            n=n/10;
        }
        if(sum==originalnumber){
            return true;
        } else {
            return false;
        }
    }


//    ===========PERFECT NUMBER============
public static boolean checkperfectnumber(int num){
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                int firstFactor=i;
                int seconffactor=num/i;
                sum=sum+firstFactor+seconffactor;
            }
        }
        if(sum==num){
            return true;

        }else {
            return false;
        }
}

    public static void main(String[] args) {
        System.out.println(checkperfectnumber(6));
//        System.out.println(armstrng(155));
//        System.out.println(getLCM(18,12));
//        System.out.println(GetGCD(2,3));
//        boolean ans=isPallindrome(1221);
//        System.out.println(ans);
//        int num=53217;
//        int revNum=ReverseOfaNumber(num);
//        System.out.println(revNum);
//        int sum=sumofdigit(num);
//        System.out.println(sum);
//        int ans=countdigit(num);
//        System.out.println(ans);
//        printdigit(num);

    }
}
