package five;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JosephusSurvivorTest {

    @Ignore
    @Test
    public void test1() {
        josephusTest(7, 3, 4);
    }

    @Ignore
    @Test
    public void test2() {
        josephusTest(11, 19, 10);
    }

    @Ignore
    @Test
    public void test3() {
        josephusTest(40, 3, 28);
    }

    @Ignore
    @Test
    public void test4() {
        josephusTest(14, 2, 13);
    }

    @Ignore
    @Test
    public void test5() {
        josephusTest(100, 1, 100);
    }

    private void josephusTest(int n, int k, int result) {
        String testDescription = String.format("Testing where n = %d and k = %d", n, k);
        assertEquals(testDescription, result, JosephusSurvivor.josephusSurvivor(n, k));
    }
}