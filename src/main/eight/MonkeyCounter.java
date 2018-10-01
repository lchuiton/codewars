package eight;

class MonkeyCounter {
    private MonkeyCounter() {

    }

    public static int[] monkeyCount(int n) {
        int[] monkeyTab = new int[n];
        for (int i = 1; i <= n; i++) {
            monkeyTab[i - 1] = i;
        }

        return monkeyTab;
    }
}
