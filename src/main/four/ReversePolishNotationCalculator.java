package four;

class ReversePolishNotationCalculator {

  private static final String REGEX = "[+-/*]";
  private static final String SPACE = " ";

  public Double evaluate(String expr) {
    Double result = Double.valueOf("0");

    if (!"".equals(expr)) {
      String[] splitExpre = expr.trim().split(SPACE);
      int indexOfNextOperation = searchNextOperator(splitExpre);

      while (indexOfNextOperation > -1) {
        String expressionIntermediaire = computeOperationAtIndex(indexOfNextOperation, splitExpre);
        splitExpre = expressionIntermediaire.trim().split(SPACE);
        indexOfNextOperation = searchNextOperator(splitExpre);
      }
      result = Double.valueOf(splitExpre[splitExpre.length - 1]);
    }

    return result;
  }

  private String computeOperationAtIndex(int indexOfNextOperation, String[] splitExpre) {
    String sign = splitExpre[indexOfNextOperation];

    Double firstOperand = Double.valueOf(splitExpre[indexOfNextOperation - 2]);
    Double secondOperand = Double.valueOf(splitExpre[indexOfNextOperation - 1]);

    if ("+".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(firstOperand + secondOperand);
    } else if ("-".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(firstOperand - secondOperand);
    } else if ("*".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(firstOperand * secondOperand);
    } else if ("/".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(firstOperand / secondOperand);
    }

    StringBuilder test = new StringBuilder();
    for (int i = 0; i < splitExpre.length; i++) {

      if (i != indexOfNextOperation - 1 && i != indexOfNextOperation) {
        if (i > 0) {
          test.append(" ");
        }
        test.append(splitExpre[i]);
      }
    }

    return test.toString();
  }

  private int searchNextOperator(String[] splitExpression) {
    for (int i = 0; i < splitExpression.length; i++) {
      if (splitExpression[i].matches(REGEX)) {
        return i;
      }
    }

    return -1;
  }
}
