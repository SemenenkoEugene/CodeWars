import java.util.Scanner;

public class Task036 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите номер билета: ");
        int number = read.nextInt();

        int step = 1;
        int count = 0;
        int sum = 0;
        while (number != 0) {
            sum += step * (number % 10);
            number /= 10;
            if (++count == 2) {
                step = -step;
            }
        }
        if (count == 4 && sum == 0) {
            System.out.println("Ticket lucky;");
        } else if (count != 4) {
            System.out.println("You input incorrect ticket;");
        } else {
            System.out.println("Ticket not lucky;");
        }
    }
}
