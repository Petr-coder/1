package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.*/

public class number_11 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String smth = reader.readLine();
        System.out.print(smth);
    }
}