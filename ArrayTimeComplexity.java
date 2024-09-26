import java.util.Random;

public class ArrayTimeComplexity {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            int[] array = new int[size];
            Random random = new Random();

            // Populate the array
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size);
            }
            int target = size / 2; // A value to search for

            // Measure Read by Index
            long startTime = System.nanoTime();
            int valueAtIndex = array[size / 2]; // Read by index
            long endTime = System.nanoTime();
            System.out.println("Array Read by Index (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Read by Value
            startTime = System.nanoTime();
            boolean found = false;
            for (int value : array) {
                if (value == target) {
                    found = true;
                    break;
                }
            }
            endTime = System.nanoTime();
            System.out.println("Array Read by Value (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Insert in Head
            startTime = System.nanoTime();
            int[] newArray = new int[size + 1];
            newArray[0] = -1; // Insert in Head
            System.arraycopy(array, 0, newArray, 1, size);
            endTime = System.nanoTime();
            System.out.println("Array Insert in Head (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Insert in Mid
            startTime = System.nanoTime();
            newArray = new int[size + 1];
            System.arraycopy(array, 0, newArray, 0, size / 2);
            newArray[size / 2] = -1; // Insert in Mid
            System.arraycopy(array, size / 2, newArray, size / 2 + 1, size - size / 2);
            endTime = System.nanoTime();
            System.out.println("Array Insert in Mid (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Insert in Tail
            startTime = System.nanoTime();
            newArray = new int[size + 1];
            System.arraycopy(array, 0, newArray, 0, size);
            newArray[size] = -1; // Insert in Tail
            endTime = System.nanoTime();
            System.out.println("Array Insert in Tail (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Delete from Head
            startTime = System.nanoTime();
            newArray = new int[size - 1];
            System.arraycopy(array, 1, newArray, 0, size - 1); // Delete from Head
            endTime = System.nanoTime();
            System.out.println("Array Delete from Head (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Delete from Mid
            startTime = System.nanoTime();
            newArray = new int[size - 1];
            System.arraycopy(array, 0, newArray, 0, size / 2); // Before mid
            System.arraycopy(array, size / 2 + 1, newArray, size / 2, size - size / 2 - 1); // After mid
            endTime = System.nanoTime();
            System.out.println("Array Delete from Mid (" + size + "): " + (endTime - startTime) + " ns");

            // Measure Delete from Tail
            startTime = System.nanoTime();
            newArray = new int[size - 1];
            System.arraycopy(array, 0, newArray, 0, size - 1); // Delete from Tail
            endTime = System.nanoTime();
            System.out.println("Array Delete from Tail (" + size + "): " + (endTime - startTime) + " ns");
        }
    }
}
