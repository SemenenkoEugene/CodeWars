package org.example.kyu_8;

/*
Наша футбольная команда завершила чемпионат.

Результаты матчей нашей команды записываются в виде набора строк. Каждый матч представлен строкой в формате, "x:y"
где x - счет нашей команды и y - счет соперника.

Например: ["3:1", "2:2", "0:1", ...]

Очки начисляются за каждый матч следующим образом:

если x > y: 3 очка (победа)
если x < y: 0 очков (проигрыш)
если x = y: 1 очко (ничья)
Нам нужно написать функцию, которая принимает этот сбор и возвращает количество очков, набранных нашей командой (x)
в чемпионате по приведенным выше правилам.

Примечания:

наша команда всегда проводит 10 матчей в чемпионате
0 <= x <= 4
0 <= y <= 4

 */
public class TotalPoints {
    public static void main(String[] args) {
        String[] games = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.println(points(games));
    }

    public static int points(String[] games) {
        int points = 0;

        for (String game : games) {
            var scores = game.split(":");
            int x = Integer.parseInt(scores[0]);
            int y = Integer.parseInt(scores[1]);

            if (x > y) {
                points += 3;
            } else if (x == y) {
                points += 1;
            }
        }
        return points;
    }
}
