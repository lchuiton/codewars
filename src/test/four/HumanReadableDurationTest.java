package four;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


public class HumanReadableDurationTest {

    @Test
    public void testFormatDurationExampleOne() {
        // Example Test Cases
        MatcherAssert.assertThat("1 second", Matchers.is(HumanReadableDuration.formatDuration(1)));
    }

    @Test
    public void testFormatDurationExampleTwo() {
        // Example Test Cases
        MatcherAssert.assertThat("1 minute and 2 seconds", Matchers.is(HumanReadableDuration.formatDuration(62)));
    }

    @Test
    public void testFormatDurationExampleThree() {
        // Example Test Cases
        MatcherAssert.assertThat("2 minutes", Matchers.is(HumanReadableDuration.formatDuration(120)));
    }

    @Test
    public void testFormatDurationExampleFour() {
        // Example Test Cases
        MatcherAssert.assertThat("1 hour", Matchers.is(HumanReadableDuration.formatDuration(3600)));
    }

    @Test
    public void testFormatDurationExampleFive() {
        // Example Test Cases
        MatcherAssert.assertThat("1 hour, 1 minute and 2 seconds", Matchers.is(HumanReadableDuration.formatDuration(3662)));
    }

    @Test
    public void testFormatDurationExampleSix() {
        // Example Test Cases
        MatcherAssert.assertThat("31 years, 85 days, 6 hours, 56 minutes and 24 seconds", Matchers.is(HumanReadableDuration.formatDuration(984984984)));
    }

    @Test
    public void testFormatDurationExampleNow() {
        // Example Test Cases
        MatcherAssert.assertThat("now", Matchers.is(HumanReadableDuration.formatDuration(0)));
    }


}
