import java.util.ArrayList;
import java.util.Random;

public class TimeComplexityArrayList {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            Random random = new Random();
            
            // Populate the ArrayList
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(size));
            }
            int target = size / 2; // A value to search for
            
            // Measure Read by Index
            long startTime = System.nanoTime();
            int valueAtIndex = arrayList.get(size / 2); // Read by index
            long endTime = System.nanoTime();
            System.out.println("ArrayList Read by Index (" + size + "): " + (endTime - startTime) + " ns");
            
            // Measure Read by Value
            startTime = System.nanoTime();
            boolean found = arrayList.contains(target); // Read by value
            endTime = System.nanoTime();
            System.out.println("ArrayList Read by Value (" + size + "): " + (endTime - startTime) + " ns");
            
            // Measure Insert in Head
            startTime = System.nanoTime();
            arrayList.add(0, -1); // Insert in Head
            endTime = System.nanoTime();
            System.out.println("ArrayList Insert in Head (" + size + "): " + (endTime - startTime) + " ns");
            
            // Measure Insert in Mid
            startTime = System.nanoTime();
            arrayList.add(size / 2, -1); // Insert in Mid
            endTime = System.nanoTime();
            System.out.println("ArrayList Insert in Mid (" + size + "): " + (endTime - startTime) + " ns");
            
            // Measure Insert in Tail
            startTime = System.nanoTime();
            arrayList.add(-1); // Insert in Tail
            endTime = System.nanoTime();
            System.out.println("ArrayList Insert in Tail (" + size + "): " + (endTime - startTime) + " ns");
            
            // Measure Delete from Head
            startTime = System.nanoTime();
            arrayList.remove(0); // Delete from Head
            endTime = System.nanoTime();
            System.out.println("ArrayList Delete from Head (" + size + "): " + (endTime - startTime) + " ns");
            
            // Measure Delete from Mid
            startTime = System.nanoTime();
            arrayList.remove(size / 2); // Delete from Mid
            endTime = System.nanoTime();
            System.out.println("ArrayList Delete from Mid (" + size + "): " + (endTime - startTime) + " ns");
            
            // Measure Delete from Tail
            startTime = System.nanoTime();
            arrayList.remove(arrayList.size() - 1); // Delete from Tail
            endTime = System.nanoTime();
            System.out.println("ArrayList Delete from Tail (" + size + "): " + (endTime - startTime) + " ns");
        }
    }
}

