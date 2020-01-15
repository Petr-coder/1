package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.io.LineNumberReader;
/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же
файл перезаписывать текстовые данные, введенные вручную. Количество строк после перезаписи должно быть столько же,
сколько и в изначальном варианте */


public class number_18 {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }



            FileReader fr = new FileReader(file);
            LineNumberReader lnr = new LineNumberReader(fr);

            int linenumber = 0;

            while (lnr.readLine() != null){
                linenumber++;
            }
            ///////////////////////////////////////////////////////////////////////////
            lnr.close();
            bufferedReader.close();


         System.out.println("Введите новые данные:");

            int col = linenumber;

            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(inputStreamReader);
            File file2 = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);



            int cc = 0;
            while(!(cc == col)) {
                bufferedWriter.write(bf.readLine() + "\n");
                cc = cc + 1;
            }



                     bf.close();
                    bufferedWriter.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
