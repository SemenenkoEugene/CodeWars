import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //Создаем экземпляр Сканера и даем возможность вводить данные с одной строки через пробел или запятую
        Scanner sc = new Scanner(System.in).useDelimiter("[,\\s+]");
        //Создаем переменные и инициализируем их
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Переменная c равно сумме a и b
        int c = a + b;

        //В консоль выводится переменная c
        System.out.println("Output: " + c);
    }
}
