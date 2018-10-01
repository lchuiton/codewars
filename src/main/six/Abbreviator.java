package six;

class Abbreviator {
    public String abbreviate(String string) {
        StringBuilder sb = new StringBuilder();

        String[] words = string.split("[^a-zA-Z]+");
        String[] separators = string.split("[a-zA-Z]+");

        for (int i = 0; i < words.length; i++) {
            if (separators.length > i) {
                sb.append(separators[i]);
            }
            String mot = words[i];
            if (mot.length() > 3) {
                sb.append(mot.charAt(0));
                sb.append(mot.length() - 2);
                sb.append(mot.charAt(mot.length() - 1));
            } else {
                sb.append(mot);
            }

        }

        return sb.toString();
    }
}
