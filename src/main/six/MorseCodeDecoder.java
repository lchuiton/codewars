package six;

import util.MorseCode;

class MorseCodeDecoder {

    private static final String SPACE = " ";

    private MorseCodeDecoder() {

    }

    public static String decode(String morseCode) {
        String[] mots = morseCode.split(SPACE + SPACE + SPACE);

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < mots.length; i++) {
            if (i > 0 && !"".equals(message.toString().trim())) {
                message.append(SPACE);
            }
            String mot = mots[i];
            String[] letters = mot.split(SPACE);

            for (String letter : letters) {
                if (MorseCode.get(letter) != null) {
                    message.append(MorseCode.get(letter));
                }
            }
        }
        return message.toString();
    }
}
