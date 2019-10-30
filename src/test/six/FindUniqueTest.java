package six;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
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
        MatcherAssert.assertThat(1.0, CoreMatchers.equalTo(FindUnique.findUniq(new double[]{0, 1, 0})));
        MatcherAssert.assertThat(2.0, CoreMatchers.equalTo(FindUnique.findUniq(new double[]{1, 1, 1, 2, 1, 1})));
    }

    @Test
    public void testCases() {

        double[] testCase = testGenerator.generateDoubleArray(10);
        MatcherAssert.assertThat(FindUnique.findUniq(testCase), CoreMatchers.equalTo(testCase[testCase.length - 1]));

    }


    @Test
    public void test_largeArray() {

        double[] testCase = testGenerator.generateDoubleArray(100);
        MatcherAssert.assertThat(FindUnique.findUniq(testCase), CoreMatchers.equalTo(testCase[testCase.length - 1]));

    }


    @Test
    public void test_veryLargeArray() {

        double[] testCase = testGenerator.generateDoubleArray(10000);
        MatcherAssert.assertThat(FindUnique.findUniq(testCase), CoreMatchers.equalTo(testCase[testCase.length - 1]));

    }
}