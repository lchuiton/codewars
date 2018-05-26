package seven;

import util.Fighter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhoIsTheWinnerTest {
  @Test
  public void test1() {
    assertEquals(WhoIsTheWinner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"), "Lew");
  }

  @Test
  public void test2() {
    assertEquals(WhoIsTheWinner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"), "Harry");
  }

  @Test
  public void test3() {
    assertEquals(WhoIsTheWinner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"), "Harald");
  }

  @Test
  public void test4() {
    assertEquals(WhoIsTheWinner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"), "Harald");
  }

  @Test
  public void test5() {
    assertEquals(WhoIsTheWinner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"), "Harald");
  }

  @Test
  public void test6() {
    assertEquals(WhoIsTheWinner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"), "Harald");
  }
}
