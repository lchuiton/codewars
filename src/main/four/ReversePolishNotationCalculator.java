package four;

public class ReversePolishNotationCalculator {

  public Double evaluate(String expr) {
    Double result = new Double("0");

    if (!"".equals(expr)) {
      String[] splitExpre = expr.trim().split(" ");
      int indexOfNextOperation = searchNextOperator(splitExpre);

      while (indexOfNextOperation > -1) {
        String expressionIntermediaire = computeOperationAtIndex(indexOfNextOperation, splitExpre);
        splitExpre = expressionIntermediaire.trim().split(" ");
        indexOfNextOperation = searchNextOperator(splitExpre);

      }
      result = new Double(splitExpre[splitExpre.length - 1]);
    }

    return result;
  }

  private String computeOperationAtIndex(int indexOfNextOperation, String[] splitExpre) {
    String sign = splitExpre[indexOfNextOperation];

    Double premierOperande = Double.valueOf(splitExpre[indexOfNextOperation - 2]);
    Double secondOperande = Double.valueOf(splitExpre[indexOfNextOperation - 1]);

    if ("+".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(premierOperande + secondOperande);
    } else if ("-".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(premierOperande - secondOperande);
    } else if ("*".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(premierOperande * secondOperande);
    } else if ("/".equals(sign)) {
      splitExpre[indexOfNextOperation - 2] = String.valueOf(premierOperande / secondOperande);
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

  private int searchNextOperator(String[] splitExpre) {
    for (int i = 0; i < splitExpre.length; i++) {
      if (splitExpre[i].matches("[\\+\\-\\/\\*]")) {
        return i;
      }
    }

    return -1;
  }
}
