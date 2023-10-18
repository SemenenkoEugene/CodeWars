package org.example.kyu_6;

/*
Напишите функцию, которая принимает строку из одного или нескольких слов и возвращает ту же строку,
но со всеми перевернутыми словами из пяти или более букв (точно так же, как название этого ката).
Передаваемые строки будут состоять только из букв и пробелов. Пробелы будут включены только в том случае,
если присутствует более одного слова.

Примеры:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
 */
public class SpinWords {
    public static void main(String[] args) {
        String sentence = "Hey fellow warriors";
        SpinWords spinWords = new SpinWords();
        String string = spinWords.spinWords(sentence);
        System.out.println(string);
    }

    public String spinWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() >= 5) {
                StringBuilder builder = new StringBuilder(word);
                StringBuilder reverse = builder.reverse();
                String string = reverse.toString();
                stringBuilder.append(string).append(" ");
            } else {
                stringBuilder.append(word).append(" ");
            }
        }
        String string = stringBuilder.toString();
        return string.trim();

    }
}
