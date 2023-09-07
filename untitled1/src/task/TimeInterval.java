package task;

public class TimeInterval {
    private final int seconds;
    private final int minutes;
    private final int hours;
    private final int CONSTANT = 60;

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / CONSTANT * CONSTANT;
        this.minutes = totalSeconds % (CONSTANT * CONSTANT) / CONSTANT;
        this.seconds = totalSeconds % (CONSTANT * CONSTANT) % CONSTANT;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * CONSTANT + hours * CONSTANT * CONSTANT;
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.println("h " + hours + ", m " + minutes + ", s " + seconds);
    }
}
