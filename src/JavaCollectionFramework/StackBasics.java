package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasics {
    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);

        st.pop();
        System.out.println(st);
    }
}
