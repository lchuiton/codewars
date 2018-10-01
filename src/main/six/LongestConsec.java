package six;

class LongestConsec {
    private LongestConsec() {

    }

    public static String longestConsec(String[] strarr, int k) {
        int nombreDeMot = strarr.length;
        if (nombreDeMot != 0 && k <= nombreDeMot && k > 0) {
            String longestString = "";
            for (int i = 0; i < strarr.length; i++) {

                String stringToTest = concatNextSeq(strarr, i, k);
                if (stringToTest.length() > longestString.length()) {
                    longestString = stringToTest;
                }
            }

            return longestString;
        }

        return "";

        // your code
    }

    private static String concatNextSeq(String[] strarr, int debut, int nbMot) {
        StringBuilder builder = new StringBuilder();
        for (int i = debut; i < debut + nbMot; i++) {
            if (i < strarr.length) {
                builder.append(strarr[i]);
            }
        }
        return builder.toString();
    }
}
