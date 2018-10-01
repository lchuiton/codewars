package five;

class TrailingZeros {
    private TrailingZeros() {

    }

    public static int zeros(int n) {

        int facteur = 5;
        int nombreDeZero = 0;
        while (n / facteur > 0) {

            nombreDeZero += n / facteur;
            facteur *= 5;
        }

        return nombreDeZero;
    }

}
