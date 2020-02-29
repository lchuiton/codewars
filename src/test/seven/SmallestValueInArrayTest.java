package seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestValueInArrayTest {

  @Test
  public void testSample() {
    assertEquals(
        "The smallest index", 0, SmallestValueInArray.findSmallest(new int[] {1, 2, 3}, "index"));
    assertEquals(
        "The smallest value",
        2,
        SmallestValueInArray.findSmallest(new int[] {7, 12, 3, 2, 27}, "value"));
    assertEquals(
        "The smallest index",
        3,
        SmallestValueInArray.findSmallest(new int[] {7, 12, 3, 2, 27}, "index"));
  }
}
