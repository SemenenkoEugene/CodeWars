import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>();
        temperatures.add(23.5);
        temperatures.add(56.4);
        temperatures.add(89.0);
        temperatures.add(-0.1);

        double max = 0.0;
        for (Double temperature : temperatures) {
            if (temperature > temperature + 1){
                max = temperature;
                System.out.println(temperature);
            }
        }


    }


}



