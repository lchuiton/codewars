package util;

import java.util.Random;

public class TestGenerator {

  private TypeEnum typeEnum;

  public TestGenerator(TypeEnum typeEnum) {
    this.typeEnum = typeEnum;
  }

  public void generateArrays(Integer numberOfElements) {
    switch (typeEnum) {
      case DOUBLE:
        generateDoubleArray(numberOfElements);
    }
  }

  public double[] generateDoubleArray(Integer numberOfElements) {
    Random rand = new Random(10);

    double[] result = new double[numberOfElements * 2 - 1];

    for (int i = 0; i < numberOfElements * 2; i = i + 2) {

      double value = rand.nextDouble();
      result[i] = value;
      if (i < numberOfElements * 2 - 2) {
        result[i + 1] = value;
      }
    }
    return result;
  }

  public enum TypeEnum {
    INTEGER,
    DOUBLE,
    FLOAT;
  }
}
