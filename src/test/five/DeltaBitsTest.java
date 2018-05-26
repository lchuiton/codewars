package five;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DeltaBitsTest {

  @Test
  public void test1() throws Exception {

    assertThat(DeltaBits.convertBits(31, 14), is(2));
  }

  @Test
  public void test2() throws Exception {

    assertThat(DeltaBits.convertBits(1, 1), is(0));
  }

  @Test
  public void test3() throws Exception {

    assertThat(DeltaBits.convertBits(7, 17), is(3));
  }

  @Test
  public void test4() throws Exception {

    assertThat(DeltaBits.convertBits(135417456, 10397296), is(8));
  }

}