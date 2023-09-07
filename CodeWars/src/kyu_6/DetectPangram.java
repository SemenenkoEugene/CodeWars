package kyu_6;/*
Панграмма - это предложение, которое содержит каждую букву алфавита по крайней мере один раз.
Например, предложение "Быстрая бурая лиса перепрыгивает через ленивую собаку" является панграммой,
потому что в нем используются буквы от А доЯ по крайней мере один раз (регистр значения не имеет).

По заданной строке определите, является ли это панграммой. Верните True, если это так, False, если нет.
 Игнорируйте цифры и знаки препинания.
 */

import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        DetectPangram detectPangram = new DetectPangram();
        detectPangram.check(pangram1);
    }

    public boolean check(String sentence) {
        Set<Character> characterSet = new HashSet<>();
        sentence = sentence.toUpperCase();
        sentence = sentence.replaceAll("[^A-Z]", "");
        char[] chars = sentence.toCharArray();
        for (char aChar : chars) {
            characterSet.add(aChar);
        }
        if (characterSet.size() == 26) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

}
