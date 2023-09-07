package Sprint3_3.Theme2_6.Lesson2_3;

public class DeliveryInfo {
    private String name;
    private long time;

    public DeliveryInfo(String deliveryName, long deliveryTime) {
        name = deliveryName;
        time = deliveryTime;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }
}
