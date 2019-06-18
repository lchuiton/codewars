package six;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

class ModSystem {

    private static final String NOT_APPLICABLE = "Not applicable";

    private ModSystem() {

    }

    public static String fromNb2Str(int n, int[] sys) {
        StringBuilder builderResult = new StringBuilder();

        int sommeModuli = 1;
        for (int j : sys) {
            sommeModuli = j * sommeModuli;
            builderResult.append("-").append(n % j).append("-");

            if (!checkApplication(sys, j)) {
                return NOT_APPLICABLE;
            }

        }
        if (sommeModuli < n) {
            return NOT_APPLICABLE;
        }

        return builderResult.toString();
    }

    private static Boolean checkApplication(int[] sys, int j) {
        for (int k : sys) {
            if (k != j) {
                if (!coprime(k, j)) {
                    return FALSE;
                }
                if (k % j == 0) {
                    return FALSE;
                }
            }
        }
        return TRUE;
    }

    private static boolean coprime(int k, int j) {
        int plusPetit = k;
        if (j < k) {
            plusPetit = j;
        }

        for (int i = plusPetit; i > 0; i--) {
            if (k % i == 0 % i && j % i == 0 && i != 1) {
                return FALSE;
            }
        }
        return TRUE;
    }
}
