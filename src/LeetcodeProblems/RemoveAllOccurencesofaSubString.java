package LeetcodeProblems;

public class RemoveAllOccurencesofaSubString {
        public static void main(String[] args) {
            String str = "hello hello world hello";
            String sub = "hello";

            String result = str.replace(sub, "");
            System.out.println(result);
        }
}
