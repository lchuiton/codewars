package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WindInfoTest {

  @Test
  public void test1() {
    assertEquals(
        "Headwind 15 knots. Crosswind 3 knots from your left.", WindInfo.message("18L", 170, 15));
  }

  @Test
  public void test2() {
    assertEquals(
        "Headwind 10 knots. Crosswind 17 knots from your left.", WindInfo.message("22", 160, 20));
  }

  @Test
  public void test3() {
    assertEquals(
        "Headwind 12 knots. Crosswind 7 knots from your right.", WindInfo.message("18", 210, 14));
  }

  @Test
  public void test4() {
    assertEquals(
        "Tailwind 17 knots. Crosswind 10 knots from your right.", WindInfo.message("22", 10, 20));
  }
}
