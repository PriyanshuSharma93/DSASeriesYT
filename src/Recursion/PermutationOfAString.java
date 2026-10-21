
package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationOfAString {

    public static void solve(String s, String output,
                             ArrayList<String> ans) {

        if (s.isEmpty()) {
            ans.add(output);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            String remString = s.substring(0, i)
                    + s.substring(i + 1);

            solve(remString, output + ch, ans);
        }
    }

    public static ArrayList<String> permutation(String s) {
        ArrayList<String> ans = new ArrayList<>();

        solve(s, "", ans);

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        String s = "ABC";

        ArrayList<String> ans = PermutationOfAString.permutation(s);

        System.out.println(ans);
    }
}
