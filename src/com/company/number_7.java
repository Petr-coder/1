import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры
со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"*/
public class number_7 {

    public static void main(String[] args) throws IOException {

        BufferedReader mt = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(mt.readLine());

        int x = 3;
        int y = 7;
        int z = 1;

        if ((number == x) || (number == y) || (number == z))
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}
