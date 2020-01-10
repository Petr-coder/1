import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/* Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести
на экран. */

public class number_4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String bin = sc.nextLine();
            int cbmh = Integer.parseInt(bin, 2);
            System.out.println(cbmh);
        }
    }
