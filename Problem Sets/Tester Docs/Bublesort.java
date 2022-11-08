import java.util.*;
public class Bublesort {
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if(i == arr.length-4)
                break;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 18, 4, 24, 33, 40, 8, 3, 12};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
