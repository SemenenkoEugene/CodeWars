package day11.task1;

public class Warehouse implements Worker{

    private int countPickedOrders;
    private int countDeliveredOrders;

    public void incrementPickedOrders(){
        countPickedOrders++;
    }

    public void incrementDeliveredOrders(){
        countDeliveredOrders++;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Склад " +
                "количество собранных заказов " + countPickedOrders +
                ", количество доставленных заказов " + countDeliveredOrders;
    }

    @Override
    public void doWork() {

    }

    @Override
    public void bonus() {

    }
}
