package Sprint1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepTracker {

    Map<Integer, MonthData> stepsCount = new HashMap<>();
    MonthData calendar;
    int stepsPerDay = 0;
    int targetStepsCount = 10000;


    StepTracker() {
        for (int i = 0; i < 12; i++) {
            stepsCount.put(i, new MonthData());
        }
    }

    public void saveSteps(int month, int numberDay, int stepsPerDay) {
        if (stepsPerDay < 0) {
            System.out.println("Число шагов должно быть положительным целым числом");
            return;
        }
        if (numberDay < 1 || numberDay > 30) {
            System.out.println("Введенное число должно лежать в диапазоне от 1 до 30, включительно");
            return;
        }

    }
}

class MonthData{

}
