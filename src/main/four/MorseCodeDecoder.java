package four;

import util.MorseCode;

class MorseCodeDecoder {

  private static final String SPACE = " ";
  private static final char CH_1 = '1';

  private MorseCodeDecoder() {}

  public static String decodeMorse(String morseCode) {

    StringBuilder result = new StringBuilder();
    for (String word : morseCode.trim().split(SPACE + SPACE + SPACE)) {
      for (String letter : word.split("\\s+")) {
        result.append(MorseCode.get(letter));
      }

      if (result.indexOf(".") >= 0) {
        break;
      }
      result.append(Character.toString(' '));
    }
    return result.toString().trim();
  }

  public static String decodeBits(String bitCode) {
    String byteCodeWithoutSpace = prepareBitCode(bitCode);
    int timeUnit = getTimeUnit(byteCodeWithoutSpace);
    String zeros = createPattern(timeUnit * 7);
    String[] bitsMots = byteCodeWithoutSpace.split(zeros + "+");

    StringBuilder morseCode = new StringBuilder();
    for (String bitsMot : bitsMots) {
      if (!"".equals(bitsMot)) {
        morseCode.append(decodeByteWord(bitsMot, timeUnit)).append("   ");
      }
    }
    return morseCode.toString().trim();
  }

  private static String prepareBitCode(String bitCode) {
    String result = bitCode.replaceAll(SPACE, "");
    if (result.lastIndexOf(CH_1) == result.length()) {
      return result.substring(result.indexOf(CH_1));
    } else {
      return result.substring(result.indexOf(CH_1), result.lastIndexOf(CH_1) + 1);
    }
  }

  private static String decodeByteWord(String byteWord, int timeUnit) {
    String zeros = createPattern(timeUnit * 3);
    String[] bitsLetters = byteWord.split(zeros + "+");
    StringBuilder morseCode = new StringBuilder();
    for (String bitsLetter : bitsLetters) {
      if (!"".equals(bitsLetter)) {
        morseCode.append(decodeLetterBits(bitsLetter, timeUnit)).append(SPACE);
      }
    }
    return morseCode.toString().trim();
  }

  private static String createPattern(int zerosBetweenLetters) {
    StringBuilder sBuilder = new StringBuilder();

    for (int i = 0; i < zerosBetweenLetters; i++) {
      sBuilder.append(0);
    }

    return sBuilder.toString();
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
    int timeUnitUn = numberOfIdenticalConsecutiveCharacter(tableauDesUns);

    String[] tableauDesZeros = bitCode.split("1");
    int timeUnitZero = numberOfIdenticalConsecutiveCharacter(tableauDesZeros, timeUnitUn);

    return Math.min(timeUnitUn, timeUnitZero);
  }

  private static int numberOfIdenticalConsecutiveCharacter(String[] tableauDeCaracteres) {
    return numberOfIdenticalConsecutiveCharacter(tableauDeCaracteres, 0);
  }

  private static int numberOfIdenticalConsecutiveCharacter(
      String[] tableauDesUns, int previousTimeUnit) {
    int timeUnit = previousTimeUnit;
    for (String tableauDesUn : tableauDesUns) {
      if (!tableauDesUn.trim().isEmpty()) {
        if (timeUnit > 0) {
          timeUnit = Math.min(timeUnit, tableauDesUn.trim().length());
        } else {
          timeUnit = tableauDesUn.length();
        }
      }
    }
    return timeUnit;
  }
}
