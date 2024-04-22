package day10.sort;

public class BubbleSort {
    //outer of loop : set range for compare object
        public static void sort(int[] arr) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    // if the element at index j is greater than the element at index j+1, swap them
                    if (arr[j] > arr[j + 1]) {
                        // Swap elements without using a separate swap method
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] numbers = {33, 2, -23, 5, -2};
            sort(numbers);

            // Print the sorted array
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }