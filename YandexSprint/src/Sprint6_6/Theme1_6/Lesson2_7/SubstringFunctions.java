package Sprint6_6.Theme1_6.Lesson2_7;

public class SubstringFunctions {
    public static void main(String[] args) {
        SubstringFunctions substringFunctions = new SubstringFunctions();
        String initial = "котик";
        String other = "ик";
        int i = initial.lastIndexOf(other);
        System.out.println(i);
        System.out.println(other.length());
        System.out.println(initial.length());

        System.out.println(substringFunctions.endsWith("котик","ик"));

    }

    public boolean startsWith(String initial, String other) {
        // реализуйте метод
        return initial.indexOf(other) == 0;
    }

    public boolean endsWith(String initial, String other) {
        return initial.lastIndexOf(other) + other.length() == initial.length();
    }

}
