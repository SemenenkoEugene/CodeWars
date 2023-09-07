package Sprint2_2;

public class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays = 0;
    int year = 2020;
    boolean isRainyMonth = false;

    public WeatherCalendar(String monthName, int monthNumberOfDays){
        month = monthName;
        numberOfDays = monthNumberOfDays;
    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }
}
