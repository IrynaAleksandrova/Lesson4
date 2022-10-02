package Task6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //    Создайте массив из n случайных целых чисел и выведите его на экран.
    //    Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
    //    Если n не удовлетворяет условию - выведите сообщение об этом.
    //    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    //    ??? Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    public static void main(String[] args) {
        int[] array;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int N = console.nextInt();
        array = new int[N];
        if (N > 5 && N <= 10) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) ((Math.random() * N) + 1);
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Введите другой размер массива, согласно условию: ");
            console.nextInt();
        }
        console.close();
    }
}
