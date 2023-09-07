package Sprint6_6.Theme1_6.Lesson5_7;

public class PoemFixer {
    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        // допишите код
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : poem) {
            if (!string.isBlank()) {
                stringBuilder.append(string.trim());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}
