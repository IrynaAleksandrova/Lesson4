package Task6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //    Создайте массив из n случайных целых чисел и выведите его на экран.
    //    Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
    //    Если n не удовлетворяет условию - выведите сообщение об этом.
    //    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    //    Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите число: ");
            value = console.nextInt();
        } while ((value < 5) || (value > 10));
        int[] massFirst = new int[value];
        int counterValue = 0;
        for (int j = 0; j < massFirst.length; j++) {
            massFirst[j] = (int) ((Math.random() * 100)+1);
            if ((massFirst[j] % 2) == 0) {
                counterValue++;
            }
        }
        System.out.println(Arrays.toString(massFirst));
        int[] massSecond = new int[counterValue];
        int i = 0;
        for (int k : massFirst) {
            if ((k % 2) == 0) {
                massSecond[i] = k;
                i++;
            }
        }
        System.out.println(Arrays.toString(massSecond));
        console.close();
    }
}