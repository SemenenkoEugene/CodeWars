package Sprint6_6.Theme1_6.Lesson1_7;

public class TextEditor {

    public static void main(String[] args) {
        boolean capsLock = TextEditor.isCapsLock;
        print("fdc");

    }

    private static boolean isCapsLock = false;

    public static void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
        isCapsLock = !isCapsLock;
    }

    public static void print(String str) {
        // А здесь распечатать строку в верхнем или нижнем регистре с учётом флага

        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }
}
