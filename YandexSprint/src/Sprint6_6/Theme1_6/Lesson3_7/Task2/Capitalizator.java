package Sprint6_6.Theme1_6.Lesson3_7.Task2;

public class Capitalizator {
    public String capitalize(String str) {
        String substring = str.substring(0, 1);
        String substring1 = str.substring(1, str.length() - 1);
        String upperCase = substring.toUpperCase();
        return upperCase.concat(substring1);

    }
}
