import java.util.LinkedList;
import java.util.Random;

public class TimeComplexityLinkedList {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            Random random = new Random();

            // Populate the LinkedList
            for (int i = 0; i < size; i++) {
                linkedList.add(random.nextInt(size));
            }
            int target = size / 2; // A value to search for

            // Measure Read by Index
            long startTime = System.nanoTime();
            int valueAtIndex = linkedList.get(size / 2); // Read by index
            long endTime = System.nanoTime();
            System.out.println("LinkedList Read by Index (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Read by Value
            startTime = System.nanoTime();
            boolean found = linkedList.contains(target); // Read by value
            endTime = System.nanoTime();
            System.out.println("LinkedList Read by Value (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Insert in Head
            startTime = System.nanoTime();
            linkedList.addFirst(-1); // Insert in Head
            endTime = System.nanoTime();
            System.out.println("LinkedList Insert in Head (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Insert in Mid
            startTime = System.nanoTime();
            linkedList.add(size / 2, -1); // Insert in Mid
            endTime = System.nanoTime();
            System.out.println("LinkedList Insert in Mid (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Insert in Tail
            startTime = System.nanoTime();
            linkedList.add(-1); // Insert in Tail
            endTime = System.nanoTime();
            System.out.println("LinkedList Insert in Tail (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Delete from Head
            startTime = System.nanoTime();
            linkedList.removeFirst(); // Delete from Head
            endTime = System.nanoTime();
            System.out.println("LinkedList Delete from Head (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Delete from Mid
            startTime = System.nanoTime();
            linkedList.remove(size / 2); // Delete from Mid
            endTime = System.nanoTime();
            System.out.println("LinkedList Delete from Mid (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Delete from Tail
            startTime = System.nanoTime();
            linkedList.remove(linkedList.size() - 1); // Delete from Tail
            endTime = System.nanoTime();
            System.out.println("LinkedList Delete from Tail (" + size + "): " + (endTime - startTime) + " ns");
        }
    }
}