package Sprint7_7.Theme4_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.*;

class FortuneCookieFactoryTest {

    private static FortuneCookieFactory fortuneCookieFactory;

    @BeforeEach
    void beforeEach() {
        fortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(true), singletonList("positive"), singletonList("negative"));
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        fortuneCookieFactory.bakeFortuneCookie();
        assertEquals(1, fortuneCookieFactory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        fortuneCookieFactory.bakeFortuneCookie();
        fortuneCookieFactory.bakeFortuneCookie();
        assertEquals(2, fortuneCookieFactory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        fortuneCookieFactory.bakeFortuneCookie();
        assertEquals(1, fortuneCookieFactory.getCookiesBaked());
        fortuneCookieFactory.resetCookiesCreated();
        assertEquals(0, fortuneCookieFactory.getCookiesBaked());
    }
}