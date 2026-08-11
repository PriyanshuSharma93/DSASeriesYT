package LeetcodeProblems;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "My Name Is Priyanshu Sharma";
        ReverseWordsinaString obj = new ReverseWordsinaString();
        String ans = obj.reverseWords(s);
        System.out.println(ans);
    }
}