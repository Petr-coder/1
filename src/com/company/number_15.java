import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
/* Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки. */
public class number_15 {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] abc = new int[10];

        for (int i = 0; i < 10; i++) {
            abc[i] = Integer.parseInt(reader.readLine());
        }

            for (int start = 0; start < abc.length - 1; start++) {
                for (int index = 0; index < abc.length - 1 - start; index++) {
                    if (abc[index] > abc[index + 1]){
                        swap(abc, index);
                    }
                }
            }
            System.out.println(Arrays.toString(abc));
        }

        private static void swap(int array[], int i) {
            int tmp = array[i];
            array[i] = array[(i + 1)];
            array[(i + 1)] = tmp;
        }
    }