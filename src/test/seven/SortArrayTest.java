package seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortArrayTest {

  @Test
  public void testIntArray() {
    int[] ai = {1, 2, 3};
    int[] uai = {2, 3, 1};
    assertEquals(ai[0], SortArray.sortArray(uai)[0]);
    assertEquals(ai[1], SortArray.sortArray(uai)[1]);
    assertEquals(ai[2], SortArray.sortArray(uai)[2]);
  }

  @Test
  public void testIntegerArrays() {
    Integer[] ai = {1, 2, 3};
    Integer[] uai = {2, 3, 1};
    assertEquals(ai[0], SortArray.sortArray(uai)[0]);
    assertEquals(ai[1], SortArray.sortArray(uai)[1]);
    assertEquals(ai[2], SortArray.sortArray(uai)[2]);
  }
}
