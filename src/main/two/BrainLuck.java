package two;

public class BrainLuck {
  private char[] instructions;

  private int[] dataStack = new int[50];

  private int instructionPointer = 0;

  private int dataPointer = 0;

  public BrainLuck(String code) {
    instructions = code.toCharArray();

  }

  public String process(String input) {
    StringBuilder result = new StringBuilder();
    int readedBit = 0;
    int[] dataTab = createDataTab(input);

    while (instructionPointer < instructions.length) {

      String instruction = traiteCurrentInstruction();
      if (",".equals(instruction)) {
        if (readedBit < dataTab.length) {
          dataStack[dataPointer] = dataTab[readedBit];
          readedBit++;
        }
      } else if (".".equals(instruction)) {
        result.append(String.valueOf((char) dataStack[dataPointer]));
      } else if ("+".equals(instruction)) {
        dataStack[dataPointer]++;
        dataStack[dataPointer] = dataStack[dataPointer] % 256;
      } else if ("-".equals(instruction)) {
        dataStack[dataPointer]--;
      } else if ("[".equals(instruction)) {
        if (dataStack[dataPointer] == 0) {
          instructionPointer = indexFinDeBoucle() - 1;
        }
      } else if ("]".equals(instruction)) {
        if (dataStack[dataPointer] != 0) {
          instructionPointer = indexDebutDeBoucle() - 1;
        }
      } else if (">".equals(instruction)) {
        dataPointer++;
      } else if ("<".equals(instruction)) {
        dataPointer--;
      }
      instructionPointer++;

    }
    return result.toString();
  }

  private int indexDebutDeBoucle() {
    int i = instructionPointer;
    int numeroBoucle = 1;
    while (numeroBoucle > 0) {
      i--;
      if (instructions[i] == ']') {
        numeroBoucle++;
      }
      if (instructions[i] == '[') {
        numeroBoucle--;
      }
    }
    return i;
  }

  private int indexFinDeBoucle() {
    int i = instructionPointer;
    int numeroBoucle = 1;
    while (numeroBoucle > 0) {
      i++;
      if (instructions[i] == '[') {
        numeroBoucle++;
      }
      if (instructions[i] == ']') {
        numeroBoucle--;
      }
    }
    return i;
  }

  private int[] createDataTab(String input) {
    char[] inputChars = input.toCharArray();
    int[] data = new int[inputChars.length];
    for (int i = 0; i < data.length; i++) {
      data[i] = (int) inputChars[i];
    }
    return data;
  }

  private String traiteCurrentInstruction() {
    return String.valueOf(instructions[instructionPointer]);
  }

}
