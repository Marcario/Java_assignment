

public class ArrayNum {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8}; // Example array

        int sum = 0; // Variable to store the sum

        // Iterate over each element in the array and add it to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
