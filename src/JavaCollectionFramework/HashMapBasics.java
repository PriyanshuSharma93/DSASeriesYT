package JavaCollectionFramework;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String,String> mp=new HashMap<>();

        mp.put("in","India");
        mp.put("en","England");
        mp.put("us","United State");

        System.out.println(mp);

        Map<String,String> table = new HashMap<>();
        table.put("br","brazil");

        System.out.println("Before:" + table);
        table.putAll(mp);
        System.out.println("After" + table);

        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));
        System.out.println(table.getOrDefault("usa","NONE"));

        System.out.println(table.containsKey("im"));
        System.out.println(table.containsValue("United State Of America"));

        System.out.println(table);

        table.replace("in","indonesia");
        System.out.println(table);

        Set<String> keyset=table.keySet();
        System.out.println(keyset);

        Collection<String> valueSet= table.values();
        System.out.println(valueSet);

        // get all entries from map
        Set<Map.Entry<String,String>> entryset=table.entrySet();
        System.out.println("Printing entries:" + entryset);















//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());



    }
}
