package Task7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
    // Реализуйте алгоритм сортировки пузырьком.
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
    // Реализуйте алгоритм сортировки вставками.
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            } // в этой точке мы вышли, так что j так же -1 или в первом элементе, где текущий >= a[j]
            array[j + 1] = current;
        }
    }
}

