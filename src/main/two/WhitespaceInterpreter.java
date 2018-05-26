package two;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class WhitespaceInterpreter {
    private static int instructionPointer;

    private static char[] tabCode;
    private static OutputStreamWriter writer;
    private static OutputStream output;

    private WhitespaceInterpreter() {

    }

    // transforms space characters to ['s','t','n'] chars;
    private static String unbleach(String code) {
        if (code != null) {
            String codeWithoutComment = code.replaceAll("\\S", "");
            String readableCode = codeWithoutComment.replaceAll(" ", "[space]").replace("\t", "[tab]").replace("\n",
                    "[line-feed]");
            System.out.println(readableCode);
        }
        return code != null ? code.replaceAll("\\S", "").replace(" ", "s").replace("\t", "t").replace("\n", "n") : null;
    }

    // solution
    public static String execute(String code, InputStream input, OutputStream output) {

        try {
            output.flush();
            writer = new OutputStreamWriter(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
        execute(code, input);
        String result = output.toString();
        try {
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    // solution
    public static String execute(String code, InputStream input) {
        String output = "";
        instructionPointer = 0;
        String unbleashedCode = unbleach(code);
        tabCode = unbleashedCode.toCharArray();
        Stack<Integer> stack = new Stack<>();
        // HEADER
        while (instructionPointer < tabCode.length) {

            if (tabCode[instructionPointer] == 's') {
                instructionPointer++;
                System.out.println("Stack Manipulation");
                stack = processStackManipulation(stack);
            } else if (tabCode[instructionPointer] == 't') {
                instructionPointer++;
                if (tabCode[instructionPointer] == 's') {
                    System.out.println("Arithmetic");

                } else if (tabCode[instructionPointer] == 't') {
                    System.out.println("Heap Access");

                } else if (tabCode[instructionPointer] == 'n') {
                    System.out.println("Input/Output");
                    output = output + processOutput(stack);
                }

            } else if (tabCode[instructionPointer] == 'n') {
                System.out.println("Flow Control");
                instructionPointer++;
                if (tabCode[instructionPointer] == 'n' && tabCode[instructionPointer + 1] == 'n') {
                    System.out.println("End Of Program");
                    break;
                }

            }
        }

        return output;
    }

    private static Stack<Integer> processStackManipulation(Stack<Integer> stack) {
        if (tabCode[instructionPointer] == 's') {
            instructionPointer++;
            System.out.println("Push n onto the stack");
            stack.add(processNumber());
            instructionPointer++;

        } else if (tabCode[instructionPointer] == 't') {
            if (tabCode[instructionPointer] == 's') {
                System.out.println("Duplicate nth value on the stack");

            } else if (tabCode[instructionPointer] == 'n') {
                System.out.println("Discard the top n value belowthe stack");
            }
        } else if (tabCode[instructionPointer] == 'n') {
        }

        return stack;

    }

    private static String processOutput(Stack<Integer> stack) {
        instructionPointer++;
        String result = "";
        if (tabCode[instructionPointer] == 's') {
            instructionPointer++;
            System.out.println("Write in output");
            if (tabCode[instructionPointer] == 's') {
                System.out.println("It's a character");
                result = String.valueOf((char) stack.pop().intValue());
            } else if (tabCode[instructionPointer] == 't') {
                System.out.println("It's a number");
                result = String.valueOf(stack.pop());

            }
            instructionPointer++;
        }
        if (output != null) {
            try {
                writer.write(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private static Integer processNumber() {
        String binaryNumber = "";
        while (tabCode[instructionPointer] != 'n') {
            if (tabCode[instructionPointer] == 's') {
                binaryNumber = binaryNumber + "0";
            } else {
                binaryNumber = binaryNumber + "1";

            }
            instructionPointer++;
        }

        int sign = binaryNumber.charAt(0) == '1' ? -1 : 1;
        Integer result = sign * Integer.parseInt(binaryNumber.substring(1), 2);

        if (output != null) {
            try {
                writer.write(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sign * Integer.parseInt(binaryNumber.substring(1), 2);
    }

    private static String processChar(String s) {

        return "";
    }
}
