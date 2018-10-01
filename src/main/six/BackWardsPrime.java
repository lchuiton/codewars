package six;

import static util.MathUtil.isPrimeNumber;

class BackWardsPrime {
    private BackWardsPrime() {

    }

    public static String backwardsPrime(int start, int end) {
        StringBuilder resultat = new StringBuilder();
        for (int number = start; number <= end; number++) {
            if (number > 10 && isPrimeNumber(number)) {
                String numberInString = String.valueOf(number);
                int reverseNumber = Integer.valueOf(reverseString(numberInString));

                if (reverseNumber != number && isPrimeNumber(reverseNumber)) {
                    resultat.append(createResult(resultat, numberInString));
                }
            }
        }
        return resultat.toString();
    }

    private static String createResult(StringBuilder resultat, String numberInString) {
        if (resultat.length() > 0) {
            return " " + numberInString;
        }
        return numberInString;
    }

    private static String reverseString(String numberInString) {
        StringBuilder resultReverse = new StringBuilder();
        for (int i = numberInString.length() - 1; i >= 0; i--) {
            resultReverse.append(numberInString.charAt(i));
        }

        return resultReverse.toString();
    }

}
