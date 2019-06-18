package util;

import java.util.HashMap;
import java.util.Map;

public enum MorseCode {
    // @formatter:off
    MORSE_POINT(".-.-.--", "."),
    MORSE_VIRGULE("--..--", ","),
    MORSE_A(".-", "A"),
    MORSE_B("-...", "B"),
    MORSE_C("-.-.", "C"),
    MORSE_D("-..", "D"),
    MORSE_E(".", "E"),
    MORSE_F("..-.", "F"),
    MORSE_G("--.", "G"),
    MORSE_H("....", "H"),
    MORSE_I("..", "I"),
    MORSE_J(".---", "J"),
    MORSE_K("-.-", "K"),
    MORSE_L(".-..", "L"),
    MORSE_M("--", "M"),
    MORSE_N("-.", "N"),
    MORSE_O("---", "O"),
    MORSE_P(".--.", "P"),
    MORSE_Q("--.-", "Q"),
    MORSE_R(".-.", "R"),
    MORSE_S("...", "S"),
    MORSE_T("-", "T"),
    MORSE_U("..-", "U"),
    MORSE_V("...-", "V"),
    MORSE_W(".--", "W"),
    MORSE_X("-..-", "X"),
    MORSE_Y("-.--", "Y"),
    MORSE_Z("--..", "Z"),
    MORSE_1(".----", "1"),
    MORSE_2("..---", "2"),
    MORSE_3("...--", "3"),
    MORSE_4("....-", "4"),
    MORSE_5(".....", "5"),
    MORSE_6("-....", "6"),
    MORSE_7("--...", "7"),
    MORSE_8("---..", "8"),
    MORSE_9("----.", "9"),
    MORSE_0("-----", "0");
// @formatter:on

    private static final Map<String, MorseCode> lookup = new HashMap<>();

    static {
        for (MorseCode d : MorseCode.values()) {
            lookup.put(d.getCode(), d);
        }
    }

    private String letter;
    private String code;

    MorseCode(String code, String letter) {
        this.code = code;
        this.letter = letter;
    }

    public static String get(String morseCode) {
        return lookup.get(morseCode).getLetter();
    }

    private String getLetter() {
        return letter;
    }

    private String getCode() {
        return code;
    }
}
