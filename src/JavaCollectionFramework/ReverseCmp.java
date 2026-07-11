package JavaCollectionFramework;

import java.util.Comparator;

public class ReverseCmp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0- Integer.compare(o1,o2);
    }
}
