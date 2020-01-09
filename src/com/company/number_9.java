package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент
массива умножается на 2. Размер массива задается пользователем.*/
public class number_9 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] abc = new int[10];

        for (int i = 0; i < 10; i++) {
            abc[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + (abc[i] * 2));

        }
    }
}
