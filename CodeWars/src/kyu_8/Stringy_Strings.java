package kyu_8;

/*
напишите мне функцию, stringy которая принимает size и возвращает string чередующиеся 1s и 0s .

строка должна начинаться с 1.

строка с size 6 должна возвращать :'101010'.

на size 4 должно вернуться : '1010'.

на size 12 должно вернуться : '101010101010'.

Размер всегда будет положительным и будут использоваться только целые числа.
 */
public class Stringy_Strings {
    public static void main(String[] args) {
        String string = Stringy_Strings.stringy(6);
        System.out.println(string);
    }

    public static String stringy(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
        }
        return stringBuilder.toString();
    }
}
