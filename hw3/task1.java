package hw3;
// Реализовать алгоритм сортировки слиянием
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr = { 32, 3, 2, 1, 5, 4, 6 };
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return;
        }

        int midlleArray = len / 2;
        int[] arrLeft = new int[midlleArray];
        int[] arrRight = new int[len - midlleArray];

        for (int i = 0; i < midlleArray; i++) {
            arrLeft[i] = arr[i];
        }
        for (int j = 0; j < len - midlleArray; j++) {
            arrRight[j] = arr[j + midlleArray];
        }
        mergeSort(arrLeft);
        mergeSort(arrRight);
        merge(arr, arrLeft, arrRight);
    }

    

    private static void merge(int[] arr, int[] arrLeft, int[] arrRight) {
        int left = arrLeft.length;
        int right = arrRight.length;
        int l = 0;
        int r = 0;
        int ar = 0;
        while (l < left && r < right) {
            if (arrLeft[l] < arrRight[r]) {
                arr[ar] = arrLeft[l];
                l++;
                ar++;
            } else {
                arr[ar] = arrRight[r];
                r++;
                ar++;
            }
        }
        for (int i = l; i < left; i++) {
            arr[ar++] = arrLeft[i];
        }
        for (int i = r; i < right; i++) {
            arr[ar++] = arrRight[i];
        }
    }

}