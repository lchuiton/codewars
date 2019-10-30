package five;


import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.math.BigInteger;

public class SumFctTest {

    @Test
    public void test1() {
        MatcherAssert.assertThat(BigInteger.valueOf(80), Matchers.equalTo(SumFct.perimeter(BigInteger.valueOf(5))));
    }

    @Test
    public void test2() {
        MatcherAssert.assertThat(BigInteger.valueOf(216), Matchers.equalTo(SumFct.perimeter(BigInteger.valueOf(7))));
    }

    @Test
    public void test3() {
        MatcherAssert.assertThat(BigInteger.valueOf(14098308), Matchers.equalTo(SumFct.perimeter(BigInteger.valueOf(30))));
    }

}
