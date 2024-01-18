package arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(originalArray));


        reverseArray(originalArray);

        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }


    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}
