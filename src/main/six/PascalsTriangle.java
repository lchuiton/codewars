package six;

class PascalsTriangle {

    private PascalsTriangle() {

    }

    public static int[][] pascal(int depth) {

        int[][] pascalTriangle = new int[depth][];
        for (int i = 0; i < depth; i++) {
            int[] pascalLigne = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i > 0) {
                    if (j > 0 && j < pascalLigne.length) {
                        int a = pascalTriangle[i - 1][j - 1];
                        int b = 0;
                        if (pascalTriangle[i - 1].length > j) {
                            b = pascalTriangle[i - 1][j];
                        }

                        pascalLigne[j] = a + b;
                    } else {
                        pascalLigne[j] = 1;
                    }

                } else {
                    pascalLigne[j] = 1;
                }
            }
            pascalTriangle[i] = pascalLigne;
        }
        return pascalTriangle;
    }
}
