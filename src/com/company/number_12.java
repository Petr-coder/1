package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести
на экран. */

public class number_12 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String smth = reader.readLine();
        String result = smth.replaceAll(" ", "");
        System.out.print(result);
    }
}