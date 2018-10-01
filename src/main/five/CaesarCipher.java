package five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CaesarCipher {

    private static final List<String> alphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z");

    private static int initialPathing;

    private CaesarCipher() {

    }

    public static List<String> movingShift(String s, int shift) {
        initialPathing = shift;
        String[] splitedMessage = splitMessage(s);
        List<String> messageCode = new ArrayList<>();

        for (String stringACoder : splitedMessage) {
            messageCode.add(encodeCaesar(stringACoder));
        }

        return messageCode;
    }

    private static String encodeCaesar(String stringACoder) {

        char[] tableau = stringACoder.toCharArray();
        StringBuilder encoded = new StringBuilder();
        for (char c : tableau) {
            boolean isMinuscule = Character.isLowerCase(c);

            if (alphabet.contains(String.valueOf(c)) || alphabet.contains(String.valueOf(c).toUpperCase())) {
                int indexAlphabet = (alphabet.indexOf(String.valueOf(c).toUpperCase()) + initialPathing) % 26;
                encoded.append(isMinuscule ? alphabet.get(indexAlphabet).toLowerCase() : alphabet.get(indexAlphabet));
            } else {
                encoded.append(c);
            }
            initialPathing += 1;
        }

        return encoded.toString();
    }

    private static String[] splitMessage(String s) {
        String[] result = new String[5];

        int longueurSplit = calculLongueurSplit(s.length());
        for (int i = 0; i < 4; i++) {
            result[i] = s.substring(i * longueurSplit, i * longueurSplit + longueurSplit);
        }
        result[4] = s.substring(4 * longueurSplit);

        return result;
    }

    private static int calculLongueurSplit(int length) {
        if (length % 5 == 0) {
            return length / 5;
        }
        return (length / 5) + 1;
    }

    public static String demovingShift(List<String> s, int shift) {
        StringBuilder messageReconstitueCrypte = new StringBuilder();
        initialPathing = shift;
        for (String fragmentDeMessage : s) {
            messageReconstitueCrypte.append(fragmentDeMessage);
        }

        return decodeCaesar(messageReconstitueCrypte.toString());

    }

    private static String decodeCaesar(String stringADecoder) {

        char[] tableau = stringADecoder.toCharArray();
        StringBuilder decoded = new StringBuilder();
        for (char c : tableau) {
            boolean isMinuscule = Character.isLowerCase(c);

            if (alphabet.contains(String.valueOf(c)) || alphabet.contains(String.valueOf(c).toUpperCase())) {
                int indexAlphabet = (alphabet.indexOf(String.valueOf(c).toUpperCase()) - initialPathing) % 26;
                while (indexAlphabet < 0) {
                    indexAlphabet += 26;
                }
                decoded.append(isMinuscule ? alphabet.get(indexAlphabet).toLowerCase() : alphabet.get(indexAlphabet));
            } else {
                decoded.append(c);
            }
            initialPathing += 1;
        }

        return decoded.toString();
    }
}
