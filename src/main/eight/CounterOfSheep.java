package eight;

import java.util.Arrays;

public class CounterOfSheep {

    public int countSheeps(Boolean[] array) {
        return (int) Arrays.stream(array).filter(e -> e != null && e).count();
    }

}