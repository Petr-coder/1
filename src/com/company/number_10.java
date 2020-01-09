package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем*/

public class number_10 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int abc[][] = new int[3][3];

        int t = 0, i = 0;
        for (i = 0; i < 3; ++i) {
            for (t = 0; t < 3; ++t) {
                abc[i][t] = Integer.parseInt(reader.readLine());
            }
        }

        for (i = 0; i < 3; ++i) {
            System.out.print(abc[0][i] * 3 + " ");
        }
    }
}