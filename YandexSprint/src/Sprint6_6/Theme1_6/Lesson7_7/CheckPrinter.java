package Sprint6_6.Theme1_6.Lesson7_7;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item : items) {
            String[] strings = item.split(", ");
            System.out.printf("%-10s%-10s%s%n", strings[0], strings[1], strings[2]);
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
//        int n = Integer.parseInt(scanner.nextLine());
//        String[] values = new String[n];
//        for (int i = 0; i < n; ++i)
//            values[i] = scanner.nextLine();
        String[] values = {
                "Пицца, 1 шт., 310.50",
                "Чай, 2 шт., 113.30",
                "Печенье, 1 уп., 75.75"
        };
        printCheck(values);
    }
}
