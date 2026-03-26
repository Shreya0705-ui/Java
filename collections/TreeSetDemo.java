import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // 1. Insertion
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println("After Insertion: " + set);

        // 2. Deletion
        set.remove(20);
        System.out.println("After Deletion: " + set);

        // 3. Updation (Not Direct)
        set.remove(30);
        set.add(40);
        System.out.println("After Updation: " + set);

        // 4. Searching
        if(set.contains(10)) {
            System.out.println("10 Found");
        }

        // 5. Traversal
        for(int num : set) {
            System.out.println(num);
        }
    }
}