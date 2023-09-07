package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Андрюся");
        User user2 = new User("Маруся");
        User user3 = new User("Мамуся");

        user1.sendMessage(user2, "Привет, как дела?");
        user1.sendMessage(user2, "Что делаешь?");

        user2.sendMessage(user1, "Привет, все ок :)!");
        user2.sendMessage(user1, "Гуляю, отдыхаю");
        user2.sendMessage(user1, "Как ты?");

        user3.sendMessage(user1, "Привет!");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Что делаешь?");

        user1.sendMessage(user3, "Привет!");
        user1.sendMessage(user3, "Все, ок :)");
        user1.sendMessage(user3, "Гуляю )))");

        user3.sendMessage(user1, "Умница, люблю тебя!!!");

        MessageDatabase.showDialog(user1, user3);
    }
}
