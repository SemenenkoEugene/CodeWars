package Sprint7_7.Theme5_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 0)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceMore20Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 21)
        );

        Assertions.assertEquals("Bike can not go for more than 20 km", ex.getMessage());
    }

    @Test
    public void shouldReturn100ForBikeAndDistance10Km() {
        int price = new PriceCalculator().calculatePrice(TransportType.BIKE, 10);
        Assertions.assertEquals(price, 100);
    }


    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIs0Km() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 0)
        );
        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenCarAndDistanceMore1000Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 1001)
        );

        Assertions.assertEquals("Car can not go for more than 1000 km", ex.getMessage());
    }

    @Test
    public void shouldReturn70ForCarAndDistance10Km() {
        int price = new PriceCalculator().calculatePrice(TransportType.CAR, 10);
        Assertions.assertEquals(price, 70);
    }

    @Test
    public void shouldThrowExceptionWhenTruckAndDistanceIs0Km() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.TRUCK, 0)
        );
        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldReturn50ForTruckAndDistance10Km() {
        int price = new PriceCalculator().calculatePrice(TransportType.TRUCK, 10);
        Assertions.assertEquals(price, 50);
    }

    @Test
    public void shouldThrowExceptionWhenDroneAndDistanceIs0Km() {
        UnsupportedOperationException ex = assertThrows(
                UnsupportedOperationException.class,
                generateExecutable(TransportType.DRONE, 10)
        );
        Assertions.assertEquals("transport type '" + TransportType.DRONE + "' is not handled correctly", ex.getMessage());
    }


    private Executable generateExecutable(TransportType type, int distance) {
        return () -> priceCalculator.calculatePrice(type, distance);
    }

}