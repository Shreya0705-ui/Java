import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        // 1. Insertion
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Mango");

        System.out.println("After Insertion: " + map);

        // 2. Deletion
        map.remove(1);
        System.out.println("After Deletion: " + map);

        // 3. Updation
        map.put(2, "Orange"); // replaces value
        System.out.println("After Updation: " + map);

        // 4. Searching
        if(map.containsKey(3)) {
            System.out.println("Key 3 Found");
        }

        // 5. Traversal
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}