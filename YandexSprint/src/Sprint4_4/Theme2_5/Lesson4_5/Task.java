package Sprint4_4.Theme2_5.Lesson4_5;

public class Task {
    private TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    // добавьте конструктор класса

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // добавьте метод get для приоритета


    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

}
