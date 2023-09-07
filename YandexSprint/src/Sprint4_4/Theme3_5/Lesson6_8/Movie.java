package Sprint4_4.Theme3_5.Lesson6_8;

public class Movie implements MediaItem {

    private final String title;
    private final int runtime;

    public Movie(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    @Override
    public int getRuntime() {
        return runtime;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
