package six;

class BitCounting {
    public static int countBits(int n) {
        return Integer.toBinaryString(n).replace("0", "").length();
    }

    public static int countBits2(int n) {
        return Integer.bitCount(n);
    }
}
