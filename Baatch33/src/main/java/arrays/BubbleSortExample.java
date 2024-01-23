package arrays;
import java.util.Arrays;


public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 6, 3};

        System.out.println("Original Array: " + Arrays.toString(numbers));


        bubbleSort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;


            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }


            if (!swapped) {
                break;
            }
        }
    }
}
