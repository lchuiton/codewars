package five;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TrailingZerosTest {
  @Test
  public void test1() throws Exception {
    assertThat(TrailingZeros.zeros(0), is(0));
  }

  @Test
  public void test2() throws Exception {
    assertThat(TrailingZeros.zeros(6), is(1));
  }

  @Test
  public void test3() throws Exception {
    assertThat(TrailingZeros.zeros(14), is(2));
  }

  @Test
  public void test4() throws Exception {
    assertThat(TrailingZeros.zeros(12), is(2));
  }

  @Test
  public void test5() throws Exception {
    assertThat(TrailingZeros.zeros(36), is(8));
  }

  @Test
  public void test6() throws Exception {
    assertThat(TrailingZeros.zeros(1000), is(249));
  }
}
