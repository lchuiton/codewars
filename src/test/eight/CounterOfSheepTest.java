package eight;

import org.junit.Assert;
import org.junit.Test;

public class CounterOfSheepTest {
    private final Boolean[] array2 = {true, true, true, null, true, true, true, true, true, false, true, null, true, false, false, true, true, true, true, true, false, false,
            true, true};
    private final Boolean[] array1 = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false,
            false, true, true};

    @Test
    public void test() {
        Assert.assertEquals("There are 17 sheeps in total", 17, new CounterOfSheep().countSheeps(array1));
    }

    @Test
    public void test2() {
        Assert.assertEquals("There are 17 sheeps in total", 17, new CounterOfSheep().countSheeps(array2));
    }
}