package Arrays;

public class SelectionSort {
    public static void main(String[] args) {

                int[] arr = {64, 25, 12, 22, 11};

                // Selection Sort
                for (int i = 0; i < arr.length - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] < arr[minIndex]) {
                            minIndex = j;
                        }
                    }
                    // Swap
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }

                // Print sorted array
                System.out.print("Sorted array: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

