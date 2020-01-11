package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент
массива умножается на 2. Размер массива задается пользователем.*/
public class number_9 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Определите размер массива");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int[][] abc = new int[a][b];

        System.out.println("Произведите ввод данных с клавиатуры в массив");
        for (int i = 0; i < a; i++) {
            for (int t = 0; t < b; t++)
                abc[i][t] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a; i++) {
            for (int t = 0; t < b; t++){
            System.out.print(((abc[i][t]) * 2) + " ");}
            System.out.print("\n");

        }
    }
}
