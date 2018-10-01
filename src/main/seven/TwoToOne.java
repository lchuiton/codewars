package seven;

import java.util.Arrays;

class TwoToOne {
    private TwoToOne() {

    }

    public static String longest(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder(s1).append(s2);
        char[] charArray = stringBuilder.toString().toCharArray();
        Arrays.sort(charArray);
        stringBuilder = new StringBuilder();
        for (char aCharArray : charArray) {
            if (stringBuilder.indexOf(String.valueOf(aCharArray)) == -1) {
                stringBuilder.append(aCharArray);
            }
        }

        return stringBuilder.toString();
    }
}
