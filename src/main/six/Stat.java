package six;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.math.BigInteger.ZERO;

class Stat {

    private static final BigInteger MINUTE_EN_SECONDES = new BigInteger("60");

    private static final BigInteger HEURE_EN_SECONDES = new BigInteger("3600");

    private Stat() {

    }

    public static String stat(String strg) {
        if ("".equals(strg)) {
            return strg;
        }
        List<String> strgTemps = Arrays.asList(strg.split(", "));

        List<BigInteger> listeDesTemps = calculDesTempsEnSecondes(strgTemps);
        BigInteger range = calculateRange(listeDesTemps);
        BigInteger average = calculateAverage(listeDesTemps);
        BigInteger median = calculateMedian(listeDesTemps);
        return "Range: " + format(range) + " Average: " + format(average) + " Median: " + format(median);
    }

    private static BigInteger calculateRange(List<BigInteger> listeDesTemps) {
        BigInteger tempsMinimum = listeDesTemps.get(0);
        BigInteger tempsMaximum = listeDesTemps.get(0);

        for (int i = 1; i < listeDesTemps.size(); i++) {
            tempsMinimum = tempsMinimum.min(listeDesTemps.get(i));
            tempsMaximum = tempsMaximum.max(listeDesTemps.get(i));
        }
        return tempsMaximum.subtract(tempsMinimum);
    }

    private static BigInteger calculateAverage(List<BigInteger> listeDesTemps) {
        BigInteger sommeDesTemps = ZERO;

        for (BigInteger temps : listeDesTemps) {
            sommeDesTemps = sommeDesTemps.add(temps);
        }
        return sommeDesTemps.divide(BigInteger.valueOf(listeDesTemps.size()));
    }

    private static BigInteger calculateMedian(List<BigInteger> listeDesTemps) {

        listeDesTemps.sort(BigInteger::compareTo);

        int indexValeurMediane = listeDesTemps.size() / 2;
        if (listeDesTemps.size() % 2 != 0) {
            return listeDesTemps.get(indexValeurMediane);
        }
        return (listeDesTemps.get(indexValeurMediane).add(listeDesTemps.get(indexValeurMediane - 1))).divide(new BigInteger("2"));

    }

    private static List<BigInteger> calculDesTempsEnSecondes(List<String> strgTemps) {
        List<BigInteger> listeDesTemps = new ArrayList<>();

        for (String temps : strgTemps) {
            String[] tempsDecompose = temps.split("\\|");

            BigInteger heure = new BigInteger(tempsDecompose[0]).multiply(HEURE_EN_SECONDES);
            BigInteger minutes = new BigInteger(tempsDecompose[1]).multiply(MINUTE_EN_SECONDES);
            BigInteger secondes = new BigInteger(tempsDecompose[2]);
            listeDesTemps.add(heure.add(minutes).add(secondes));
        }

        return listeDesTemps;
    }

    private static String format(BigInteger rangeInteger) {
        String heures = formatLength(rangeInteger.divide(HEURE_EN_SECONDES).toString());
        String minutes = formatLength(rangeInteger.mod(HEURE_EN_SECONDES).divide(MINUTE_EN_SECONDES).toString());
        String secondes = formatLength(rangeInteger.mod(HEURE_EN_SECONDES).mod(MINUTE_EN_SECONDES).toString());
        return heures + "|" + minutes + "|" + secondes;
    }

    private static String formatLength(String time) {
        return time.length() == 1 ? "0" + time : time;
    }
}
