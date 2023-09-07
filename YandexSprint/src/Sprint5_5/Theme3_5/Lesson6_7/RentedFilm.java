package Sprint5_5.Theme3_5.Lesson6_7;

public class RentedFilm {
    private final String name;
    private final DateTime timeOfRent;
    private final DateTime timeOfReturn;

    public RentedFilm(String name, DateTime timeOfRent, DateTime timeOfReturn) {
        this.name = name;
        this.timeOfRent = timeOfRent;
        this.timeOfReturn = timeOfReturn;
    }

    public String getName() {
        return name;
    }

    public DateTime getTimeOfRent() {
        return timeOfRent;
    }

    public DateTime getTimeOfReturn() {
        return timeOfReturn;
    }
}
