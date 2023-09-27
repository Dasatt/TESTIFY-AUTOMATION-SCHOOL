//Given a collection of 1 million integers, all ranging between1 to 9, sort them in Big O(n) time
public class Main {
    public static void main(String[] args) {
        NumberSort obj = new NumberSort();
        int[] input = obj.generateRandomData(10, 1, 9); // Generate 1 million random integers
        int[] sorted = obj.SortNumbers(input);

        // Print the sorted array
        for (int num : sorted) {
            System.out.print(num + " ");
        }

    }
}