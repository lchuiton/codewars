package seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNextSquareTest {

  @Test
  public void test1() {
    assertEquals(144, FindNextSquare.findNextSquare(121));
  }

  @Test
  public void test2() {
    assertEquals(676, FindNextSquare.findNextSquare(625));
  }

  @Test
  public void test3() {
    assertEquals(-1, FindNextSquare.findNextSquare(114));
  }

}