package Sprint7_7.Theme3_3.Lesson2_6;

public class DiscountCalculator {
    public int sumAfterDiscount(int sum) {
        if (sum < 1000) {
            return sum;
        } else {
            return (int) (sum * 0.98);
        }
    }
}
