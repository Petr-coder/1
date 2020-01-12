package com.company;
import java.io.*;
import java.util.Scanner;
/*Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести
на экран. Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной
системы счисления в другую. */
public class the_final_task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int b = a.length();

        int c = 0;
        for (int i = b - 1, d = 1; i >= 0; i--, d *= 2) {
            c += (a.charAt(i) - '0') * d;
        }

        System.out.println("\"" + a + "\" -> " + c);
    }
}
