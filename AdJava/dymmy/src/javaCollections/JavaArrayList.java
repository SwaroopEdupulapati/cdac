package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaArrayList {

    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<Integer> a = new ArrayList<>();

        // 2. Add elements
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println("Original List: " + a);

        // 3. Add element at specific index
        a.add(1, 15);
        System.out.println("After add(index, value): " + a);

        // 4. Add another collection
        ArrayList<Integer> b = new ArrayList<>();
        b.add(50);
        b.add(60);

        a.addAll(b);
        System.out.println("After addAll(): " + a);

        // 5. Add another collection at specific index
        ArrayList<Integer> c = new ArrayList<>();
        c.add(70);
        c.add(80);

        a.addAll(2, c);
        System.out.println("After addAll(index, collection): " + a);

        // 6. Get element
        System.out.println("Element at index 2: " + a.get(2));

        // 7. Get first element
        System.out.println("First element: " + a.get(0));

        // 8. Get last element
        System.out.println("Last element: " + a.get(a.size() - 1));

        // 9. Update element
        a.set(0, 100);
        System.out.println("After set(): " + a);

        // 10. Size
        System.out.println("Size: " + a.size());

        // 11. Check element
        System.out.println("Contains 30: " + a.contains(30));
        System.out.println("Contains 500: " + a.contains(500));

        // 12. Check empty
        System.out.println("Is Empty: " + a.isEmpty());

        // 13. Find index
        System.out.println("Index of 30: " + a.indexOf(30));

        // 14. Find last index
        a.add(30);
        System.out.println("Last index of 30: " + a.lastIndexOf(30));

        // 15. Remove by INDEX
        a.remove(0);
        System.out.println("After remove(index): " + a);

        // 16. Remove by VALUE
        a.remove(Integer.valueOf(30));
        System.out.println("After remove(value): " + a);

        // 17. Remove all elements from another collection
        a.removeAll(b);
        System.out.println("After removeAll(): " + a);

        // 18. Check whether collection contains all elements
        System.out.println("Contains all c: " + a.containsAll(c));

        // 19. Sort ascending
        Collections.sort(a);
        System.out.println("Ascending order: " + a);

        // 20. Sort descending
        Collections.sort(a, Collections.reverseOrder());
        System.out.println("Descending order: " + a);

        // 21. Reverse list
        Collections.reverse(a);
        System.out.println("After reverse(): " + a);

        // 22. Find minimum
        System.out.println("Minimum: " + Collections.min(a));

        // 23. Find maximum
        System.out.println("Maximum: " + Collections.max(a));

        // 24. Iterate using normal for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        // 25. Iterate using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (Integer value : a) {
            System.out.println(value);
        }

        // 26. Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> itr = a.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 27. Convert ArrayList to Object array
        Object[] arr = a.toArray();

        System.out.println("Array elements:");
        for (Object value : arr) {
            System.out.println(value);
        }

        // 28. Clone ArrayList
        ArrayList<Integer> copy = (ArrayList<Integer>) a.clone();
        System.out.println("Cloned List: " + copy);

        // 29. Check equality
        System.out.println("Is a equal to copy: " + a.equals(copy));

        // 30. Remove all elements
        a.clear();
        System.out.println("After clear(): " + a);

        // 31. Check empty after clear
        System.out.println("Is Empty: " + a.isEmpty());
    }
}
