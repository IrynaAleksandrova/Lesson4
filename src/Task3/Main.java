package Task3;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    //    Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    //    Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
    //    В результате должен быть новый массив без указанного числа.
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 8, 5, 9, 5, 10};
        int counterValue = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        int value = console.nextInt();
        for (int j = 0; j < a.length; j++) {
            if (a[j] == value) {
                counterValue++;
            } else if (j == (a.length - 1) && counterValue == 0) {
                System.out.println("Числа нет в массиве");
            }
        }
        if (counterValue > 0) {
            int[] aResult = new int[a.length - counterValue];
            int i = 0;
            for (int k : a) {
                if (k != value) {
                    aResult[i] = k;
                    i++;
                }
            }
                System.out.println(Arrays.toString(aResult));
        }
        console.close();
    }
}