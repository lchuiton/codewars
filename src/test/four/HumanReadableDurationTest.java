package four;

import org.junit.Assert;
import org.junit.Test;


public class HumanReadableDurationTest {

  @Test
  public void testFormatDurationExampleOne() {
    // Example Test Cases
    Assert.assertEquals("1 second", HumanReadableDuration.formatDuration(1));
  }

  @Test
  public void testFormatDurationExampleTwo() {
    // Example Test Cases
    Assert.assertEquals("1 minute and 2 seconds", HumanReadableDuration.formatDuration(62));
  }

  @Test
  public void testFormatDurationExampleThree() {
    // Example Test Cases
    Assert.assertEquals("2 minutes", HumanReadableDuration.formatDuration(120));
  }

  @Test
  public void testFormatDurationExampleFour() {
    // Example Test Cases
    Assert.assertEquals("1 hour", HumanReadableDuration.formatDuration(3600));
  }

  @Test
  public void testFormatDurationExampleFive() {
    // Example Test Cases
    Assert.assertEquals("1 hour, 1 minute and 2 seconds", HumanReadableDuration.formatDuration(3662));
  }

  @Test
  public void testFormatDurationExampleSix() {
    // Example Test Cases
    Assert.assertEquals("31 years, 85 days, 6 hours, 56 minutes and 24 seconds", HumanReadableDuration.formatDuration(984984984));
  }

  @Test
  public void testFormatDurationExampleNow() {
    // Example Test Cases
    Assert.assertEquals("now", HumanReadableDuration.formatDuration(0));
  }


}
