package Sprint6_6.Theme1_6.Lesson5_7;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeWord("Молебен о коне белом"));
    }
    public boolean isPalindromeWord(String str) {
        String s = str.replaceAll("\\s+", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        return (stringBuilder.reverse().toString()).equals(s);
    }
}
