package six;

import java.util.Arrays;
import java.util.List;

class PlayPass {

    private static final List<String> alphabet = Arrays
            .asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                    "V", "W", "X", "Y", "Z");

    private PlayPass() {

    }

    public static String playPass(String s, int n) {
        String passPhrase = s.toUpperCase();
        char[] charArray = passPhrase.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            if (Character.isAlphabetic(character)) {
                int indexOfChar = (alphabet.indexOf(String.valueOf(character)) + n) % 26;
                character = alphabet.get(indexOfChar).charAt(0);
                if (i % 2 != 0) {
                    character = Character.toLowerCase(character);
                }
            } else if (Character.isDigit(character)) {
                character = Character.forDigit(9 - Integer.valueOf(String.valueOf(character)), 10);
            }
            charArray[i] = character;

        }
        passPhrase = new String(charArray);
        StringBuilder passPhraseBuilder = new StringBuilder(passPhrase);

        return passPhraseBuilder.reverse().toString();
    }
}
