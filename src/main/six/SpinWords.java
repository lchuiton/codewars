package six;

class SpinWords {
    public String spinWords(String sentence) {
        String[] sentenceSplit = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sentenceSplit.length; i++) {
            if (i > 0) {
                result.append(" ");
            }
            StringBuilder sbTemp = new StringBuilder(sentenceSplit[i]);
            if (sbTemp.length() >= 5) {
                sbTemp = sbTemp.reverse();
            }
            result.append(sbTemp);
        }
        return result.toString();
    }
}
