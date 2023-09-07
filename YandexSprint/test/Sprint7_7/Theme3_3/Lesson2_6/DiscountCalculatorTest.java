package Sprint7_7.Theme3_3.Lesson2_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void shouldGiveNoDiscountForValue999() {
        // Подготовка
        int buySum = 999;
        int expectedSum = 999;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGiveNoDiscountForValue1() {
        int afterDiscount = discountCalculator.sumAfterDiscount(1);
        assertEquals(1, afterDiscount);
    }

    @Test
    public void shouldGiveNoDiscountForValue333() {
        int afterDiscount = discountCalculator.sumAfterDiscount(333);
        assertEquals(333, afterDiscount);
    }

    @Test
    public void shouldGive2PercentDiscountForValue1000() {
        int afterDiscount = discountCalculator.sumAfterDiscount(1000);
        assertEquals(980, afterDiscount);
    }

    @Test
    public void shouldGive2PercentDiscountForValue2000() {
        int afterDiscount = discountCalculator.sumAfterDiscount(2000);
        assertEquals(1960, afterDiscount);
    }
}