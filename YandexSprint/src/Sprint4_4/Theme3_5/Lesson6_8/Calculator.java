package Sprint4_4.Theme3_5.Lesson6_8;

import java.util.List;

public class Calculator {

    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double count = 0;
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                count += mediaItem.getRuntime();
            }
            if (mediaItem instanceof Series){
                count += mediaItem.getRuntime() * ((Series) mediaItem).getSeriesCount();
            }
        }
        return count / (60 *24);
    }
}
