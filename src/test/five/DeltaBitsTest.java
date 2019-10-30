package five;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DeltaBitsTest {

  @Test
  public void test1() {

    MatcherAssert.assertThat(DeltaBits.convertBits(31, 14), is(2));
  }

  @Test
  public void test2() {

    MatcherAssert.assertThat(DeltaBits.convertBits(1, 1), is(0));
  }

  @Test
  public void test3() {

    MatcherAssert.assertThat(DeltaBits.convertBits(7, 17), is(3));
  }

  @Test
  public void test4() {

    MatcherAssert.assertThat(DeltaBits.convertBits(135417456, 10397296), is(8));
  }
}
