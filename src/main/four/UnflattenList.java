package four;

public class UnflattenList {

	public static Object unflatten(Object[] input, int i) {

		Object[] currentState = input;
		int pos = 0;
		for (Object object : input) {
			unflattenThisStep(input, 0);
			System.out.println(object);
		}

		// TODO Auto-generated method stub
		return currentState;
	}

	private static int calcRemainder() {
		return 0;
	}

	private static Object[] unflattenThisStep(Object[] input, int currentPosition) {

		int sizeOfCurrentInput = input.length;
		int remainder = 0;
		Object[] newArray = null;
		while (currentPosition < sizeOfCurrentInput) {
			Integer firstElement = (Integer) input[currentPosition];
			if (firstElement < (sizeOfCurrentInput - currentPosition)) {
				System.out.println("Calc remainder");
				remainder = firstElement % sizeOfCurrentInput;
			} else {
				remainder = 1;
			}

			Object[] output = new Object[remainder];
			int i = 0;
			if (remainder > 1) {

				while (currentPosition < remainder) {
					output[i] = input[currentPosition];
					i++;
					currentPosition++;
				}
			} else {
				output[0] = input[currentPosition];
			}
			if (newArray == null) {
				newArray = new Object[] { output };
			} else {
				newArray[newArray.length] = output;
			}

		}
		return newArray;
	}
}
