package Sprint6_6.Theme1_6.Lesson1_7;

public class CleanInput {
    public static void main(String[] args) {

        System.out.println(fixString(" dfdf "));

    }

    public static String fixString(String str) {
        if (str.isBlank()) {
            return "Вы ничего не ввели!";
        } else {
            return str.trim();
        }
    }
}
