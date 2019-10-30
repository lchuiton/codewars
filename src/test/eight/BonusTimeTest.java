package eight;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;


public class BonusTimeTest {

    @Test
    public void basicTests() {
        MatcherAssert.assertThat("\u00A3100000", Matchers.equalTo(BonusTime.bonusTime(10000, true)));
        MatcherAssert.assertThat("\u00A3250000", Matchers.equalTo(BonusTime.bonusTime(25000, true)));
        MatcherAssert.assertThat("\u00A310000", Matchers.equalTo(BonusTime.bonusTime(10000, false)));
        MatcherAssert.assertThat("\u00A360000", Matchers.equalTo(BonusTime.bonusTime(60000, false)));
        MatcherAssert.assertThat("\u00A320", Matchers.equalTo(BonusTime.bonusTime(2, true)));
        MatcherAssert.assertThat("\u00A378", Matchers.equalTo(BonusTime.bonusTime(78, false)));
        MatcherAssert.assertThat("\u00A3678900", Matchers.equalTo(BonusTime.bonusTime(67890, true)));
    }

}