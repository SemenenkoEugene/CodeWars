package org.example.kyu_6;
/*
Слово i18n является распространенной аббревиатурой internationalization в сообществе разработчиков,
используемой вместо ввода всего слова и попытки правильно его произнести. Аналогично,
a11y является аббревиатурой accessibility.

Напишите функцию, которая принимает строку и превращает любые "слова" (см. Ниже)
внутри этой строки длиной 4 или больше в аббревиатуру, следуя этим правилам:

"Слово" - это последовательность алфавитных символов. Согласно этому определению, любой другой символ,
такой как пробел или дефис (например, "поездка на слоне"), разделит серию букв на два слова (например, "elephant" и "ride").
Сокращенная версия слова должна содержать первую букву, затем количество удаленных символов, затем последнюю букву
(например, "поездка на слонах" => "e6t r2e").
Пример
abbreviate("elephant-rides are really fun!")
//          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
// words (^):   "elephant" "rides" "are" "really" "fun"
//                123456     123     1     1234     1
// ignore short words:               X              X

// abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
// all non-word characters (*) remain in place
//                     "-"      " "    " "     " "     "!"
=== "e6t-r3s are r4y fun!"
 */
public class Abbreviator {
    public static void main(String[] args) {
        String string = "cat the_mat_is5double-barreled: is5doggy: double-barreled_on: cat";
        Abbreviator abbreviator = new Abbreviator();
        String result = abbreviator.abbreviate(string);
        System.out.println(result);

    }

    public String abbreviate(String string) {
        StringBuilder sb = new StringBuilder();
        String regex = "[\\s_:'-.]+";
        String[] words = string.split(regex);

        for (String word : words) {
            if (word.length() < 4) {
                sb.append(word);
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                int removedChars = word.length() - 2;
                sb.append(firstChar).append(removedChars).append(lastChar);
            }
            int nonWordCharIndex = string.indexOf(word) + word.length();
            if (nonWordCharIndex < string.length()) {
                sb.append(string.charAt(nonWordCharIndex));
            }
        }
        return sb.toString();
    }
}
