package Sprint7_7.Theme4_4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Collections.*;


class FortuneCookieControllerTest {

    private static FortuneConfig positiveConfig;
    private static FortuneConfig negativeConfig;
    private static FortuneCookieFactory positiveFactory;
    private static FortuneCookieFactory negativeFactory;
    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    @BeforeAll
    static void beforeAll() {
        positiveConfig = new FortuneConfig(true);
        negativeConfig = new FortuneConfig(false);
        positiveFactory = new FortuneCookieFactory(positiveConfig, singletonList("positive"), singletonList("negative"));
        negativeFactory = new FortuneCookieFactory(negativeConfig, singletonList("positive"), singletonList("negative"));
    }

    @Test
    public void shouldReturnPositiveFortune() {
        assertEquals("positive", positiveFactory.bakeFortuneCookie().getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune() {
        assertEquals("negative", negativeFactory.bakeFortuneCookie().getFortuneText());
    }
}