package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsequencesOfAString {
    public static void getAllSubsequences(String s, int index,StringBuilder output,List<String> ans){
//        base case
        if(index>=s.length()){
            String subsequences=output.toString();
            ans.add(subsequences);
            return;
        }
        char ch=s.charAt(index);
//        include
        output.append(ch);
        getAllSubsequences(s,index+1,output,ans);
//        exclude
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s,index+1,output,ans);
    }
    public List<String> power_set(String s){
        List<String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        int index=0;

        getAllSubsequences(s,index,output,ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        String s ="abc";
        SubsequencesOfAString obj = new SubsequencesOfAString();

        System.out.println(obj.power_set(s));

    }
}
