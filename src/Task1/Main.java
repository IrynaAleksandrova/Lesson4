package Task1;

import java.util.Scanner;

public class Main {
    // Создайте и заполните массив случайным числами и выведете максимальное,минимальное и среднее значение.
    // Для генерации случайного числа используйте метод Math.random().
    // Пусть будет возможность создавать массив произвольного размера.
    // Пусть размер массива вводится с консоли.
    public static void main(String[] args) {
        int[] array;
        Scanner console = new Scanner(System.in);
        int N;
        N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * N);
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
        int sum = 0;
        int a = 0;
        for (int i : array) {
            sum += i;
            a = sum / array.length;
        }
        System.out.println(a);
        console.close();
    }
}