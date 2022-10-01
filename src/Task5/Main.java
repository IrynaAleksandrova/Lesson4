package Task5;
import java.util.Arrays;
public class Main {
    //    Создайте массив строк. Заполните его произвольными именами людей.
    //    Отсортируйте массив. Результат выведите на консоль.
    public static void main(String[] args) {
        String[] name = {"Mary", "Kate", "Sonya", "Lisa", "Stepan", "Valeriy", "Julia"};
        System.out.println("Unsorted array: " + Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted array: " + Arrays.toString(name));

    }
}
