package three;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {

  @Before
  public void setup() {

  }

  @Test
  public void testBasic() {

    assertEquals("Position for 'ABC' incorrect", BigInteger.valueOf(1), Anagrams.listPosition("ABC"));
    assertEquals("Position for 'ACB' incorrect", BigInteger.valueOf(2), Anagrams.listPosition("ACB"));
    assertEquals("Position for 'BAC' incorrect", BigInteger.valueOf(3), Anagrams.listPosition("BAC"));
    assertEquals("Position for 'BCA' incorrect", BigInteger.valueOf(4), Anagrams.listPosition("BCA"));
    assertEquals("Position for 'CAB' incorrect", BigInteger.valueOf(5), Anagrams.listPosition("CAB"));
    assertEquals("Position for 'CBA' incorrect", BigInteger.valueOf(6), Anagrams.listPosition("CBA"));
  }

  @Test
  public void testBasicDoublon() {

    assertEquals("Position for 'ABA' incorrect", BigInteger.valueOf(2), Anagrams.listPosition("ABA"));
    assertEquals("Position for 'BAA' incorrect", BigInteger.valueOf(3), Anagrams.listPosition("BAA"));
    assertEquals("Position for 'AAB' incorrect", BigInteger.ONE, Anagrams.listPosition("AAB"));
  }

  @Test
  public void complexeSansDoublon() {
    assertEquals("Position for 'QUESTION' incorrect", BigInteger.valueOf(24572), Anagrams.listPosition("QUESTION"));
  }

  @Test
  public void testKnownInputs() {

    assertEquals("Position for 'A' incorrect", BigInteger.ONE, Anagrams.listPosition("A"));
    assertEquals("Position for 'ABAB' incorrect", BigInteger.valueOf(2), Anagrams.listPosition("ABAB"));
    assertEquals("Position for 'AAAB' incorrect", BigInteger.ONE, Anagrams.listPosition("AAAB"));
    assertEquals("Position for 'BAAA' incorrect", BigInteger.valueOf(4), Anagrams.listPosition("BAAA"));
    assertEquals("Position for 'QUESTION' incorrect", BigInteger.valueOf(24572), Anagrams.listPosition("QUESTION"));
    assertEquals("Position for 'BOOKKEEPER' incorrect", BigInteger.valueOf(10743), Anagrams.listPosition("BOOKKEEPER"));
  }
}
