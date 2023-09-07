package HeadFirstJava.Game;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //объявляем три переменные для хранения вариантов от каждого игрока
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //объявляем три переменные для хранения правильности или неправильности ответов игроков
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //создаем число, которое игроки должны угадать
        int targetName = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetName);

            p1.guess();
            p2.guess();
            p3.guess();

            //извлекаем варианты каждого игрока (результаты работы их методов guess()), получая доступ к их переменным number
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetName) {
                p1isRight = true;
            }
            if (guessp2 == targetName) {
                p2isRight = true;
            }
            if (guessp3 == targetName) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Третий игрок угадал? " + p3isRight);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}
