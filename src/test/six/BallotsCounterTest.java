package six;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

public class BallotsCounterTest {

  @Test
  public void testGetWinner_01() {
    MatcherAssert.assertThat(BallotsCounter.getWinner(Collections.singletonList("A")), is("A"));
  }

  @Test
  public void testGetWinner_02() {
    MatcherAssert.assertThat(
        BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B", "B", "A")), is("A"));
  }

  @Test
  public void testGetWinner_03() {
    MatcherAssert.assertThat(
        BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B", "B")), is(nullValue()));
  }

  @Test
  public void testGetWinner_04() {
    MatcherAssert.assertThat(
        BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "C", "B")), is(nullValue()));
  }

  @Test
  public void testGetWinner_05() {
    MatcherAssert.assertThat(
        BallotsCounter.getWinner(Arrays.asList("A", "A", "B", "B", "C")), is(nullValue()));
  }
}
