package six;

import java.util.ArrayList;
import java.util.List;

class SumSquaredDivisors {
    private SumSquaredDivisors() {

    }

    public static String listSquared(long m, long n) {
        List<String> result = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            List<Integer> liste = divisors(i);
            Integer test = sommeDesCarres(liste);
            if (isSquareInt(test)) {
                result.add("[" + i + ", " + test + "]");
            }
        }
        return result.toString();
    }

    private static Integer sommeDesCarres(List<Integer> liste) {
        int somme = 0;
        for (Integer integer : liste) {
            somme += integer * integer;
        }
        return somme;
    }

    private static List<Integer> divisors(long nombre) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                liste.add(i);
            }
        }

        return liste;

    }

    private static Boolean isSquareInt(double num) {
        double racineDeNum = Math.sqrt(num);

        return Double.compare(racineDeNum, Math.floor(racineDeNum)) == 0 && !Double.isInfinite(racineDeNum);
    }
}
