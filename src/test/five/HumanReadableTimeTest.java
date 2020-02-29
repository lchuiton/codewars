package five;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeTest {

  @Test
  public void tests() {
    assertEquals("makeReadable(0)", HumanReadableTime.makeReadable(0), "00:00:00");
    assertEquals("makeReadable(5)", HumanReadableTime.makeReadable(5), "00:00:05");
    assertEquals("makeReadable(60)", HumanReadableTime.makeReadable(60), "00:01:00");
    assertEquals("makeReadable(86399)", HumanReadableTime.makeReadable(86399), "23:59:59");
    assertEquals("makeReadable(359999)", HumanReadableTime.makeReadable(359999), "99:59:59");
  }
}
