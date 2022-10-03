package Task7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите произвольное число: ");
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < array.length; i++) array[i] = ((int) (Math.random() * N) + 1);
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
        System.out.println(Arrays.toString(array));
        console.close();
    }
}

    // Реализуйте алгоритм сортировки вставками.
//    public static void main(String[] args) {
//        int[] array;
//        Scanner console = new Scanner(System.in);
//        System.out.println("Введите произвольное число: ");
//        int N = console.nextInt();
//        array = new int[N];
//        for (int i = 0; i < array.length; i++) array[i] = ((int) (Math.random() * N) + 1);
//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j = i - 1;
//            while (j >= 0 && current < array[j]) {
//                array[j + 1] = array[j];
//                j--;
//            } // в этой точке мы вышли, так что j так же -1 или в первом элементе, где текущий >= a[j]
//            array[j + 1] = current;
//        }
//        System.out.println(Arrays.toString(array));
//        console.close();
//    }
//}

