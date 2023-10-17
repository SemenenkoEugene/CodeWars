package org.example.kyu_6;

/*
Вы, вероятно, знакомы с системой "лайков" на Facebook и других страницах. Люди могут ставить "лайки" постам в блоге,
картинкам или другим элементам. Мы хотим создать текст, который должен отображаться рядом с таким элементом.

Реализуйте функцию, которая принимает массив, содержащий имена людей, которым нравится элемент.
 Она должна возвращать отображаемый текст, как показано в примерах:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Примечание: Для 4 или более имен число в "and 2 others" просто увеличивается.
 */
public class WhoLikesIt {
    public static void main(String[] args) {
        String[] arr = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(whoLikesIt(arr));
    }

    public static String whoLikesIt(String... names) {
        int length = names.length;
        if (length == 0) {
            return "no one likes this";
        } else if (length == 1) {
            return names[0] + " likes this";
        } else if (length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (length - 2) + " others like this";
        }
    }
}
