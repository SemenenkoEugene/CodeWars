package org.example.kyu_8;

/*
Создайте функцию, которая вернет строку, объединяющую все буквы трех введенных строк в группы.
Возьмите первую букву всех входных данных и сгруппируйте их рядом друг с другом. Делайте это за каждую букву,
смотрите пример ниже!

Например, ввод: "aa", "bb", "cc" => Вывод: "abcabc"

Примечание: Вы можете ожидать, что все входные данные будут одинаковой длины.
 */
public class TripleTrouble {
    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
    }
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder sb = new StringBuilder();
        var length = one.length();
        var oneCharArray = one.toCharArray();
        var twoCharArray = two.toCharArray();
        var threeCharArray = three.toCharArray();
        for (int i = 0; i < length; i++) {
            sb.append(oneCharArray[i]);
            sb.append(twoCharArray[i]);
            sb.append(threeCharArray[i]);
        }
        return sb.toString();
    }
}
