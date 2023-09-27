public class NumberSort {
    public static int[] generateRandomData(int size, int min, int max) {
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return data;
    }

    public static int[] SortNumbers(int[] inputNumbers) {
        int[] counts = new int[10]; // 0-9 inclusive, for numbers 1-9
        int[] sortedArray = new int[inputNumbers.length];

        // Count the occurrences of each number
        for (int number : inputNumbers) {
            counts[number]++;
        }

        // Construct and arrange the sorted array
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            while (counts[i] > 0) {
                sortedArray[index++] = i;
                counts[i]--;
            }
        }

        return sortedArray;
    }
}
