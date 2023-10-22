package org.example.kyu_5;

/*
Переместите первую букву каждого слова в конец, затем добавьте "ay" в конец слова. Знаки препинания оставьте нетронутыми.

Примеры
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
 */
public class SimplePigLatin {
    public static void main(String[] args) {
        String s = "Pig latin is cool";
        System.out.println(pigIt(s));
    }

    public static String pigIt(String str) {
        StringBuilder result = new StringBuilder();

        String[] words = str.split(" ");
        for (String word : words) {
            if (word.matches("[A-Za-z]+")) {
                char firstLetter = word.charAt(0);
                result.append(word.substring(1));
                result.append(firstLetter);
                result.append("ay");
                result.append(" ");
            } else {
                result.append(word);
            }
        }
        return result.toString().trim();
    }
}
