package Sprint3_3.Theme2_6.Lesson2_3;

public class SpeedConverter {
    private int metersInKilometer = 1000;
    private int minutesInHour = 60;
    private double speed;

    public SpeedConverter(double speedInKmH) {
        speed = speedInKmH;
    }

    public double getSpeedInMs() {
        return (speed * metersInKilometer) / minutesInHour;
    }
}
