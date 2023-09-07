package Sprint6_6.Theme1_6.Lesson3_7.Task1;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int sum = 0, indexSubstring = 0;
        while (true) {
            indexSubstring = text.indexOf(substring, indexSubstring);
            if (indexSubstring != -1) {
                sum++;
                indexSubstring += substring.length();
            } else {
                break;
            }
        }
        return sum;
    }


}
