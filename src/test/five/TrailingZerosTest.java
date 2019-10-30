package five;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class TrailingZerosTest {

    @Test
    public void test1() {
        MatcherAssert.assertThat(TrailingZeros.zeros(0), is(0));
    }

    @Test
    public void test2() {
        MatcherAssert.assertThat(TrailingZeros.zeros(6), is(1));
    }

    @Test
    public void test3() {
        MatcherAssert.assertThat(TrailingZeros.zeros(14), is(2));
    }

    @Test
    public void test4() {
        MatcherAssert.assertThat(TrailingZeros.zeros(12), is(2));
    }

    @Test
    public void test5() {
        MatcherAssert.assertThat(TrailingZeros.zeros(36), is(8));
    }

    @Test
    public void test6() {
        MatcherAssert.assertThat(TrailingZeros.zeros(1000), is(249));
    }
}
