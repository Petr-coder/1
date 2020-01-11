package com.company;
import java.io.*;
/* Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли. Пользователь при тестировании
программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.
 */

public class number_17 {

        public static void main(String[] args) {
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                File file = new File("file1.txt");
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                System.out.println("Произведите ввод данных в файл. По окончанию ввода введите команду \"стоп\"");
                String line;
                while(!(line = bufferedReader.readLine()).equals("стоп")) {
                    bufferedWriter.write(line + "\n");
                }

                bufferedReader.close();
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
