import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
/*Написать программу сортировки по возрастанию заданного пользователем массива чисел. Пользователь программы должен
задавать размер массива и наполнять его числами. Использовать одну из следующих сортировок: прямого выбора, вставки,
быстрая, Шелла. */

public class the_final_task_2 {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Определите размер массива");
        int a = Integer.parseInt(reader.readLine());
        int[] abc = new int[a];

        System.out.println("Произведите ввод " + a + " чисел с клавиатуры в массив");
        for (int i = 0; i < a; i++) {
                abc[i] = Integer.parseInt(reader.readLine());
        }

        for (int smth = 0; smth < abc.length; smth++) {
            int number = abc[smth];
            int i = smth - 1;
            for (; i >= 0; i--) {
                if (number < abc[i]) {
                    abc[i + 1] = abc[i];
                } else {
                    break;
                }
            }
            abc[i + 1] = number;
        }
        /// про вывод на экран ничего не было написано, но как иначе проверить:)
        System.out.println(Arrays.toString(abc));
    }
}