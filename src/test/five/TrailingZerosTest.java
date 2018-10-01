package five;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TrailingZerosTest {
    @Test
    public void test1() {
        assertThat(TrailingZeros.zeros(0), is(0));
    }

    @Test
    public void test2() {
        assertThat(TrailingZeros.zeros(6), is(1));
    }

    @Test
    public void test3() {
        assertThat(TrailingZeros.zeros(14), is(2));
    }

    @Test
    public void test4() {
        assertThat(TrailingZeros.zeros(12), is(2));
    }

    @Test
    public void test5() {
        assertThat(TrailingZeros.zeros(36), is(8));
    }

    @Test
    public void test6() {
        assertThat(TrailingZeros.zeros(1000), is(249));
    }
}
