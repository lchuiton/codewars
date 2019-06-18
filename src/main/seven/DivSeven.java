package seven;

class DivSeven {

    public static long[] seven(long m) {
        if (m == 0) {
            return new long[]{0, 0};
        }

        long x = m / 10;
        long y = m % 10;

        long seven = x - 2 * y;
        int step = 1;

        while (seven > 99) {
            x = seven / 10;
            y = seven % 10;
            seven = x - 2 * y;
            step++;
        }
        return new long[]{seven, step};
    }
}
