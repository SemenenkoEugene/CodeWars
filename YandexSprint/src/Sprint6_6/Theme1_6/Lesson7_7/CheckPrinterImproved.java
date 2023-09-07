package Sprint6_6.Theme1_6.Lesson7_7;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] strings1 = new String[items.length];
        String[] strings2 = new String[items.length];
        String[] strings3 = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            String[] strings = items[i].split(",");
            strings1[i] = strings[0];
            strings2[i] = strings[1];
            strings3[i] = strings[2];
        }
        int maxLength = findMaxLength(strings1);

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-" + (maxLength + 2) + "s", strings1[i]);
            System.out.printf("%s", strings2[i]);
            System.out.printf("%2s", strings3[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
//        int n = Integer.parseInt(scanner.nextLine());
//        String[] values = new String[n];
//        for (int i=0; i<n; ++i)
//            values[i] = scanner.nextLine();
        String[] values = {
                "Пицца, 1 шт., 310.50",
                "Чай, 2 шт., 113.30",
                "Печенье, 1 уп., 75.75"
        };
        printCheck(values);
    }
}
