package day11.task1;

public class Picker implements Worker {

    private int salary;
    private static final int TASK_SALARY = 80;
    private boolean isPayed;
    public Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "Сборщик " +
                "заработная плата " + salary +
                ", был выплачен бонус или нет" + isPayed;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70_000;
        isPayed = true;


    }
}
