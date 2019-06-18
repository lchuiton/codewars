package four;

public class SnailSort {

    public static int[] snail(int[][] array) {
        int yMaxIndex = array.length;
        int xMaxIndex = 0;
        if (yMaxIndex > 0) {
            xMaxIndex = array[0].length;
        }
        int expectedResultSize = xMaxIndex * yMaxIndex;
        int[] result = new int[expectedResultSize];

        int cursorIndex;
        int currentYIndex = 0;
        int currentXIndex = 0;
        int resultIndex = 0;

        while (resultIndex < expectedResultSize) {
            for (cursorIndex = currentXIndex; cursorIndex < yMaxIndex; ++cursorIndex) {
                result[resultIndex] = array[currentYIndex][cursorIndex];
                resultIndex++;
            }
            currentYIndex++;

            for (cursorIndex = currentYIndex; cursorIndex < xMaxIndex; ++cursorIndex) {
                result[resultIndex] = array[cursorIndex][yMaxIndex - 1];
                resultIndex++;
            }
            yMaxIndex--;

            if (currentYIndex < xMaxIndex) {
                for (cursorIndex = yMaxIndex - 1; cursorIndex >= currentXIndex; --cursorIndex) {
                    result[resultIndex] = array[xMaxIndex - 1][cursorIndex];
                    resultIndex++;
                }
                xMaxIndex--;
            }

            if (currentXIndex < yMaxIndex) {
                for (cursorIndex = xMaxIndex - 1; cursorIndex >= currentYIndex; --cursorIndex) {
                    result[resultIndex] = array[cursorIndex][currentXIndex];
                    resultIndex++;
                }
                currentXIndex++;
            }
        }
        return result;
    }
}
