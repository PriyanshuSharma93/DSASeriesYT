    package Recursion;

    import java.util.ArrayList;
    import java.util.List;

    public class Phone_Number {
        public static void solve(String digits,int index,String[] mapping,
                                 List<String> result,StringBuilder output){
            if(index>=digits.length()){
                result.add(output.toString());
                return;
            }
            int value=digits.charAt(index)-'0';
            String mappedString=mapping[value];
            for(int i=0;i<mappedString.length();i++){
                output.append(mappedString.charAt(i));
                solve(digits,index+1,mapping,result,output);
                output.deleteCharAt(output.length()-1);
            }
        }
        public List<String>  letterCombinations(String digits) {
            String[] mapping={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            List<String> result = new ArrayList<>();
            int index=0;
            StringBuilder output=new StringBuilder();
            solve(digits,index,mapping,result,output);  
            return result;
        }
        public static void main(String[] args){
            String digits="23";
            Phone_Number obj = new Phone_Number();
            List<String> ans=obj.letterCombinations(digits);
            System.out.println(ans);

        }
    }

