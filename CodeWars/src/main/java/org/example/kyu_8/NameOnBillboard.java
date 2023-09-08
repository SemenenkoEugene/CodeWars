package org.example.kyu_8;

/*
Вы можете напечатать свое имя на рекламном щите. Узнайте, во сколько вам это обойдется.
Цена каждого символа по умолчанию составляет 30 фунтов стерлингов, но она может отличаться,
если вам задано 2 параметра вместо 1 (всегда 2 для Java).

Вы не можете использовать оператор множителя "*".

Если бы ваше имя было Чон Хо Аристотелис, реклама стоила бы 600 фунтов стерлингов.
 20 букв * 30 = 600 (пробел считается символом).
 */
public class NameOnBillboard {
    public static void main(String[] args) {

        int result = NameOnBillboard.billboard("Hadufuns John", 20);
        System.out.println(result);
    }

    public static int billboard(String name, int price) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum = sum + price;
        }
        return sum;
    }
}
