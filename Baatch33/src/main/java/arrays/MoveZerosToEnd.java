package arrays;

import java.util.Arrays;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 0, 3, 0, 8, 0, 2};

        System.out.println("Original Array: " + Arrays.toString(numbers));


        moveZerosToEnd(numbers);

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(numbers));
    }


    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }


        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
