package org.example.kyu_8;

/*
Создайте метод, который принимает в качестве входных данных имя, город и штат для приветствия пользователя.
Обратите внимание, что name будет массив, состоящий из одного или более значений,
которые должны быть соединены вместе с одним пробелом между каждым, а длина name время в тестовых случаях будет отличаться.

Пример:

['John', 'Smith'], 'Phoenix', 'Arizona'
Этот пример вернет строку Hello, John Smith! Welcome to Phoenix, Arizona!
 */
public class WelcomeToTheCity {
    public static void main(String[] args) {
        WelcomeToTheCity city = new WelcomeToTheCity();
        String[] string = {"John", "Smith"};
        String hello = city.sayHello(string, "Phoenix", "Arizona");
        System.out.println(hello);
    }

    public String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %s %s! Welcome to %s, %s!", name[0], name[1], city, state);
    }
}
