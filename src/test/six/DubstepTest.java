package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DubstepTest {
  @Test
  public void Test0_A() {
    assertEquals("A", new Dubstep().songDecoder("A"));
  }

  @Test
  public void Test0_WU() {
    assertEquals("WU", new Dubstep().songDecoder("WU"));
  }

  @Test
  public void Test0_WUB() {
    assertEquals("", new Dubstep().songDecoder("WUB"));
  }

  @Test
  public void Test1() {
    assertEquals("ABC", new Dubstep().songDecoder("WUBWUBABCWUB"));
  }

  @Test
  public void Test2() {
    assertEquals("R L", new Dubstep().songDecoder("RWUBWUBWUBLWUB"));
  }

  @Test
  public void Test3() {
    assertEquals("R L L", new Dubstep().songDecoder("RWUBWUBWUBLWUBL"));
  }

  @Test
  public void Test4() {
    assertEquals("R LW UB", new Dubstep().songDecoder("RWUBWUBWUBLWWUBUB"));
  }

  @Test
  public void Test5() {
    assertEquals("A B C", new Dubstep().songDecoder("WUBAWUBBWUBCWUB"));
  }

  @Test
  public void Test6() {
    assertEquals("KSDHEMIXUJ R S H", new Dubstep().songDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
  }
}
