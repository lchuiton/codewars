package four;

import util.MorseCode;

public class MorseCodeDecoder {
  private static final char CH_1 = '1';

  private MorseCodeDecoder() {

  }

  public static String decodeMorse(String morseCode) {

    StringBuilder result = new StringBuilder();
    for (String word : morseCode.trim().split("   ")) {
      for (String letter : word.split("\\s+")) {
        result.append(MorseCode.get(letter));
      }
      // Hack pour éviter les suites de T T TTT TTT à la fin de la phrase ...
      if (result.indexOf(".") >= 0) {
        break;
      }
      result.append(Character.toString(' '));
    }
    return result.toString().trim();
  }

  public static String decodeBits(String bitCode) {
    String bitCodeSansEspace = prepareBitCode(bitCode);
    int timeUnit = getTimeUnit(bitCodeSansEspace);
    int zerosEntreMots = timeUnit * 7;
    String[] bitsMots = bitCodeSansEspace.split("0{" + zerosEntreMots + "}+");
    StringBuilder morseCode = new StringBuilder();
    for (String bitsMot : bitsMots) {
      if (!"".equals(bitsMot)) {
        morseCode.append(decodeMotBits(bitsMot, timeUnit) + "   ");
      }
    }
    return morseCode.toString().trim();
  }

  private static String prepareBitCode(String bitCode) {
    String chaine = bitCode.replaceAll(" ", "");
    if (chaine.lastIndexOf(CH_1) == chaine.length()) {
      return chaine.substring(chaine.indexOf(CH_1));
    } else {
      return chaine.substring(chaine.indexOf(CH_1), chaine.lastIndexOf(CH_1) + 1);
    }
  }

  private static String decodeMotBits(String bitsWord, int timeUnit) {
    int zerosEntreLettres = timeUnit * 3;
    String[] bitsLetters = bitsWord.split("0{" + zerosEntreLettres + "}+");
    StringBuilder morseCode = new StringBuilder();
    for (String bitsLetter : bitsLetters) {
      if (!"".equals(bitsLetter)) {
        morseCode.append(decodeLetterBits(bitsLetter, timeUnit) + " ");
      }
    }
    return morseCode.toString().trim();

  }

  private static String decodeLetterBits(String bitsLetter, int timeUnit) {
    String[] bitsPointsDashs = bitsLetter.split("0");
    StringBuilder morseLetter = new StringBuilder();

    for (String bitsOnes : bitsPointsDashs) {
      if (!bitsOnes.isEmpty()) {
        if (bitsOnes.length() < 3 * timeUnit) {
          morseLetter.append(".");
        } else {
          morseLetter.append("-");
        }
      }
    }
    return morseLetter.toString();
  }

  private static int getTimeUnit(String bitCode) {
    String[] tableauDesUns = bitCode.split("0");
    int timeUnitUn = nombreDeCaractereIdentiqueConsecutif(tableauDesUns);

    String[] tableauDesZeros = bitCode.split("1");
    int timeUnitZero = nombreDeCaractereIdentiqueConsecutif(tableauDesZeros, timeUnitUn);

    return Math.min(timeUnitUn, timeUnitZero);
  }

  private static int nombreDeCaractereIdentiqueConsecutif(String[] tableauDeCaracteres) {
    return nombreDeCaractereIdentiqueConsecutif(tableauDeCaracteres, 0);
  }

  private static int nombreDeCaractereIdentiqueConsecutif(String[] tableauDesUns, int previousTimeUnit) {
    int timeUnit = previousTimeUnit;
    for (int i = 0; i < tableauDesUns.length; i++) {
      if (!tableauDesUns[i].trim().isEmpty()) {
        if (timeUnit > 0) {
          timeUnit = Math.min(timeUnit, tableauDesUns[i].trim().length());
        } else {
          timeUnit = tableauDesUns[i].length();
        }
      }
    }
    return timeUnit;
  }
}
