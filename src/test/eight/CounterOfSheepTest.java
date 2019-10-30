package eight;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class CounterOfSheepTest {

  private final Boolean[] array2 = {
    true, true, true, null, true, true, true, true, true, false, true, null, true, false, false,
    true, true, true, true, true, false, false, true, true
  };
  private final Boolean[] array1 = {
    true, true, true, false, true, true, true, true, true, false, true, false, true, false, false,
    true, true, true, true, true, false, false, true, true
  };

  @Test
  public void test() {
    MatcherAssert.assertThat(
        "There are 17 sheeps in total", new CounterOfSheep().countSheeps(array1), Matchers.is(17));
  }

  @Test
  public void test2() {
    MatcherAssert.assertThat(
        "There are 17 sheeps in total", new CounterOfSheep().countSheeps(array2), Matchers.is(17));
  }
}
