package org.example.kyu_7;

/*
Спунеризм - это разговорная фраза, в которой первые буквы двух слов меняются местами, часто с забавными результатами.

В своей самой простой форме спунеризм - это фраза из двух слов, в которой меняются местами только первые буквы каждого слова:

"not picking" --> "pot nicking"

Ваша задача - создать функцию, которая принимает строку из двух слов, разделенных пробелом: words и возвращает
последовательность этих слов в строке, как в приведенном выше примере. "Слово" в контексте этого ката может содержать
любую из букв от A до Z в верхнем или нижнем регистре и цифры от 0 до 9. Хотя спунеризмы относятся к буквам в словах
в области письменного и разговорного языка, цифры включены во входные данные для случайных тестовых примеров и
не требуют специальной обработки.
 */
public class Spooner {
    public static void main(String[] args) {
        String words = "nit picking";
        Spooner spooner = new Spooner();
        System.out.println(spooner.spoonerize(words));
    }

    public String spoonerize(String words) {
        String[] strings = words.split(" ");

        char[] charArrayFirstWord = strings[0].toCharArray();
        charArrayFirstWord[0] = strings[1].charAt(0);

        char[] charArraySecondWord = strings[1].toCharArray();
        charArraySecondWord[0] = strings[0].charAt(0);

        return String.valueOf(charArrayFirstWord) + " " + String.valueOf(charArraySecondWord);
    }
}
