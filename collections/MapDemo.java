import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // 1. Insertion
        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Banana");

        System.out.println("After Insertion: " + map);

        // 2. Deletion
        map.remove(2);
        System.out.println("After Deletion: " + map);

        // 3. Updation
        map.put(3, "Orange"); // replaces value
        System.out.println("After Updation: " + map);

        // 4. Searching
        if(map.containsKey(1)) {
            System.out.println("Key 1 Found");
        }

        System.out.println("Value of key 3: " + map.get(3));

        // 5. Traversal
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}