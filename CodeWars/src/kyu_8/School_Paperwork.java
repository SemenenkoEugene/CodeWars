package kyu_8;

/*
Ваши одноклассники попросили вас скопировать для них некоторые документы.
Вы знаете, что есть "n" одноклассников, а в документах есть "m" страниц.

Ваша задача - подсчитать, сколько пустых страниц вам нужно. Если n < 0 или m < 0 Возврат 0.

Пример:
n= 5, m=5: 25
n=-5, m=5:  0
 */
public class School_Paperwork {
    public static void main(String[] args) {
        int i = School_Paperwork.paperWork(5, 5);
        System.out.println(i);
    }

    public static int paperWork(int n, int m) {
        if (n < 0 || m < 0) {
            return 0;
        } else {
            return n * m;
        }
    }
}
