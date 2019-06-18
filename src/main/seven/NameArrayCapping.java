package seven;

class NameArrayCapping {

    public static String[] capMe(String[] strings) {
        String[] result = new String[strings.length];
        for (int i = 0; i < result.length; i++) {

            if (strings[i].length() > 0) {
                result[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
            } else {
                result[i] = strings[i].toUpperCase();
            }

        }
        return result;
    }
}
