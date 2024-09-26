import java.util.HashSet;
import java.util.Random;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            HashSet<Integer> hashSet = new HashSet<>();
            Random random = new Random();

            // Populate the HashSet
            for (int i = 0; i < size; i++) {
                hashSet.add(random.nextInt(size));
            }
            int target = random.nextInt(size); // A random value to search for

            // Read by index (Not applicable for HashSet)
            System.out.println("HashSet Read by Index (" + size + "): Not Applicable");

            // Read by Value (Search)
            long startTime = System.nanoTime();
            boolean found = hashSet.contains(target); // Read by value
            long endTime = System.nanoTime();
            System.out.println("HashSet Read by Value (" + size + "): " + (endTime - startTime) + " ns");

            // Insert in Head (Simulated as HashSet has no concept of head)
            startTime = System.nanoTime();
            hashSet.add(size + 1); // Insert arbitrary value
            endTime = System.nanoTime();
            System.out.println("HashSet Insert in Head (" + size + "): " + (endTime - startTime) + " ns");

            // Insert in Mid (Simulated as HashSet has no concept of mid)
            startTime = System.nanoTime();
            hashSet.add(size + 2); // Insert another arbitrary value
            endTime = System.nanoTime();
            System.out.println("HashSet Insert in Mid (" + size + "): " + (endTime - startTime) + " ns");

            // Insert in Tail (Simulated as HashSet has no concept of tail)
            startTime = System.nanoTime();
            hashSet.add(size + 3); // Insert another arbitrary value
            endTime = System.nanoTime();
            System.out.println("HashSet Insert in Tail (" + size + "): " + (endTime - startTime) + " ns");

            // Delete from Head (Simulated as HashSet has no concept of head)
            startTime = System.nanoTime();
            hashSet.remove(target); // Delete the random value
            endTime = System.nanoTime();
            System.out.println("HashSet Delete from Head (" + size + "): " + (endTime - startTime) + " ns");

            // Delete from Mid (Simulated as HashSet has no concept of mid)
            startTime = System.nanoTime();
            hashSet.remove(size + 1); // Delete previously inserted value
            endTime = System.nanoTime();
            System.out.println("HashSet Delete from Mid (" + size + "): " + (endTime - startTime) + " ns");

            // Delete from Tail (Simulated as HashSet has no concept of tail)
            startTime = System.nanoTime();
            hashSet.remove(size + 2); // Delete another previously inserted value
            endTime = System.nanoTime();
            System.out.println("HashSet Delete from Tail (" + size + "): " + (endTime - startTime) + " ns");
        }
    }
}
