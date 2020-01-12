package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
/* Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */
public class the_final_task_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader mt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите курс доллара");
        double x = Double.parseDouble(mt.readLine());
        System.out.println("Введите количество рублей");
        double y = Double.parseDouble(mt.readLine());

        double z = y/x;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Итого: " + df.format(z) + " долларов");
    }
}
