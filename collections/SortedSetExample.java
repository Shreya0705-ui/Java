import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Insertion
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println("After Insertion: " + set);

        // Deletion
        set.remove(20);
        System.out.println("After Deletion: " + set);

        // Searching
        if(set.contains(40)) {
            System.out.println("40 Found");
        }

        // Traversal
        for(int num : set) {
            System.out.println(num);
        }
    }
}