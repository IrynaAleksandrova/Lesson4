package Task0;

import java.util.Scanner;

public class Main {
    //    Создайте массив целых чисел. Напишете программу, которая выводит
    //    сообщение о том, входит ли заданное число в массив или нет.
    //    Пусть число для поиска задается с консоли (класс Scanner).

    public static void main(String[] args) {
        int[] a = {1, 15, 55, 198, 222, 987};
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = console.nextInt();
        for (int j = 0; j < a.length; j++) {
            if (number == a[j]) {
                System.out.println("Заданное число входит в массив.");
                break;
            } else if (j == (a.length - 1)) {
                System.out.println("Заданного числа нет в массиве.");
                break;
            }
        }
        console.close();
    }
}
