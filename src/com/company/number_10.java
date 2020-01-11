package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем*/

public class number_10 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Определите размер матрицы, м-р Андерсон");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int[][] abc = new int[a][b];

        System.out.println("Произведите ввод данных с клавиатуры в матрицу");

        int t = 0, i = 0;
        for (i = 0; i < a; ++i) {
            for (t = 0; t < b; ++t) {
                abc[i][t] = Integer.parseInt(reader.readLine());
            }
        }

        for (i = 0, t =0 ; i < b; ++i) {
            System.out.print(abc[t][i] * 3 + " ");
        }
    }
}