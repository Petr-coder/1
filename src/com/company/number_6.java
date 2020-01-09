package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры x, y, z
2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
?????? 3. Деление среднего арифметического на 2 без остатка
?????? 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"  */
public class number_6 {

    public static void main(String[] args) throws IOException {

        BufferedReader mt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(mt.readLine());
        int y = Integer.parseInt(mt.readLine());
        int z = Integer.parseInt(mt.readLine());

        int a = (x + y + z)/3;
        System.out.println(a);
        a = a / 2;
        if (a > 3)
            System.out.println("Программа выполнена корректно");

    }
}