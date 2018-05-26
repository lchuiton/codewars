package six;

import util.MorseCode;

public class MorseCodeDecoder {
  private MorseCodeDecoder() {

  }

  public static String decode(String morseCode) {
    String[] mots = morseCode.split("   ");

    StringBuilder message = new StringBuilder();

    for (int i = 0; i < mots.length; i++) {
      if (i > 0 && !"".equals(message.toString().trim())) {
        message.append(" ");
      }
      String mot = mots[i];
      String[] lettres = mot.split(" ");

      for (int j = 0; j < lettres.length; j++) {
        String lettre = lettres[j];
        if (MorseCode.get(lettre) != null) {
          message.append(MorseCode.get(lettre));
        }
      }
    }
    return message.toString();
  }
}
