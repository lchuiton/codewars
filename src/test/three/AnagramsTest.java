package three;


import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class AnagramsTest {

    @Test
    public void testBasic() {

        MatcherAssert.assertThat("Position for 'ABC' incorrect", BigInteger.valueOf(1), Matchers.is(Anagrams.listPosition("ABC")));
        MatcherAssert.assertThat("Position for 'ACB' incorrect", BigInteger.valueOf(2), Matchers.is(Anagrams.listPosition("ACB")));
        MatcherAssert.assertThat("Position for 'BAC' incorrect", BigInteger.valueOf(3), Matchers.is(Anagrams.listPosition("BAC")));
        MatcherAssert.assertThat("Position for 'BCA' incorrect", BigInteger.valueOf(4), Matchers.is(Anagrams.listPosition("BCA")));
        MatcherAssert.assertThat("Position for 'CAB' incorrect", BigInteger.valueOf(5), Matchers.is(Anagrams.listPosition("CAB")));
        MatcherAssert.assertThat("Position for 'CBA' incorrect", BigInteger.valueOf(6), Matchers.is(Anagrams.listPosition("CBA")));
    }

    @Test
    public void testBasicDoublon() {

        MatcherAssert.assertThat("Position for 'ABA' incorrect", BigInteger.valueOf(2), Matchers.is(Anagrams.listPosition("ABA")));
        MatcherAssert.assertThat("Position for 'BAA' incorrect", BigInteger.valueOf(3), Matchers.is(Anagrams.listPosition("BAA")));
        MatcherAssert.assertThat("Position for 'AAB' incorrect", BigInteger.ONE, Matchers.is(Anagrams.listPosition("AAB")));
    }

    @Test
    public void complexeSansDoublon() {
        MatcherAssert.assertThat("Position for 'QUESTION' incorrect", BigInteger.valueOf(24572), Matchers.is(Anagrams.listPosition("QUESTION")));
    }

    @Test
    public void testKnownInputs() {

        MatcherAssert.assertThat("Position for 'A' incorrect", BigInteger.ONE, Matchers.is(Anagrams.listPosition("A")));
        MatcherAssert.assertThat("Position for 'ABAB' incorrect", BigInteger.valueOf(2), Matchers.is(Anagrams.listPosition("ABAB")));
        MatcherAssert.assertThat("Position for 'AAAB' incorrect", BigInteger.ONE, Matchers.is(Anagrams.listPosition("AAAB")));
        MatcherAssert.assertThat("Position for 'BAAA' incorrect", BigInteger.valueOf(4), Matchers.is(Anagrams.listPosition("BAAA")));
        MatcherAssert.assertThat("Position for 'QUESTION' incorrect", BigInteger.valueOf(24572), Matchers.is(Anagrams.listPosition("QUESTION")));
        MatcherAssert.assertThat("Position for 'BOOKKEEPER' incorrect", BigInteger.valueOf(10743), Matchers.is(Anagrams.listPosition("BOOKKEEPER")));
    }
}
