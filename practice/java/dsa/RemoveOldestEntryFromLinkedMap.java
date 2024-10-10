package practice.java.dsa;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveOldestEntryFromLinkedMap {

    public static void main(String[] args) throws IOException {
        int capacity = 3;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > capacity;
            }
        };

        map.put("One", "One");
        System.out.println(map);
        map.put("Two", "Two");
        System.out.println(map);
        map.put("Three", "Three");
        System.out.println(map);
        map.put("Four", "Four");
        System.out.println(map);
        map.put("Five", "Five");
        System.out.println(map);


    }
}
