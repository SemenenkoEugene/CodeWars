package Sprint6_6.Theme1_6.Lesson6_7;

public class Grades {

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.gradeBeautifier("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        // реализуйте метод здесь
        String[] split = grades.split(";");
        for (String student : split) {
            String[] strings = student.split(",");
            String capitalize1 = capitalize(strings[0]);
            String capitalize2 = capitalize(strings[1]);
            String stringLowerCase = strings[2].toLowerCase();
            System.out.println(capitalize1 + " " + capitalize2 + " " + stringLowerCase + " — " + gradeToString(strings[3]));
        }
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }
}
