package day11.task1;

public class Courier implements Worker {

    private int salary;
    private static final int TASK_SALARY = 100;
    private boolean isPayed;
    public Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Курьер " +
                "заработная плата " + salary +
                ", был выплачен бонус или нет " + isPayed;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10_000) {
            System.out.println();
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;
    }
}
