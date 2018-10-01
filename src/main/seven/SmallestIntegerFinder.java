package seven;

import java.util.Arrays;

class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
