package six;

import java.util.Arrays;

public class RoboScript {

    // https://www.codewars.com/kata/58708934a44cfccca60000c4/train/java?collection=roboscript
    private static final String INIT = "";

    public static String highlight(String code) {
        String previousChar = INIT;
        StringBuilder result = new StringBuilder();
        String[] est = code.split("");
        for (String e : est) {
            if (!Arrays.asList("(", ")").contains(previousChar) && !e.equals(previousChar) && !previousChar.equals(INIT) && !(e.matches("[0-9]") && previousChar.matches("[0-9]"))) {
                result.append("</span>");
            }

            if (!e.equals(previousChar)) {
                switch (e) {
                    case "F":
                        result.append("<span style=\"color: pink\">");
                        break;
                    case "L":
                        result.append("<span style=\"color: red\">");
                        break;
                    case "R":
                        result.append("<span style=\"color: green\">");
                        break;
                    default:
                        if (e.matches("[0-9]") && !previousChar.matches("[0-9]")) {
                            result.append("<span style=\"color: orange\">");
                        }
                        break;
                }
            }
            result.append(e);

            previousChar = e;
        }
        result.append("</span>");

        return result.toString();

    }

    private static String formatCode(String pieceOfCode) {
        String formattedPieceOfCode = pieceOfCode;


        return formattedPieceOfCode;
    }
}
