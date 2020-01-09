package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие
переменные. Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение. */

public class number_13 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();

        int a1 = a.length();
        int b1 = b.length();

        if (a1 > b1)
            System.out.println(a);
        else if (a1 < b1)
            System.out.println(b);
        else
            System.out.println("Shit! They're equal.");
    }
}