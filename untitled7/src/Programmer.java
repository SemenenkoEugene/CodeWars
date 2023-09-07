import java.util.ArrayList;
import java.util.List;

abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}

class Author extends Writer {
    public static void write() {
        System.out.println("Writing Book");
    }
}

public class Programmer extends Writer {

    public static void main(String[] args) {
        Double arr[] = {3453d,1224523d,999000d};
        Double first = 3453d;
        System.out.println(arr[0]==first);
    }
}
