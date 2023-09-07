package Sprint3_3.Theme2_6.Lesson2_3;

public class CarTimeCalculator {
    private double speed = 25;
    private double speedInMS = new SpeedConverter(speed).getSpeedInMs();
    // средняя скорость в км/ч
    private String courierName;

    public CarTimeCalculator(String name) {
        courierName = name;
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);
    }

    public String getCourierName() {
        return courierName;
    }
}
