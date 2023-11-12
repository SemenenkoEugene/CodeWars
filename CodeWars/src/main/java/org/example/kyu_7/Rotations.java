package org.example.kyu_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Ввод:

строка strng
массив строк arr
Вывод функции contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):

логическое значение, true если все вращения strng включены в arr
false в противном случае
Примеры:
contain_all_rots(
  "bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true

contain_all_rots(
  "Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"]) -> false)
Примечание:
Хотя и неверно в математическом смысле

мы будем считать, что никаких ротаций strng == ""
и для любого массива arr: contain_all_rots("", arr) --> true
 */
public class Rotations {
    public static void main(String[] args) {
        String string = "bsjq";
        List<String> arr = List.of("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        boolean result = containAllRots(string, arr);
        System.out.println(result);
    }

    public static boolean containAllRots(String strng, List<String> arr) {
        if (Objects.equals(strng, "")) {
            return true;
        }
        List<String> rotations = new ArrayList<>();
        rotations.add(strng);
        for (int i = 0; i < strng.length(); i++) {
            String rotation = strng.substring(i) + strng.substring(0, i);
            rotations.add(rotation);
        }
        for (String rotation : rotations) {
            if (!arr.contains(rotation)) {
                return false;
            }
        }
        return true;
    }
}
