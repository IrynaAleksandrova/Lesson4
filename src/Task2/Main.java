package Task2;

import java.util.Arrays;

public class Main {
    //    Создайте 2 массива из 5 чисел.
    //    Выведите массивы на консоль в двух отдельных строках.
    //    Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
    //    (либо сообщите, что их средние арифметические равны).
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 7, 9, 15};
        int[] b = new int[]{4, 6, 7, 11, 19};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        double sum = 0;
        double w = 0;
        for (double i : a) {
            sum += i;
            w = sum / a.length;
        }
        System.out.println(w);

        double sun = 0;
        double v = 0;
        for (double i : b) {
            sun += i;
            v = sun / b.length;
        }
        System.out.println(v);
        if (w > v) {
            System.out.println("Среднее значение первого массива (а) больше");
        } else if (w < v) {
            System.out.println("Среднее значение второго массива (b) больше");
        } else {
            System.out.println("Массивы равны");
        }

    }
}
