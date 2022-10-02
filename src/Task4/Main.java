package Task4;

import java.util.Arrays;

public class Main {
    //    Создайте массив и заполните массив. Выведите массив на экран в строку.
    //    Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
    public static void main(String[] args) {
        int[] array = new int[]{17, 27, 4, 8, 3, 2, 12, 91, 91};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
