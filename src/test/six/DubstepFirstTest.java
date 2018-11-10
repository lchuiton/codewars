package six;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DubstepFirstTest {

  @Test
  public void Test0_A() {
    assertEquals("A", new DubstepFirst().songDecoder("A"));
  }

  @Test
  public void Test0_WU() {
    assertEquals("WU", new DubstepFirst().songDecoder("WU"));
  }

  @Test
  public void Test0_WUB() {
    assertEquals("", new DubstepFirst().songDecoder("WUB"));
  }

  @Test
  public void Test1() {
    assertEquals("ABC", new DubstepFirst().songDecoder("WUBWUBABCWUB"));
  }

  @Test
  public void Test2() {
    assertEquals("R L", new DubstepFirst().songDecoder("RWUBWUBWUBLWUB"));
  }

  @Test
  public void Test3() {
    assertEquals("R L L", new DubstepFirst().songDecoder("RWUBWUBWUBLWUBL"));
  }

  @Test
  public void Test4() {
    assertEquals("R LW UB", new DubstepFirst().songDecoder("RWUBWUBWUBLWWUBUB"));
  }

  @Test
  public void Test5() {
    assertEquals("A B C", new DubstepFirst().songDecoder("WUBAWUBBWUBCWUB"));
  }

  @Test
  public void Test6() {
    assertEquals("KSDHEMIXUJ R S H", new DubstepFirst().songDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
  }
}
