package six;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.TestGenerator;
import util.TestGenerator.TypeEnum;


public class FindUniqueTest {

  TestGenerator testGenerator;
  private double precision = 0.0000000000001;

  @Before
  public void setup() {
    testGenerator = new TestGenerator(TypeEnum.DOUBLE);
  }

  @Test
  public void sampleTestCases() {
    Assert.assertEquals(1.0, FindUnique.findUniq(new double[]{0, 1, 0}), precision);
    Assert.assertEquals(2.0, FindUnique.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
  }

  @Test
  public void testCases() {

    double[] testCase = testGenerator.generateDoubleArray(10);
    Assert.assertThat(FindUnique.findUniq(testCase), CoreMatchers.equalTo(testCase[testCase.length - 1]));

  }


  @Test
  public void test_largeArray() {

    double[] testCase = testGenerator.generateDoubleArray(100);
    Assert.assertThat(FindUnique.findUniq(testCase), CoreMatchers.equalTo(testCase[testCase.length - 1]));

  }


  @Test
  public void test_veryLargeArray() {

    double[] testCase = testGenerator.generateDoubleArray(10000);
    Assert.assertThat(FindUnique.findUniq(testCase), CoreMatchers.equalTo(testCase[testCase.length - 1]));

  }
}